package InterfazGrafica;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel{

    //Constantes
    private final int dimension = 600;

    //Atributos
    protected JPanel botonSeleccionado;
    protected JLabel iconSeleccionado;

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
        
        if(this.botonSeleccionado != null){
            this.botonSeleccionado.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
        this.botonSeleccionado = botonSeleccionado;
        this.botonSeleccionado.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));

    }

    public void setIconSeleccionado(JLabel iconSeleccionado) {
        
        if(this.iconSeleccionado != null){
            this.iconSeleccionado.setBorder(null);
        }
        this.iconSeleccionado = iconSeleccionado;
        this.iconSeleccionado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));

    }

}
