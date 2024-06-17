package Avatares;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

import javax.swing.*;

public class Avatar extends JPanel{
    private transient final String spriteAvatar = "src\\Avatares\\Sprites\\Avatar.png";
    private int tamaño;
    private LinkedList<String> sombreros;
    private int sombreroActivo;
    private LinkedList<String> lentes;
    private int lenteActivo;
    private LinkedList<String> traje;
    private int trajeActivo;

    public Avatar(){

    }

    /*public Avatar(int tamaño) {
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
        
    }*/

    public Avatar(int tamaño, LinkedList<String> sombreros, int sombreroActivo, LinkedList<String> lentes,
            int lenteActivo, LinkedList<String> traje, int trajeActivo) {
        this.tamaño = tamaño;
        this.sombreros = sombreros;
        this.sombreroActivo = sombreroActivo;
        this.lentes = lentes;
        this.lenteActivo = lenteActivo;
        this.traje = traje;
        this.trajeActivo = trajeActivo;
        setPreferredSize(new Dimension(tamaño, tamaño));
        setBackground(Color.LIGHT_GRAY);
        requestFocus();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(new ImageIcon(spriteAvatar).getImage(), 0, 0,tamaño, tamaño, null);

        g.drawImage(new ImageIcon(sombreros.get(sombreroActivo)).getImage(), tamaño/4 - tamaño/50, tamaño/10 - tamaño/20, tamaño/2, tamaño/3, this);
        
        g.drawImage(new ImageIcon(lentes.get(lenteActivo)).getImage(), tamaño/4 - tamaño/50, tamaño/2 - tamaño/6, tamaño/2, tamaño/6, this);

        g.drawImage(new ImageIcon(traje.get(trajeActivo)).getImage(), 0 - tamaño/45, tamaño/2  + tamaño/12, tamaño, tamaño/2, this);
        
    }


    public void cambiarGorro(){
        
        sombreroActivo++;
        if(sombreroActivo == sombreros.size()){
            sombreroActivo = 0;
        }
        repaint();

    }

    public void cambiarLentes(){
        
        lenteActivo++;
        if(lenteActivo == lentes.size()){
            lenteActivo = 0;
        }
        repaint();

    }

    public void cambiarTraje(){
        
        trajeActivo++;
        if(trajeActivo == traje.size()){
            trajeActivo = 0;
        }
        repaint();

    }

    

    public String getSpriteAvatar() {
        return spriteAvatar;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public LinkedList<String> getSombreros() {
        return sombreros;
    }

    public void setSombreros(LinkedList<String> sombreros) {
        this.sombreros = sombreros;
    }

    public int getSombreroActivo() {
        return sombreroActivo;
    }

    public void setSombreroActivo(int sombreroActivo) {
        this.sombreroActivo = sombreroActivo;
    }

    public LinkedList<String> getLentes() {
        return lentes;
    }

    public void setLentes(LinkedList<String> lentes) {
        this.lentes = lentes;
    }

    public int getLenteActivo() {
        return lenteActivo;
    }

    public void setLenteActivo(int lenteActivo) {
        this.lenteActivo = lenteActivo;
    }

    public LinkedList<String> getTraje() {
        return traje;
    }

    public void setTraje(LinkedList<String> traje) {
        this.traje = traje;
    }

    public int getTrajeActivo() {
        return trajeActivo;
    }

    public void setTrajeActivo(int trajeActivo) {
        this.trajeActivo = trajeActivo;
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

    


