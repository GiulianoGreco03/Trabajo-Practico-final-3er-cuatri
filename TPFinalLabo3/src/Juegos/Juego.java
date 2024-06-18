package Juegos;

import java.util.HashMap;

import javax.swing.JPanel;

import Rankings.GestorRankings;
import Rankings.Ranking;
import Usuarios.GestorUsuarios;
import Usuarios.Usuario;

public abstract class Juego extends JPanel{

    protected Usuario usuario;
    protected boolean gameOver;
    protected GestorRankings gestorRankings;
    protected GestorUsuarios gestorUsuarios;

    public Juego(Usuario usuario){
        gestorRankings = new GestorRankings();
        gestorUsuarios = new GestorUsuarios();
        this.usuario = usuario;
    }

    //Metodos

    public abstract void restart();
    public abstract Long calcularPuntuacion();

    public void rankingYPuntaje(Long puntuacion, EnumJuegos juego, Usuario usuario ){
        usuario.sumarPuntajeUsuario(puntuacion);
        Ranking aux = new Ranking(usuario.getNombre(), puntuacion, juego);
        HashMap<EnumJuegos, Long> puntajeMaximoAux = usuario.getPuntuacionMaxima();
        if(puntajeMaximoAux.get(juego) < puntuacion || puntajeMaximoAux.get(juego) == null){
            puntajeMaximoAux.put(juego, puntuacion);
        }
        gestorUsuarios.cargarUsuarioJson(usuario);
        gestorRankings.cargarRankingJson(aux);
    }



}
