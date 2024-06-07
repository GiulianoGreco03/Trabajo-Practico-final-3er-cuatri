package InterfazGrafica;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel{

    //Constantes
    private final int dimension = 600;

    //Constructor
    public Panel(){
        setSize(dimension, dimension);
    }

    //Metodos
    public static <T extends JPanel> void refrescarPanel(T thisPanel, T panelNuevo){
       thisPanel.removeAll();                                       
       thisPanel.add(panelNuevo);
       panelNuevo.requestFocus();
       thisPanel.revalidate();
       thisPanel.repaint();
    }

}
