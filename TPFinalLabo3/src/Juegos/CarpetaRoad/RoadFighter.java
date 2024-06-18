package Juegos.CarpetaRoad;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

import Juegos.EnumJuegos;
import Juegos.Juego;
import Usuarios.Usuario;

public class RoadFighter extends Juego implements ActionListener {
    private final int dimension = 500;
    private long puntuacion = 0;

    private Random random = new Random();

    private Timer timer;
    private boolean gameOver = false;
    private boolean iniciarPartida = true;
    private boolean restart = false;
    private int playerX = 210, playerY = 370;
    private JLabel puntuacionLabel = new JLabel();
    private final int autonAncho = 45;
    private final int autoAltura = 50;

    private JPanel panelpuntuacion = new JPanel();
    private JPanel playerPanel = new JPanel();
    private JPanel supermanPanel = new JPanel();
    private JPanel autoAzulPanel1 = new JPanel();
    private JPanel autoAzulPanel2 = new JPanel();
    private JPanel autoAmarilloPanel1 = new JPanel();
    private JPanel autoAmarilloPanel2 = new JPanel();
    private JPanel autoMulticolorPanel = new JPanel();

    private String autoAmarilloUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\AutoAmarillo.png";
    private String autoAzulUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\AutoAzul.png";
    private String autoMulticolorUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\AutoMulticolor.png";
    private String autoPlayerUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\AutoPlayer.png";
    private String supermanUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\Superman.png";
    private String fondoUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\Fondo.jpg";
    private String gameOverUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\Game Over.jpg";
    private String inicioUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\Inicio.jpg";

    public RoadFighter(Usuario usuario) {
        super(usuario);
        setBounds(0, 0, dimension, dimension);
        setFocusable(true);
        setBackground(Color.RED);
        setLayout(null);
        panelpuntuacion.setOpaque(false);
        panelpuntuacion.setLayout(getLayout());

        panelpuntuacion.add(puntuacionLabel);
        puntuacionLabel.setFont(new Font("Bauhaus 93", Font.BOLD, 20));
        puntuacionLabel.setForeground(Color.WHITE);
        puntuacionLabel.setBounds(0, 0, 300, 50);

        playerPanel.setOpaque(false);
        playerPanel.setLayout(null);

        JLabel playerImagen = new JLabel(new ImageIcon((autoPlayerUbicacion)));
        playerPanel.add(playerImagen);
        playerImagen.setBounds(0, 0, autonAncho, autoAltura);

        supermanPanel.setOpaque(false);
        supermanPanel.setLayout(null);
        supermanPanel.setSize(45, 70);

        JLabel supermanImagen = new JLabel(new ImageIcon((supermanUbicacion)));
        supermanPanel.add(supermanImagen);
        supermanImagen.setBounds(0, 0, 45, 70);

        autoMulticolorPanel.setOpaque(false);
        autoMulticolorPanel.setLayout(null);

        JLabel autoMulticolorLabel = new JLabel(new ImageIcon((autoMulticolorUbicacion)));
        autoMulticolorPanel.add(autoMulticolorLabel);
        autoMulticolorLabel.setBounds(0, 0, autonAncho, autoAltura);

        JLabel autoAmarilloLabel1 = new JLabel(new ImageIcon((autoAmarilloUbicacion)));
        JLabel autoAmarilloLabel2 = new JLabel(new ImageIcon((autoAmarilloUbicacion)));

        autoAmarilloPanel1.setOpaque(false);
        autoAmarilloPanel1.setLayout(null);
        autoAmarilloPanel1.add(autoAmarilloLabel1);
        autoAmarilloLabel1.setBounds(0, 0, autonAncho, autoAltura);

        autoAmarilloPanel2.setOpaque(false);
        autoAmarilloPanel2.setLayout(null);
        autoAmarilloPanel2.add(autoAmarilloLabel2);
        autoAmarilloLabel2.setBounds(0, 0, autonAncho, autoAltura);

        JLabel autoAzulLabel1 = new JLabel(new ImageIcon((autoAzulUbicacion)));
        JLabel autoAzulLabel2 = new JLabel(new ImageIcon((autoAzulUbicacion)));

        autoAzulPanel1.setOpaque(false);
        autoAzulPanel1.setLayout(null);
        autoAzulPanel1.add(autoAzulLabel1);
        autoAzulLabel1.setBounds(0, 0, autonAncho, autoAltura);

        autoAzulPanel2.setOpaque(false);
        autoAzulPanel2.setLayout(null);
        autoAzulPanel2.add(autoAzulLabel2);
        autoAzulLabel2.setBounds(0, 0, autonAncho, autoAltura);

        timer = new Timer(1, this);

        add(panelpuntuacion);
        add(playerPanel);
        add(supermanPanel);
        add(autoMulticolorPanel);
        add(autoAmarilloPanel1);
        add(autoAmarilloPanel2);
        add(autoAzulPanel1);
        add(autoAzulPanel2);

        panelpuntuacion.setBounds(200, 0, 300, 50);
        playerPanel.setBounds(150, 400, autonAncho, autoAltura);
        supermanPanel.setBounds(0, 1000, 45, 70);
        autoMulticolorPanel.setBounds(0, 1000, autonAncho, autoAltura);
        autoAmarilloPanel1.setBounds(0, 1000, autonAncho, autoAltura);
        autoAmarilloPanel2.setBounds(0, 1000, autonAncho, autoAltura);
        autoAzulPanel1.setBounds(0, 1000, autonAncho, autoAltura);
        autoAzulPanel2.setBounds(0, 1000, autonAncho, autoAltura);

        setupKeyBindings();

        setVisible(true);
    }

