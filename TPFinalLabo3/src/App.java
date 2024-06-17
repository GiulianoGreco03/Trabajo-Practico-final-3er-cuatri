import java.util.ArrayList;

import javax.swing.JFrame;



import InterfazGrafica.*;
import Juegos.EnumJuegos;
import Plataformas.*;
import Rankings.GestorRankings;
import Rankings.Ranking;
import Usuarios.*;

public class App {
    public static void main(String[] args) throws Exception {

        //GestorUsuarios gestorUsuarios = new GestorUsuarios();
        GestorRankings gestor = new GestorRankings();

        gestor.cargarRankingJson(new Ranking("Tata", 200l, EnumJuegos.Dinosaurio));



         Plataforma plataforma = new Plataforma();

       
        //gestor.cargarRankingJson(new Ranking("fede", 1000l, EnumJuegos.Snake));
        //gestor.cargarRankingJson(new Ranking("Tata", 1000l, EnumJuegos.Snake));
        
    }

    
}
