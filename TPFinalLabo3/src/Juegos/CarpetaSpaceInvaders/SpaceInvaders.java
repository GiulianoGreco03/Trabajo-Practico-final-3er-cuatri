package Juegos.CarpetaSpaceInvaders;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

import Juegos.EnumJuegos;
import Juegos.Juego;
import Usuarios.Usuario;

public class SpaceInvaders extends Juego implements ActionListener{
    private final int dimension = 500;
    private long puntuacion = 0;
    private int vidas = 3;

    private Timer timer;
    private boolean restart = false;
    private boolean iniciarPartida = true;
    private int playerX= 210, playerY= 370;
    private boolean[][] aliens;
    private JLabel puntuacionLabel = new JLabel("Puntaje: " + puntuacion);
    private JPanel vidasPanel = new JPanel();
    private final int corazonAncho = 26;
    private final int corazonAltura = 28;
    private final int colarozGap = 5;
    private JPanel aliensPanel = new JPanel();
    private JPanel navePanel = new JPanel();
    private JPanel balapanel = new JPanel();
    private JPanel balaAlienPanel1 = new JPanel();
    private JPanel balaAlienPanel2 = new JPanel();
    private JPanel balaAlienPanel3 = new JPanel();

    private int balaAncho = 10;
    private int balaAlto = 20;
    private final int filasAliens = 4;
    private final int columnasAliens = 6;
    private final int alienAncho = 55;
    private final int alienAltura = 55;
    private final int alienGap = 1;
    private int alienDireccion = 2;
    private int topeAbajoAliens = 0;
    private boolean abajo = true;


    private String corazonUbicacion = "src\\Juegos\\CarpetaSpaceInvaders\\Imagenes\\Corazon.png";
    private String naveUbicacion = "src\\Juegos\\CarpetaSpaceInvaders\\Imagenes\\Nave.png";
    private String alienUbicacion = "src\\Juegos\\CarpetaSpaceInvaders\\Imagenes\\Alien.png";
    private String fondoUbicacion = "src\\Juegos\\CarpetaSpaceInvaders\\Imagenes\\Fondo.jpg";
    private String balaUbicacion = "src\\Juegos\\CarpetaSpaceInvaders\\Imagenes\\BalaNave.png";
    private String balaAlienUbicacion = "src\\Juegos\\CarpetaSpaceInvaders\\Imagenes\\BalaAlien.png";
    private String gameOverUbicacion = "src\\Juegos\\CarpetaSpaceInvaders\\Imagenes\\GameOver.png";
    private String inicioUbicacion = "src\\Juegos\\CarpetaSpaceInvaders\\Imagenes\\Inicio.jpg";


    public SpaceInvaders(Usuario usuario){
        super(usuario);
    
        setBounds(0, 0, dimension, dimension);
        setFocusable(true);
        setBackground(Color.RED);
        setLayout(null);

        vidasPanel.setOpaque(false);
        vidasPanel.setLayout(null);
        addCorazonToPanel();

        navePanel.setOpaque(false);
        navePanel.setLayout(null);
        gameOver = false;

        JLabel naveImagen = new JLabel(new ImageIcon(naveUbicacion));
        naveImagen.setBounds(0, 0, 50, 50);
        navePanel.add(naveImagen);

        balapanel.setOpaque(false);
        balapanel.setLayout(null);

        JLabel balaImagen = new JLabel(new ImageIcon(balaUbicacion));
        balaImagen.setBounds(0, 0, 9, 33);
        balapanel.add(balaImagen);

        aliensPanel.setOpaque(false);
        aliensPanel.setLayout(new GridLayout(filasAliens,columnasAliens,alienGap,alienGap));
        

        aliens = new boolean[filasAliens][columnasAliens];
        for (int fila = 0; fila < filasAliens; fila++) {
            for (int colum = 0; colum < columnasAliens; colum++) {
                aliens[fila][colum] = true;
            }
        }

        JLabel balaAlienImagen1 = new JLabel(new ImageIcon(balaAlienUbicacion));
        JLabel balaAlienImagen2 = new JLabel(new ImageIcon(balaAlienUbicacion));
        JLabel balaAlienImagen3 = new JLabel(new ImageIcon(balaAlienUbicacion));

        balaAlienPanel1.setOpaque(false);
        balaAlienPanel1.setLayout(null);
        balaAlienPanel1.add(balaAlienImagen1);
        balaAlienImagen1.setBounds(0, 0, balaAncho, balaAlto);

        balaAlienPanel2.setOpaque(false);
        balaAlienPanel2.setLayout(null);
        balaAlienPanel2.add(balaAlienImagen2);
        balaAlienImagen2.setBounds(0, 0, balaAncho, balaAlto);

        balaAlienPanel3.setOpaque(false);
        balaAlienPanel3.setLayout(null);
        balaAlienPanel3.add(balaAlienImagen3);
        balaAlienImagen3.setBounds(0, 0, balaAncho, balaAlto);

        
        puntuacionLabel.setBounds(350, 415, 150, 50);
        puntuacionLabel.setFont(new Font("Bauhaus 93", Font.BOLD, 20));
        puntuacionLabel.setForeground(Color.WHITE);

        timer = new Timer(10, this);
        
        add(vidasPanel);
        add(navePanel);
        add(aliensPanel);
        add(balapanel);
        add(puntuacionLabel);
        add(balaAlienPanel1);
        add(balaAlienPanel2);
        add(balaAlienPanel3);
        
        vidasPanel.setBounds(10, 425, 110, 50);
        aliensPanel.setBounds(0,0,alienAncho*columnasAliens*alienGap,alienAltura*filasAliens*alienGap);
        navePanel.setBounds(playerX, playerY, 65, 65);
        balapanel.setBounds(playerX+21,playerY-40, 30, 40);
        balaAlienPanel1.setBounds(0, 0, balaAncho, balaAlto);
        balaAlienPanel2.setBounds(50, 0, balaAncho, balaAlto);
        balaAlienPanel3.setBounds(100, 0, balaAncho, balaAlto);

        balaAlienReset(balaAlienPanel1);
        balaAlienReset(balaAlienPanel2);
        balaAlienReset(balaAlienPanel3);

        configureKeyBindings();
        setFocusable(true);

        setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g){
        if (iniciarPartida) {
            g.clearRect(0, -40, dimension, dimension);
            g.drawImage(new ImageIcon(inicioUbicacion).getImage(), 0,0 , null);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Bauhaus 93", Font.BOLD, 20));
            g.drawString("Oprima espacio para iniciar " , 105, 290);
        }else{
            g.drawImage(new ImageIcon(fondoUbicacion).getImage(), -1,0 , null);
        }
        if (gameOver) {
            g.drawImage(new ImageIcon(gameOverUbicacion).getImage(), -20,100 , null);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Bauhaus 93", Font.BOLD, 20));
            g.drawString("Oprima R para reiniciar " , 110, 450);
        }
        if (restart) {
            g.clearRect(0, -40, dimension, dimension);   
        }
        
    }

