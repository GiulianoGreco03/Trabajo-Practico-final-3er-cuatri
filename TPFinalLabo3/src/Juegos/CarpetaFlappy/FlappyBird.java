package Juegos.CarpetaFlappy;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

import Juegos.EnumJuegos;
import Juegos.Juego;
import Usuarios.Usuario;

public class FlappyBird extends Juego implements ActionListener {
    int anchoTablero = 500;
    int altoTablero = 500;

    //Imagenes
    Image backgroundImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;

    //Bird
    int birdX = anchoTablero / 8;
    int birdY = altoTablero / 2;
    int anchoBird = 34;
    int altoBird = 24;

    class Bird {
        int x = birdX;
        int y = birdY;
        int ancho = anchoBird;
        int alto = altoBird;
        Image img;

        Bird(Image img) {
            this.img = img;
        }
    }

    //pipes
    int pipeX = anchoBird + 650;
    int pipeY = 0;
    int pipeAncho = 64; //escalado por 1/6
    int pipeAlto = 380;

    class Pipe {
        int x = pipeX;
        int y = pipeY;
        int ancho = pipeAncho;
        int alto = pipeAlto;
        Image img;
        boolean passed = false;

        Pipe(Image img) {
            this.img = img;
        }
    }

    //game logic
    Bird bird;
    int velocidadX = -4; //mueve las pipe a la izquierda (simulando el movimiento del bird)
    int velocidadY = 0;
    int gravedad = 1;

    ArrayList<Pipe> pipes;
    Random random = new Random();

    Timer gameLoop;
    Timer colocarPipesTimer;
    boolean gameOver = false;
    Long score = 0l;

    public FlappyBird(Usuario usuario) {
        super(usuario);
        setPreferredSize(new Dimension(anchoTablero, altoTablero));
        setFocusable(true);

        //Carga imagenes
        backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

        //bird
        bird = new Bird(birdImg);
        pipes = new ArrayList<>();

        //colocar pipes timer
        colocarPipesTimer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colocarPipes();
            }
        });
        colocarPipesTimer.start();

        //game timer
        gameLoop = new Timer(1000 / 60, this); //1000/60 = 16.6
        gameLoop.start();

        // Configurar InputMap y ActionMap para manejar eventos de teclado
        setupKeyBindings();
    }

    private void setupKeyBindings() {
        InputMap inputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = getActionMap();

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0), "flap");
        actionMap.put("flap", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!gameOver) {
                    velocidadY = -9;
                }
                if (gameOver) {  
                    restart();
                   
                }
            }
        });
    }

    public void colocarPipes() {
        int randomPipeY = (int) (pipeY - pipeAlto / 4 - Math.random() * (pipeAlto / 2));
        int aperturaEspacio = altoTablero / 4;

        Pipe topPipe = new Pipe(topPipeImg);
        topPipe.y = randomPipeY;
        pipes.add(topPipe);

        Pipe bottomPipe = new Pipe(bottomPipeImg);
        bottomPipe.y = topPipe.y + pipeAlto + aperturaEspacio;
        pipes.add(bottomPipe);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        //background
        g.drawImage(backgroundImg, 0, -350, null);

        //bird
        g.drawImage(bird.img, bird.x, bird.y, bird.ancho, bird.alto, null);

        //pipes
        for (Pipe pipe : pipes) {
            g.drawImage(pipe.img, pipe.x, pipe.y, pipe.ancho, pipe.alto, null);
        }

        //score
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.PLAIN, 32));
        if (gameOver) {
            g.drawString("Game Over: " +  score, 10, 35);
        } else {
            g.drawString(String.valueOf( score), 10, 35);
        }
    }

    public void mover() {
        //bird
        velocidadY += gravedad;
        bird.y += velocidadY;
        bird.y = Math.max(bird.y, 0);

        //pipes
        for (Pipe pipe : pipes) {
            pipe.x += velocidadX;

            if (!pipe.passed && bird.x > pipe.x + pipe.ancho) {
                pipe.passed = true;
                score += 1; 
            }

            if (collision(bird, pipe)) {
                gameOver = true;
            }
        }

        if (bird.y > altoTablero) {
            gameOver = true;
        }
    }

    public boolean collision(Bird a, Pipe b) {
        return a.x < b.x + b.ancho &&
                a.x + a.ancho > b.x &&
                a.y < b.y + b.alto &&
                a.y + a.alto > b.y;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mover();
        repaint();
        if (gameOver) {
            colocarPipesTimer.stop();
            gameLoop.stop();
            rankingYPuntaje(calcularPuntuacion(), EnumJuegos.Flappy, usuario);
        }
    }

    @Override
    public void restart() {
        bird.y = birdY;
        velocidadY = 0;
        pipes.clear();
        score = 0l;
        gameOver = false;
        gameLoop.start();
        colocarPipesTimer.start();
    }

    @Override
    public Long calcularPuntuacion() {
        return (Long)((score) * 5);
    }
}


