package InterfazGrafica;

import javax.swing.*;

import Usuarios.Usuario;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private Usuario usuarioActivo;
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private PanelLogin loginPanel;
    private FramePrincipal systemPanel;

    public MainFrame() {
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        loginPanel = new PanelLogin(this);
        systemPanel = new FramePrincipal(usuarioActivo);

        mainPanel.add(loginPanel, "login");
        mainPanel.add(systemPanel, "system");

        add(mainPanel);

        setTitle("Login System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void showSystemPanel() {
        cardLayout.show(mainPanel, "system");
    }


    public void setUsuarioActivo(Usuario usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    
}
