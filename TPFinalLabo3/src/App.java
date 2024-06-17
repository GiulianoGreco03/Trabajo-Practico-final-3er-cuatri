import java.util.ArrayList;

import javax.swing.JFrame;

import Avatares.EnumCosmeticos;
import Avatares.GestorCosmeticos;
import InterfazGrafica.*;
import Juegos.ContenedorJuego;
import Juegos.EnumJuegos;
import Juegos.CarpetaDinosaurio.ChromeDinosaurio;
import Plataformas.*;
import Rankings.GestorRankings;
import Rankings.Ranking;
import Usuarios.*;

public class App {
    public static void main(String[] args) throws Exception {

        //GestorUsuarios gestorUsuarios = new GestorUsuarios();
        //GestorRankings gestor = new GestorRankings();
        //GestorCosmeticos gestorCosmeticos = new GestorCosmeticos();

        //System.out.println(gestorCosmeticos.getGorros());


        Plataforma plataforma = new Plataforma();

       
        //gestor.cargarRankingJson(new Ranking("fede", 1000l, EnumJuegos.Snake));
        //gestor.cargarRankingJson(new Ranking("Tata", 1000l, EnumJuegos.Snake));
        
        int anchoTablero = 500;
        int altoTablero = 500;

        /*JFrame frame = new JFrame("Dinosaurio Chrome");
        //frame.setVisible(true);
        frame.setSize(anchoTablero, altoTablero);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ChromeDinosaurio chromeDinosaurio = new ChromeDinosaurio();
        ContenedorJuego cont = new ContenedorJuego(chromeDinosaurio);
        frame.add(cont);
        frame.pack();
        //chromeDinosaurio.requestFocusInWindow();
        frame.setVisible(true);*/
    
        
    }

    
}
