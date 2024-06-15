package InterfazGrafica;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel{

    //Constantes
    private final int dimension = 600;

    //Atributos
    protected JPanel botonSeleccionado;

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

    public void setBotonSeleccionado(JPanel botonSeleccionado) {
        
        this.botonSeleccionado.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        this.botonSeleccionado = botonSeleccionado;
        this.botonSeleccionado.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));

    }

}