    private void setupKeyBindings() {
        getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("LEFT"), "moveLeft");
        getActionMap().put("moveLeft", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!gameOver && playerX > 169) {
                    playerX -= 20;
                    playerPanel.setLocation(playerX, playerY);
                    repaint();
                }
            }
        });

        getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("RIGHT"), "moveRight");
        getActionMap().put("moveRight", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!gameOver && playerX < 320) {
                    playerX += 20;
                    playerPanel.setLocation(playerX, playerY);
                    repaint();
                }
            }
        });

        getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("SPACE"), "startGame");
        getActionMap().put("startGame", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (iniciarPartida) {
                    iniciarPartida = false;
                    setAutos(supermanPanel);
                    setAutos(autoMulticolorPanel);
                    setAutos(autoAmarilloPanel1);
                    setAutos(autoAmarilloPanel2);
                    setAutos(autoAzulPanel1);
                    setAutos(autoAzulPanel2);
                    timer.start();
                }
            }
        });

        getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("R"), "restartGame");
        getActionMap().put("restartGame", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameOver) {
                    restart();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        if (iniciarPartida) {
            g.clearRect(0, -40, dimension, dimension);
            g.drawImage(new ImageIcon((inicioUbicacion)).getImage(), 0, 0, null);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Bauhaus 93", Font.BOLD, 20));
            g.drawString("Oprima espacio para iniciar ", 105, 350);
        } else {
            g.drawImage(new ImageIcon((fondoUbicacion)).getImage(), -1, 0, null);
        }
        if (gameOver) {
            g.drawImage(new ImageIcon((gameOverUbicacion)).getImage(), 155, 100, null);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Bauhaus 93", Font.BOLD, 20));
            g.drawString("Oprima R para reiniciar ", 150, 450);
        }
        if (restart) {
            g.clearRect(0, -40, dimension, dimension);
        }
    }

    private void setAutos(JPanel panel) {
        int i = random.nextInt(151);
        int j = random.nextInt(2000);
        panel.setLocation(i + 169, j);
    }

    private boolean colisions(JPanel panel) {
        if (playerPanel.getBounds().intersects(panel.getBounds())) {
            System.out.println("¡Colisión detectada!");
            return true;
        }
        return false;
    }

    private boolean allColisions() {
        if (colisions(autoMulticolorPanel) | colisions(autoMulticolorPanel) | colisions(autoMulticolorPanel) |
            colisions(autoAmarilloPanel1) | colisions(autoAmarilloPanel2) | colisions(autoAzulPanel1) |
            colisions(autoAzulPanel2) | colisions(supermanPanel)) {
            return true;
        }
        return false;
    }

    public Long calcularPuntuacion() {
        return puntuacion / 10;
    }

    private void moveEnemigos(JPanel panel) {
        panel.setLocation(panel.getX(), panel.getY() + 3);
        if (panel.getY() > 2000) {
            int i = random.nextInt(151);
            panel.setLocation(i + 169, 0);
        }
    }

    public void restart() {
        timer.restart();
        setAutos(supermanPanel);
        setAutos(autoMulticolorPanel);
        setAutos(autoAmarilloPanel1);
        setAutos(autoAmarilloPanel2);
        setAutos(autoAzulPanel1);
        setAutos(autoAzulPanel2);
        gameOver = false;
        restart = false;
    }

    private void gameOver() {
        if (allColisions()) {
            gameOver = true;
            timer.stop();
            rankingYPuntaje(calcularPuntuacion(), EnumJuegos.Road, usuario);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        moveEnemigos(autoMulticolorPanel);
        moveEnemigos(autoAmarilloPanel1);
        moveEnemigos(autoAmarilloPanel2);
        moveEnemigos(autoAzulPanel1);
        moveEnemigos(autoAzulPanel2);
        moveEnemigos(supermanPanel);
        allColisions();
        gameOver();
        repaint();
        puntuacionLabel.setText("Puntaje: " + puntuacion);
        puntuacion++;
    }
}


