
package Juegos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

import Usuarios.Usuario;

public class Snake extends Juego implements ActionListener {
    private final int alturaV = 500;
    private final int anchoV = 500;
    private final int tileSize = 25;
    private Tile snakeHead;
    private Tile food;
    private Random random;
    private Timer gameloop;
    private int velocityX;
    private int velocityY;
    private int score;
    private ArrayList<Tile> snakeBody;
    private boolean alive;

    private class Tile {
        int x;
        int y;

        Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public Snake(Usuario usuario) {
        super(usuario);
        this.setPreferredSize(new Dimension(alturaV, anchoV));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.score = 0;
        alive = true;
        snakeHead = new Tile(5, 5);
        snakeBody = new ArrayList<>();
        food = new Tile(10, 10);
        random = new Random();
        placeFood();
        gameloop = new Timer(100, this);
        gameloop.start();

        // Configurar InputMap y ActionMap para manejar eventos de teclado
        setupKeyBindings();
    }

    private void setupKeyBindings() {
        InputMap inputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = getActionMap();

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "moveUp");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "moveDown");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "moveLeft");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "moveRight");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R, 0), "restart");

        actionMap.put("moveUp", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (velocityY != 1) {
                    velocityY = -1;
                    velocityX = 0;
                }
            }
        });

        actionMap.put("moveDown", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (velocityY != -1) {
                    velocityY = 1;
                    velocityX = 0;
                }
            }
        });

        actionMap.put("moveLeft", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (velocityX != 1) {
                    velocityY = 0;
                    velocityX = -1;
                }
            }
        });

        actionMap.put("moveRight", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (velocityX != -1) {
                    velocityY = 0;
                    velocityX = 1;
                }
            }
        });

        actionMap.put("restart", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!alive) {
                    restart();
                }
            }
        });
    }

    public void gameOver() {
        if (snakeHead.x > 19 || snakeHead.x < 0 || snakeHead.y > 19 || snakeHead.y < 0) {
            alive = false;
            gameloop.stop();
            rankingYPuntaje(calcularPuntuacion(), EnumJuegos.Snake, usuario);
        }

        for (int i = 1; i < snakeBody.size(); i++) {
            if (snakeBody.get(i).x == snakeHead.x && snakeBody.get(i).y == snakeHead.y) {
                alive = false;
                gameloop.stop();
                rankingYPuntaje(calcularPuntuacion(), EnumJuegos.Snake, usuario);
            }
        }
    }

    public void draw(Graphics g) {
        if (alive) {
            //Score
            g.setColor(Color.CYAN);
            g.drawString("Score: " + score, 5, 20);

            //grid
            g.setColor(Color.white);
            for (int i = 1; i <= alturaV / tileSize; i++) {
                g.drawLine(i * tileSize, 0, i * tileSize, alturaV);
                g.drawLine(0, i * tileSize, anchoV, i * tileSize);
            }

            //food
            g.setColor(Color.red);
            g.fillRect(food.x * tileSize, food.y * tileSize, tileSize, tileSize);

            //snake
            g.setColor(Color.green);
            g.fillRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize);

            if (!snakeBody.isEmpty()) {
                for (int i = snakeBody.size() - 1; i >= 0; i--) {
                    if (i == 0) {
                        g.fillRect(snakeBody.get(i).x * tileSize, snakeBody.get(i).y * tileSize, tileSize, tileSize);
                        snakeBody.get(i).x = snakeHead.x;
                        snakeBody.get(i).y = snakeHead.y;
                    } else {
                        g.fillRect(snakeBody.get(i).x * tileSize, snakeBody.get(i).y * tileSize, tileSize, tileSize);
                        snakeBody.get(i).x = snakeBody.get(i - 1).x;
                        snakeBody.get(i).y = snakeBody.get(i - 1).y;
                    }
                }
            }
        } else {
            g.setColor(Color.green);
            g.drawString("GAME OVER", 200, 200);
            g.drawString("Score= " + score, 200, 230);
            g.drawString("Presione R para reiniciar", 200, 260);
        }
    }

    public void placeFood() {
        food.x = random.nextInt(20);
        food.y = random.nextInt(20);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        comer();
        gameOver();
        repaint();
    }

    public void move() {
        snakeHead.x += velocityX;
        snakeHead.y += velocityY;
    }

    public void comer() {
        if (snakeHead.x == food.x && snakeHead.y == food.y) {
            score++;
            if (snakeBody.isEmpty())
                snakeBody.add(new Tile(snakeHead.x, snakeHead.y));
            else
                snakeBody.add(new Tile(snakeBody.get(snakeBody.size() - 1).x, snakeBody.get(snakeBody.size() - 1).y));

            placeFood();
        }
    }

    public void restart() {
        velocityX = 0;
        velocityY = 0;
        alive = true;
        snakeHead.x = 5;
        snakeHead.y = 5;
        snakeBody.clear();
        placeFood();
        score = 0;
        gameloop.start();
        repaint();
    }

    @Override
    public Long calcularPuntuacion() {
        return Long.valueOf(score) * 10;
    }

}