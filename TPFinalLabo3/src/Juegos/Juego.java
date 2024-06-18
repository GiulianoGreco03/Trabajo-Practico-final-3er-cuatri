package Juegos;

import javax.swing.JPanel;

import Usuarios.Usuario;

public abstract class Juego extends JPanel{

    protected Usuario usuario;
    protected boolean gameOver;

    public Juego(Usuario usuario){
        
    }

    //Metodos

    public abstract void restart();
    public abstract Long calcularPuntuacion();



}