/*import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

import Juegos.EnumJuegos;
import Juegos.Juego;
import Usuarios.Usuario;

public class RoadFighter extends Juego implements ActionListener,KeyListener{
    private final int dimension = 500;
    private long puntuacion = 0;

    private Random random = new Random();

    private Timer timer;
    private boolean gameOver = false;
    private boolean restart = false;
    private boolean iniciarPartida = true;
    private int playerX= 210, playerY= 370;
    private JLabel puntuacionLabel = new JLabel();
    private final int autonAncho = 45;
    private final int autoAltura = 50;

    private JPanel panelpuntuacion = new JPanel();
    private JPanel playerPanel = new JPanel();
    private JPanel supermanPanel = new JPanel();
    private JPanel autoAzulPanel1 = new JPanel();
    private JPanel autoAzulPanel2 = new JPanel();
    private JPanel autoAmarilloPanel1 = new JPanel();
    private JPanel autoAmarilloPanel2 = new JPanel();
    private JPanel autoMulticolorPanel = new JPanel();

    private String autoAmarilloUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\AutoAmarillo.png";
    private String autoAzulUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\AutoAzul.png";
    private String autoMulticolorUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\AutoMulticolor.png";
    private String autoPlayerUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\AutoPlayer.png";
    private String supermanUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\Superman.png";
    private String fondoUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\Fondo.jpg";
    private String gameOverUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\Game Over.jpg";
    private String inicioUbicacion = "src\\Juegos\\CarpetaRoad\\Imagenes\\Inicio.jpg";



    public RoadFighter(Usuario usuario){
        super(usuario);
        setBounds(0, 0, dimension, dimension);
        setFocusable(true);
        setBackground(Color.RED);
        setLayout(null);
        panelpuntuacion.setOpaque(false);
        panelpuntuacion.setLayout(getLayout());

        panelpuntuacion.add(puntuacionLabel);
        puntuacionLabel.setFont(new Font("Bauhaus 93", Font.BOLD, 20));
        puntuacionLabel.setForeground(Color.WHITE);
        puntuacionLabel.setBounds(0, 0, 300, 50);



        playerPanel.setOpaque(false);
        playerPanel.setLayout(null);

        JLabel playerImagen = new JLabel(new ImageIcon((autoPlayerUbicacion)));
        playerPanel.add(playerImagen);
        playerImagen.setBounds(0, 0,autonAncho, autoAltura);

        supermanPanel.setOpaque(false);
        supermanPanel.setLayout(null);
        supermanPanel.setSize(45, 70);

        JLabel supermanImagen = new JLabel(new ImageIcon((supermanUbicacion)));
        supermanPanel.add(supermanImagen);
        supermanImagen.setBounds(0, 0, 45, 70);

        autoMulticolorPanel.setOpaque(false);
        autoMulticolorPanel.setLayout(null);

        JLabel autoMulticolorLabel = new JLabel(new ImageIcon((autoMulticolorUbicacion)));
        autoMulticolorPanel.add(autoMulticolorLabel);
        autoMulticolorLabel.setBounds(0, 0, autonAncho, autoAltura);

        JLabel autoAmarilloLabel1 = new JLabel(new ImageIcon((autoAmarilloUbicacion)));
        JLabel autoAmarilloLabel2 = new JLabel(new ImageIcon((autoAmarilloUbicacion)));

        autoAmarilloPanel1.setOpaque(false);
        autoAmarilloPanel1.setLayout(null);
        autoAmarilloPanel1.add(autoAmarilloLabel1);
        autoAmarilloLabel1.setBounds(0, 0, autonAncho, autoAltura);
        

        autoAmarilloPanel2.setOpaque(false);
        autoAmarilloPanel2.setLayout(null);
        autoAmarilloPanel2.add(autoAmarilloLabel2);
        autoAmarilloLabel2.setBounds(0, 0, autonAncho, autoAltura);

        

        JLabel autoAzulLabel1 = new JLabel(new ImageIcon((autoAzulUbicacion)));
        JLabel autoAzulLabel2 = new JLabel(new ImageIcon((autoAzulUbicacion)));

        autoAzulPanel1.setOpaque(false);
        autoAzulPanel1.setLayout(null);
        autoAzulPanel1.add(autoAzulLabel1);
        autoAzulLabel1.setBounds(0, 0, autonAncho, autoAltura);


        autoAzulPanel2.setOpaque(false);
        autoAzulPanel2.setLayout(null);
        autoAzulPanel2.add(autoAzulLabel2);
        autoAzulLabel2.setBounds(0, 0, autonAncho, autoAltura);



        timer = new Timer(1, this);
        
        add(panelpuntuacion);
        add(playerPanel);
        add(supermanPanel);
        add(autoMulticolorPanel);
        add(autoAmarilloPanel1);
        add(autoAmarilloPanel2);
        add(autoAzulPanel1);
        add(autoAzulPanel1);

        panelpuntuacion.setBounds(200, 0, 300, 50);
        playerPanel.setBounds(150, 400, autonAncho, autoAltura);
        supermanPanel.setBounds(0,1000,45,70);
        autoMulticolorPanel.setBounds(0,1000,autonAncho, autoAltura);
        autoAmarilloPanel1.setBounds(0,1000,autonAncho, autoAltura);
        autoAmarilloPanel2.setBounds(0,1000,autonAncho, autoAltura);
        autoAzulPanel1.setBounds(0,1000,autonAncho, autoAltura);
        autoAzulPanel2.setBounds(0,1000,autonAncho, autoAltura);

        addKeyListener(this);
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
            g.drawImage(new ImageIcon((inicioUbicacion)).getImage(), 0,0 , null);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Bauhaus 93", Font.BOLD, 20));
            g.drawString("Oprima espacio para iniciar " , 105, 350);
        }else{
            g.drawImage(new ImageIcon((fondoUbicacion)).getImage(), -1,0 , null);
        }
        if (gameOver) {
            g.drawImage(new ImageIcon((gameOverUbicacion)).getImage(), 155,100 , null);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Bauhaus 93", Font.BOLD, 20));
            g.drawString("Oprima R para reiniciar " , 150, 450);
        }
        if (restart) {
            g.clearRect(0, -40, dimension, dimension);   
        }
        
    }

    private void setAutos(JPanel panel){
        int i = random.nextInt(151);
        int j = random.nextInt(2000);
        panel.setLocation(i+169,j);
    }
 
    private boolean colisions(JPanel panel){
      if (playerPanel.getBounds().intersects(panel.getBounds())) {
        System.out.println("¡Colisión detectada!");
        return true;
      }  
      return false;
    }

    private boolean allColisions(){  
        if (colisions(autoMulticolorPanel) | colisions(autoMulticolorPanel) | colisions(autoMulticolorPanel) | 
        colisions(autoAmarilloPanel1) | colisions(autoAmarilloPanel2) | colisions(autoAzulPanel1) | 
        colisions(autoAzulPanel2) | colisions(supermanPanel)) {
            return true;
        }
        return false;
    }

    public Long calcularPuntuacion(){
        return puntuacion/10;
    }

    private void moveEnemigos(JPanel panel){
        panel.setLocation(panel.getX(), panel.getY()+3);
        if (panel.getY() > 2000 ) {
            int i = random.nextInt(151);
            panel.setLocation(i+169,0);
        }
    }

    public void restart(){
        timer.restart();
        setAutos(supermanPanel);
        setAutos(autoMulticolorPanel);
        setAutos(autoAmarilloPanel1);
        setAutos(autoAmarilloPanel2);
        setAutos(autoAzulPanel1);
        setAutos(autoAzulPanel2);
        gameOver = false;
        restart = false;
    }

    private void gameOver(){
        if (allColisions()) {
            gameOver = true;
            timer.stop();
            rankingYPuntaje(calcularPuntuacion(), EnumJuegos.Road, usuario);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        moveEnemigos(autoMulticolorPanel);
        moveEnemigos(autoAmarilloPanel1);
        moveEnemigos(autoAmarilloPanel2);
        moveEnemigos(autoAzulPanel1);
        moveEnemigos(autoAzulPanel2);
        moveEnemigos(supermanPanel);
        allColisions();
        gameOver();
        repaint(); 
        puntuacionLabel.setText("Puntaje: " + puntuacion);
        puntuacion ++;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (!gameOver) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
            if (playerX > 169) {
                playerX -= 20;
            }
                break;
        
            case KeyEvent.VK_RIGHT:
            if (playerX < 320) {
                playerX += 20;
            }
                break;
            }
        }
        if (gameOver) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_R:
                restart(); 
                break;
            } 
        }
        if (iniciarPartida) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                System.out.println("hola");
                iniciarPartida = false;
                setAutos(supermanPanel);
                setAutos(autoMulticolorPanel);
                setAutos(autoAmarilloPanel1);
                setAutos(autoAmarilloPanel2);
                setAutos(autoAzulPanel1);
                setAutos(autoAzulPanel2);
                timer.start();
            } 
        }
        playerPanel.setLocation(playerX, playerY);
        repaint();

        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.console();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
 
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }
}*/
