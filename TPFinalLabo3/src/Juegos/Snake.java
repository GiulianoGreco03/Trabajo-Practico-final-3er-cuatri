
package Juegos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;


public class Snake extends JPanel implements ActionListener, KeyListener{

    private int alturaV;
    private int anchoV;
    private final int tileSize = 25;
    private Tile snakeHead;
    private Tile food;
    private Random random;
    private Timer gameloop;
    private int velocityX;
    private int velocityY;
    private KeyEvent tecla;
    private int score;
    private ArrayList<Tile> snakeBody;
    private boolean alive;

    private class Tile{
        int x;
        int y;

        Tile(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

   
    
    public Snake(int alturaV, int anchoV){
        this.alturaV = alturaV;
        this.anchoV =  anchoV;
        this.setSize(alturaV, anchoV);
        this.setPreferredSize(new Dimension(600, 600));
        this.setBackground(Color.black);
        this.addKeyListener(this);
        this.setFocusable(true);
        this.score = 0;
        alive = true;
        snakeHead = new Tile(5, 5);
        snakeBody = new ArrayList<Tile>();
        food = new Tile(10, 10);
        random = new Random();
        placeFood();
        gameloop = new Timer(100, this);
        gameloop.start();


    }

    public void gameOver(){
        if(snakeHead.x > 23 || snakeHead.x < 0 || snakeHead.y > 23 || snakeHead.y < 0){
            alive = false;
            gameloop.stop();
        }

        for(int i = 1 ; i < snakeBody.size(); i++) {
            if(snakeBody.get(i).x == snakeHead.x && snakeBody.get(i).y == snakeHead.y){
                alive = false;
                gameloop.stop();
            }
        }
    }

    public void draw(Graphics g){

        if(alive == true){
        //Score
        g.setColor(Color.CYAN);
        g.drawString("Score: "+score, 5, 20);

        //grid
        g.setColor(Color.white);
        for(int i = 1; i <= alturaV/tileSize; i++){
            g.drawLine(i*25, 0, i*25, 600);
            g.drawLine(0, i*25, 600, i*25);
        }
    
        //food
        g.setColor(Color.red);
        g.fillRect(food.x * tileSize, food.y * tileSize, tileSize, tileSize);

        //snake
        g.setColor(Color.green);
        
        g.fillRect(snakeHead.x*tileSize, snakeHead.y*tileSize, tileSize, tileSize);
        
        if(!snakeBody.isEmpty()){
            for(int i = snakeBody.size()-1 ; i >= 0; i--){
                if(i == 0){
                    g.fillRect(snakeBody.get(i).x*tileSize, snakeBody.get(i).y*tileSize, tileSize, tileSize);
                    (snakeBody.get(i)).x = snakeHead.x;
                    (snakeBody.get(i)).y = snakeHead.y;
                }
                else{
                    g.fillRect(snakeBody.get(i).x*tileSize, snakeBody.get(i).y*tileSize, tileSize, tileSize);
                    (snakeBody.get(i)).x = (snakeBody.get(i-1)).x;
                    (snakeBody.get(i)).y = (snakeBody.get(i-1)).y;
                    
                }

            }
        }
        }
        else
        {
            g.setColor(Color.green);
            g.drawString("GAME OVER", 300, 300);
            g.drawString("Score= "+score, 300, 330);
            g.drawString("Presione R para reiniciar", 300, 360);
        }
    }

    public void placeFood(){
        food.x = random.nextInt(24);
        food.y = random.nextInt(24);
        

    }


    public void paintComponent(Graphics g){
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

    public void move(){
        snakeHead.x += velocityX;
        snakeHead.y += velocityY;
    }

    public void comer(){
        if(snakeHead.x == food.x && snakeHead.y == food.y){
            score++;
            if(snakeBody.isEmpty())
                snakeBody.add(new Tile(snakeHead.x, snakeHead.y));
            else
                snakeBody.add(new Tile(snakeBody.getLast().x, snakeBody.getLast().y));

            placeFood();
            
        }
    }

    public void restart(){
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
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:

                if(velocityY != 1){
                    velocityY = -1;
                    velocityX = 0;
                }
                break;
            case KeyEvent.VK_DOWN:
             if(velocityY != -1){
                    velocityY = 1;
                    velocityX = 0;
                }
                break;
            case KeyEvent.VK_LEFT:
                if(velocityX != 1){
                    velocityY = 0;
                    velocityX = -1;
                }
                break;
            case KeyEvent.VK_RIGHT:
                if(velocityX != -1){
                    velocityY = 0;
                    velocityX = 1;
                }
                break;
            case KeyEvent.VK_R:
                if(alive == false){
                    restart();
                }
                break;
        }
    }



    @Override
    public void keyTyped(KeyEvent e) {
    }


    @Override
    public void keyReleased(KeyEvent e) {
    }

    

}
