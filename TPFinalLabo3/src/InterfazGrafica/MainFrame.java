package InterfazGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private PanelLogin loginPanel;
    private FramePrincipal systemPanel;

    public MainFrame() {
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        loginPanel = new PanelLogin(this);
        systemPanel = new FramePrincipal();

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
}