    private void addCorazonToPanel(){
        for (int colum = 0; colum < 3; colum++) {
                JLabel vidaLabel = new JLabel(new ImageIcon("src\\Juegos\\CarpetaSpaceInvaders\\Imagenes\\Corazon.png"));
                
                int vidaX = colum * (corazonAncho + colarozGap);
                vidasPanel.add(vidaLabel);
                vidaLabel.setBounds(vidaX, 0, corazonAncho, corazonAltura);
        }
    }

    private void removeCorazon(){
        Component[] components = vidasPanel.getComponents();
        JLabel emptyLabel = new JLabel();
        vidasPanel.add(emptyLabel, vidas-1); 
        vidasPanel.remove(components[vidas-1]);

        // Es importante revalidar y repintar el panel después de remover un componente
        vidasPanel.revalidate();
        vidasPanel.repaint();
    } 

    private Rectangle getAliensBounds(int fila, int columna) {
        int x = columna * (alienAncho + alienGap);
        int y = fila * (alienAltura + alienGap);
        return new Rectangle(x+(int)(aliensPanel.getX()),y+ (int)(aliensPanel.getY()) , alienAncho, alienAltura); // Ajusta según el tamaño de la imagen de los aliens
    }

    //  

    private void removeAlienLabel(int fila, int columna) {
        Component[] components = aliensPanel.getComponents();
        int index =  fila  * columnasAliens + columna  ;
        if (index >= 0 && index < components.length) {
            JLabel emptyLabel = new JLabel();
            aliensPanel.add(emptyLabel, index); 
            aliensPanel.remove(components[index]);
        }
        // Es importante revalidar y repintar el panel después de remover un componente
        aliensPanel.revalidate();
        aliensPanel.repaint();
    }

    private void colisionAliens(){
        for (int fila = 0; fila < filasAliens; fila++) {
            for (int columna = 0; columna < columnasAliens; columna++) {
                if (aliens[fila][columna]) { // Solo verificar si el alien está presente
                    Rectangle alienBounds = getAliensBounds(fila, columna);
    
                    // Verificar si hay intersección entre los límites de la nave y el alien
                    if (balapanel.getBounds().intersects(alienBounds)  & aliens[fila][columna]) {
                        // Aquí manejas lo que sucede cuando hay una colisión
                        // Por ejemplo, podrías hacer que el juego termine o que se pierda una vida
                        System.out.println("¡Colisión detectada!");
                        aliens[fila][columna] = false;
                        removeAlienLabel(fila, columna);
                        balapanel.setLocation(playerX+21,playerY-40);
                        puntuacion += 25;
                        puntuacionLabel.setText("Puntaje: " + puntuacion);
                        // Ejemplo: reiniciar el juego o mostrar un mensaje de pérdida
                    }
                }
            }
        }
    }

