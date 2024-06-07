import javax.swing.JFrame;

import InterfazGrafica.FramePrincipal;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Utene Games");
        FramePrincipal panelPrincipal = new FramePrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
     
        //frame.setSize(600, 600);
        frame.add(panelPrincipal);    
        frame.pack();
        frame.setVisible(true);
    }
}
