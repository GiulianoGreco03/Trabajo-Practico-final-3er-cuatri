import java.util.ArrayList;

import javax.swing.JFrame;



import InterfazGrafica.*;
import Plataformas.*;
import Usuarios.*;

public class App {
    public static void main(String[] args) throws Exception {

        Plataforma plataforma = new Plataforma();
        
    }

    public static void pruebaJson(){
        ArrayList<ClasePruebaJson> pruebas = new ArrayList<>();

        pruebas.add(new ClasePruebaJson("Pepe", 40));
        pruebas.add(new ClasePruebaJson("RAul", 10));
        pruebas.add(new ClasePruebaJson("JAcinto", 20));

        ClaseJsonGenerica<ClasePruebaJson> jason = new ClaseJsonGenerica<>();
        //jason.crearJson("archivo.json");
        jason.CargarValores(pruebas, "archivo.json");
    }
}
