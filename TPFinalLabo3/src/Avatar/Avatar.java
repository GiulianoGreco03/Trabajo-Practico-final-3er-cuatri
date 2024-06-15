package Avatar;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Avatar extends JPanel implements ActionListener{

    private final String spriteAvatar = "src\\Avatar\\Sprites\\Avatar.png";
    private int tamaño;

    public Avatar (int tamaño){

        setSize(new Dimension(tamaño, tamaño));
        setBackground(Color.black);

    }

    public void paint(Graphics g){

        

    }

    

}