    private boolean checkAliens(){
        boolean flag = true;
        for (int fila = 0; fila < filasAliens; fila++) {
            for (int colum = 0; colum < columnasAliens; colum++) {
                if (aliens[fila][colum]) {
                    flag = false;
                }
            }
        }
        return flag;
    }

    /*public Long calcularPuntuacion(){

    }*/

    private void moveBala(){
        balapanel.setLocation(balapanel.getX(), balapanel.getY()-3);
        if (balapanel.getY() == 0 ) {
            balapanel.setLocation(playerX+21,playerY-40);
        }
    }

    private void addAliensToPanel() {
        for (int fila = 0; fila < filasAliens; fila++) {
            for (int colum = 0; colum < columnasAliens; colum++) {
                JLabel alienLabel = new JLabel(new ImageIcon(alienUbicacion));
                int alienX = colum * (alienAncho + alienGap);
                int alieny = fila * (alienAltura + alienGap);
                alienLabel.setLocation(alienX, alieny);
                aliensPanel.add(alienLabel);
            }
        }
    }

    private void moveAliensPanel() {
        // Mover el panel de aliens horizontalmente
        
        aliensPanel.setLocation(aliensPanel.getX() + alienDireccion, aliensPanel.getY());

        // Verificar límites horizontales
        if (aliensPanel.getX() <= 0 || aliensPanel.getX() + aliensPanel.getWidth() + 15 > dimension) {
            if(abajo){
            alienDireccion *= -1;
            moveAliensDown();
            }else{
            alienDireccion *= -1;
            moveAliensUp();
            }
        }
    }

    private void moveAliensDown() {
        // Mover el panel de aliens hacia abajo
        if (topeAbajoAliens < 3) {
            aliensPanel.setLocation(aliensPanel.getX(), aliensPanel.getY() + (alienAltura/2));
            topeAbajoAliens++;
        }else{
            abajo = false;
        }
        
    }

    private void moveAliensUp() {
        // Mover el panel de aliens hacia arriba
        if (topeAbajoAliens > 0) {
            aliensPanel.setLocation(aliensPanel.getX(), aliensPanel.getY() - (alienAltura/2));
            topeAbajoAliens--;
        }else{
            abajo = true;
        }
        
    }

    private void balaAlienReset(JPanel bala){
        Random random = new Random();
        int nrandom = random.nextInt(25);
        for (int fila = 0; fila < filasAliens; fila++) {
            for (int colum = 0; colum < columnasAliens; colum++) {
                if ( fila  * columnasAliens + colum == nrandom) {
                Rectangle alienBounds = getAliensBounds(fila, colum);
                bala.setLocation(alienBounds.x + (alienAncho/2), alienBounds.y+alienAltura);   
                }
            }
        }
    }

    private void moveBalasAlien(JPanel bala){
        bala.setLocation(bala.getX(), bala.getY()+3);
        if (bala.getY() >= 500 ) {
            balaAlienReset(bala);
        }
        if (bala.getBounds().intersects(navePanel.getBounds())) {
            balaAlienReset(bala);
            removeCorazon();
            vidas--;
        }
    }

    @Override
    public void restart(){
        timer.restart();
        gameOver = false;
        puntuacion = 0;
        for (int fila = 0; fila < filasAliens; fila++) {
            for (int colum = 0; colum < columnasAliens; colum++) {
                aliens[fila][colum] = true;
            }
        }
        aliensPanel.removeAll();
        addAliensToPanel();
        vidasPanel.removeAll();
        addCorazonToPanel();
        vidas = 3;
    }

    private void gameOver(){
        if (vidas == 0 || checkAliens()) {
            gameOver = true;
            timer.stop();
            rankingYPuntaje(calcularPuntuacion(), EnumJuegos.Galaga, usuario);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        moveBala();
        moveAliensPanel();
        colisionAliens();
        moveBalasAlien(balaAlienPanel1);
        moveBalasAlien(balaAlienPanel2);
        moveBalasAlien(balaAlienPanel3);
        gameOver();
        repaint(); 
    }

    private void configureKeyBindings() {
        InputMap inputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = getActionMap();

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "moveLeft");
        actionMap.put("moveLeft", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!gameOver && playerX > 10) {
                    playerX -= 20;
                    navePanel.setLocation(playerX, playerY);
                    repaint();
                }
            }
        });

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "moveRight");
        actionMap.put("moveRight", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!gameOver && playerX < 415) {
                    playerX += 20;
                    navePanel.setLocation(playerX, playerY);
                    repaint();
                }
            }
        });

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0), "startGame");
        actionMap.put("startGame", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (iniciarPartida) {
                    addAliensToPanel();
                    iniciarPartida = false;
                    timer.start();
                }
            }
        });

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R, 0), "restartGame");
        actionMap.put("restartGame", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameOver) {
                    restart();
                }
            }
        });

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "exit");
        actionMap.put("exit", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.console();
            }
        });
    }

   

    @Override
    public Long calcularPuntuacion() {
        return puntuacion;
    }

    

    
    
}
