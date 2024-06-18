package Juegos;

import javax.swing.JPanel;

public abstract class Juego extends JPanel{

    private String nombreJuego;

    public Juego(){
        
    }

    //Metodos

    public abstract void gameover();
    public abstract void restart();
    public abstract Long calcularPuntuacion();



}
