package Juegos.CarpetaDinosaurio;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

import Juegos.Juego;
import Usuarios.Usuario;

public class ChromeDinosaurio extends Juego implements ActionListener {
    int anchoTablero = 500;
    int altoTablero = 500;

    //Imagenes
    Image dinosaurioImg;
    Image dinosaurioMuertoImg;
    Image dinosaurioSaltaImg;
    Image cactus1Img;
    Image cactus2Img;
    Image cactus3Img;

    class Bloque {
        int x;
        int y;
        int ancho;
        int alto;
        Image img;

        Bloque(int x, int y, int ancho, int alto, Image img) {
            this.x = x;
            this.y = y;
            this.ancho = ancho;
            this.alto = alto;
            this.img = img;
        }
    }

    //Dinosaurio
    int dinosaurioAncho = 88;
    int dinosaurioAlto = 94;
    int dinosaurioX = 50;
    int dinosaurioY = altoTablero - dinosaurioAlto;

    Bloque dinosaurio;

    //Cactus
    int cactus1Ancho = 34;
    int cactus2Ancho = 69;
    int cactus3Ancho = 102;

    int cactusAlto = 70;
    int cactusX = 450;
    int cactusY = altoTablero - cactusAlto;
    ArrayList<Bloque> cactusArreglo;

    //Fisica
    int velocidadX = -12; //Velocidad del cactus yendo a la izquierda
    int velocidadY = 0; //Velocidad salto dinosaurio
    int gravedad = 1;

    boolean gameOver = false;
    int score = 0;

    Timer gameLoop;
    Timer colocarCactusTimer;

    public ChromeDinosaurio(Usuario usuario) {
        super(usuario);
        setPreferredSize(new Dimension(anchoTablero, altoTablero));
        setBackground(Color.LIGHT_GRAY);
        setFocusable(true);

        dinosaurioImg = new ImageIcon("src/Juegos/CarpetaDinosaurio/img/dino-run.gif").getImage();
        dinosaurioMuertoImg = new ImageIcon("src/Juegos/CarpetaDinosaurio/img/dino-dead.png").getImage();
        dinosaurioSaltaImg = new ImageIcon(("src/Juegos/CarpetaDinosaurio/img/dino-jump.png")).getImage();
        cactus1Img = new ImageIcon(("src/Juegos/CarpetaDinosaurio/img/cactus1.png")).getImage();
        cactus2Img = new ImageIcon(("src/Juegos/CarpetaDinosaurio/img/cactus2.png")).getImage();
        cactus3Img = new ImageIcon(("src/Juegos/CarpetaDinosaurio/img/cactus3.png")).getImage();

        //Dinosaurio
        dinosaurio = new Bloque(dinosaurioX, dinosaurioY, dinosaurioAncho, dinosaurioAlto, dinosaurioImg);
        //Cactus
        cactusArreglo = new ArrayList<Bloque>();

        //Game Timer
        gameLoop = new Timer(1000 / 60, this); //1000/60 = 60 frames per 1000ms(1s), update
        gameLoop.start();

        //Colocar cactus timer
        colocarCactusTimer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colocarCactus();
            }
        });
        colocarCactusTimer.start();

        // Configurar InputMap y ActionMap para manejar eventos de teclado
        setupKeyBindings();
    }

    private void setupKeyBindings() {
        InputMap inputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = getActionMap();

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0), "jump");
        actionMap.put("jump", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dinosaurio.y == dinosaurioY) {
                    velocidadY = -17;
                    dinosaurio.img = dinosaurioSaltaImg;
                }

                if (gameOver) {
                    restart();
                }
            }
        });
    }

    void colocarCactus() {
        if (gameOver) {
            return;
        }
        double colocarCactusChance = Math.random(); // 0 - 0.999999
        if (colocarCactusChance > .90) { //10% chance que te salga cactus3
            Bloque cactus = new Bloque(cactusX, cactusY, cactus3Ancho, cactusAlto, cactus3Img);
            cactusArreglo.add(cactus);
        } else if (colocarCactusChance > .70) { //20% chance que te salga cactus2
            Bloque cactus = new Bloque(cactusX, cactusY, cactus2Ancho, cactusAlto, cactus2Img);
            cactusArreglo.add(cactus);
        } else if (colocarCactusChance > .50) { //20% chance que te salga cactus1
            Bloque cactus = new Bloque(cactusX, cactusY, cactus1Ancho, cactusAlto, cactus1Img);
            cactusArreglo.add(cactus);
        }

        if (cactusArreglo.size() > 10) {
            cactusArreglo.remove(0); //saca el primer cactus del arraylist
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        //dinosaurio
        g.drawImage(dinosaurio.img, dinosaurio.x, dinosaurio.y, dinosaurio.ancho, dinosaurio.alto, null);

        //cactus
        for (int i = 0; i < cactusArreglo.size(); i++) {
            Bloque cactus = cactusArreglo.get(i);
            g.drawImage(cactus.img, cactus.x, cactus.y, cactus.ancho, cactus.alto, null);
        }

        //score
        g.setColor(Color.BLACK);
        g.setFont(new Font("Courier", Font.PLAIN, 32));
        if (gameOver) {
            g.drawString("Game Over: " + String.valueOf(score), 10, 35);
        } else {
            g.drawString(String.valueOf(score), 10, 35);
        }
    }

    public void move() {
        //dinosaurio
        velocidadY += gravedad;
        dinosaurio.y += velocidadY;

        if (dinosaurio.y > dinosaurioY) {
            dinosaurio.y = dinosaurioY;
            velocidadY = 0;
            dinosaurio.img = dinosaurioImg;
        }

        //cactus 
        for (int i = 0; i < cactusArreglo.size(); i++) {
            Bloque cactus = cactusArreglo.get(i);
            cactus.x += velocidadX;

            if (collision(dinosaurio, cactus)) {
                gameOver = true;
                dinosaurio.img = dinosaurioMuertoImg;

            }
        }

        //score
        score++;

    }

    public void restart() {
        dinosaurio.y = dinosaurioY;
        dinosaurio.img = dinosaurioImg;
        velocidadY = 0;
        cactusArreglo.clear();
        score = 0;
        gameOver = false;
        gameLoop.start();
        colocarCactusTimer.start();
    }

    boolean collision(Bloque a, Bloque b) {
        return a.x < b.x + b.ancho &&
                a.x + a.ancho > b.x &&
                a.y < b.y + b.alto &&
                a.y + a.alto > b.y;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
        if (gameOver) {
            colocarCactusTimer.stop();
            gameLoop.stop();
        }
    }

    @Override
    public Long calcularPuntuacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPuntuacion'");
    }
}