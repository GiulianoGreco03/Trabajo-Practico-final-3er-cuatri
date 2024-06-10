import java.util.ArrayList;

import javax.swing.JFrame;

import InterfazGrafica.FramePrincipal;
import Usuario.ClasePruebaJson;

public class App {
    public static void main(String[] args) throws Exception {
        /*JFrame frame = new JFrame("Utene Games");
        FramePrincipal panelPrincipal = new FramePrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
     
        //frame.setSize(600, 600);
        frame.add(panelPrincipal);    
        frame.pack();
        frame.setVisible(true);*/

        pruebaJson();
    }

    public static void pruebaJson(){
        ArrayList<ClasePruebaJson> pruebas = new ArrayList<>();

        pruebas.add(new ClasePruebaJson("Pepe", 40));
        pruebas.add(new ClasePruebaJson("RAul", 10));
        pruebas.add(new ClasePruebaJson("JAcinto", 20));

        ClaseJsonGenerica jason = new ClaseJsonGenerica<>();
        jason.crearJson("archivo.json");
        //jason.CargarValores(pruebas, "src\\archivo.json");
    }
}
