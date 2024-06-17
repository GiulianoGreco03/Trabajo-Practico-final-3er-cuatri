package Avatares;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

import javax.swing.*;

public class Avatar extends JPanel{
    private final String spriteAvatar = "src\\Avatares\\Sprites\\Avatar.png";
    private int tamaño;
    private Image avatar;
    private LinkedList<String> sombreros;
    private int sombreroActivo;
    private LinkedList<String> lentes;
    private int lenteActivo;
    private LinkedList<String> traje;
    private int trajeActivo;

    public Avatar(int tamaño) {
        sombreroActivo = 1;
        lenteActivo = 1;
        sombreros = new LinkedList<>();
        lentes = new LinkedList<>();
        cargarGorros();
        cargarLentes();
        this.tamaño = tamaño;
        setPreferredSize(new Dimension(tamaño, tamaño));
        setBackground(Color.black);
        requestFocus();

        // Cargar la imagen y redimensionarla
        avatar = new ImageIcon(spriteAvatar).getImage();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(avatar, 0, 0,tamaño, tamaño, null);

        g.drawImage(new ImageIcon(sombreros.get(sombreroActivo)).getImage(), tamaño/4 - tamaño/50, tamaño/10 - tamaño/20, tamaño/2, tamaño/3, this);
        
        g.drawImage(new ImageIcon(lentes.get(lenteActivo)).getImage(), tamaño/4 - tamaño/50, tamaño/2 - tamaño/6, tamaño/2, tamaño/6, this);
        
    }

    public void cargarGorros(){
        sombreros.add("");
        sombreros.add("src\\Avatares\\Sprites\\SombreroVerde.png");
        sombreros.add("src\\Avatares\\Sprites\\SombreroRojo.png");
    }

    public void cambiarGorro(){
        
        sombreroActivo++;
        if(sombreroActivo == sombreros.size()){
            sombreroActivo = 0;
        }
        repaint();

    }

    public void cargarLentes(){
        lentes.add("");
        lentes.add("src\\Avatares\\Sprites\\Lentes1.png");
        lentes.add("src\\Avatares\\Sprites\\Lentes2.png");

    }

   /* public static void main(String[] args) {
        Avatar avatar = new Avatar(300);
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(avatar);
        frame.pack();
        frame.setLocationRelativeTo(null); // Centrar la ventana
        frame.setVisible(true);
    }*/
}

    


