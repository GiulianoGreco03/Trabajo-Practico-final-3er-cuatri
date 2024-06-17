package InterfazGrafica;

import javax.swing.*;

import Usuarios.Usuario;

import java.awt.*;

public class MainFrame extends JFrame {

    private Usuario usuarioActivo;
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private PanelLogin panelLogin;
    private FramePrincipal panelPrincipal;

    public MainFrame() {
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        showPanelLogin();

        add(mainPanel);

        setTitle("UTN GameHub");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void showPanelPrincipal() {
        panelPrincipal = new FramePrincipal(usuarioActivo, this);
        mainPanel.add(panelPrincipal, "UTN GameHub");
        cardLayout.show(mainPanel, "UTN GameHub");
    }

    public void showPanelLogin(){
        panelLogin = new PanelLogin(this);
        mainPanel.add(panelLogin, "Inicio de sesión");
        cardLayout.show(mainPanel, "Inicio de sesión");
    }


    public void setUsuarioActivo(Usuario usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    
}
