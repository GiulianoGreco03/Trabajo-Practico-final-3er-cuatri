package Plataformas;

import javax.swing.*;

import InterfazGrafica.*;
import Usuarios.GestorUsuarios;

public class Plataforma {

    private JFrame frame = new JFrame();
    private GestorUsuarios listadoUsuarios = new GestorUsuarios();

    public Plataforma(){

        MainFrame frame = new MainFrame();
        frame.pack();
        frame.setVisible(true);

    }

    

}
