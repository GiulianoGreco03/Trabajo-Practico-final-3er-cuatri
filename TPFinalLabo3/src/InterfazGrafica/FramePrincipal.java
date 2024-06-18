package InterfazGrafica;

import javax.swing.*;

import Avatares.Avatar;
import Usuarios.Usuario;

import java.awt.*;
import java.util.ArrayList;

public class FramePrincipal extends JPanel{

    //Atributos.
    private JPanel botonSeleccionado;
    private Usuario usuarioActivo;
    private MainFrame mainFrame;

    private ArrayList<Panel> paneles;

    //Componentes swing
    private Avatar avatar;
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Banner;
    private javax.swing.JPanel Button1;
    private javax.swing.JPanel Button2;
    private javax.swing.JPanel Button3;
    private javax.swing.JPanel Button4;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel button1Label;
    private javax.swing.JLabel button2Label1;
    private javax.swing.JLabel button3Label;
    private javax.swing.JLabel button4Label;
    private javax.swing.JLabel tituloLabel;
    
//
       
    public FramePrincipal(Usuario usuarioActivo, MainFrame mainFrame) {

        this.usuarioActivo = usuarioActivo;
        this.mainFrame = mainFrame;
        paneles = new ArrayList<>();


        if(usuarioActivo.isAdmin()){
            cargarPanelesAdmin();
        }else{
            cargarPanelesUsuario();
        }
        
        initComponents();
        this.botonSeleccionado = Button1;
        setBotonSeleccionado(Button1);
        cambiarPanelPrincipal(paneles.get(0));
    }                  
    

    //Metodos
    public <T extends JPanel> void cambiarPanelPrincipal(T panelACambiar){
        PanelPrincipal.removeAll();                                       
        PanelPrincipal.add(panelACambiar);
        panelACambiar.requestFocus();
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }

    public PanelJuegos volverAtras(){
        PanelJuegos panelNuevo = new PanelJuegos(this, usuarioActivo);
        paneles.set(0, panelNuevo);
        return panelNuevo;
    }

    

    public void cargarPanelesUsuario(){
        paneles.add(new PanelJuegos(this, usuarioActivo));
        paneles.add(new PanelTienda(this, usuarioActivo));
        paneles.add(new PanelPerfil(usuarioActivo, mainFrame));
        paneles.add(new PanelRankings(usuarioActivo));
        
    }

    public void cargarPanelesAdmin(){

        paneles.add(new PanelJuegosAdmin());
       
        
        paneles.add(new PanelTiendaAdmin());
        paneles.add(new PanelPerfilAdmin(mainFrame));
        paneles.add(new PanelRankings(usuarioActivo));

    }


    public void setBotonSeleccionado(JPanel botonSeleccionado) {
        
        this.botonSeleccionado.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        this.botonSeleccionado = botonSeleccionado;
        this.botonSeleccionado.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));

    }


    public void refrescarAvatar(int sombreroActivo, int lenteActivo, int trajeActivo){
        avatar.setSombreroActivo(sombreroActivo);
        avatar.setLenteActivo(lenteActivo);
        avatar.setTrajeActivo(trajeActivo);
        avatar.repaint();
    }

    public Avatar getAvatar() {
        return avatar;
    }
    
    private void initComponents() {

        Background = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JPanel();
        avatar = new Avatar(180, usuarioActivo.getSombreros(), usuarioActivo.getSombreroActivo(), usuarioActivo.getLentes(), usuarioActivo.getLenteActivo(), usuarioActivo.getTraje(), usuarioActivo.getTrajeActivo());
        Button1 = new javax.swing.JPanel();
        button1Label = new javax.swing.JLabel();
        Button2 = new javax.swing.JPanel();
        button2Label1 = new javax.swing.JLabel();
        Button3 = new javax.swing.JPanel();
        button3Label = new javax.swing.JLabel();
        Button4 = new javax.swing.JPanel();
        button4Label = new javax.swing.JLabel();
        Banner = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();

        //Se elije el panel por defecto
        

        setPreferredSize(new java.awt.Dimension(810, 700));

        Background.setBackground(new java.awt.Color(82, 38, 105));
        Background.setPreferredSize(new java.awt.Dimension(820, 700));

        PanelPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        

        javax.swing.GroupLayout AvatarLayout = new javax.swing.GroupLayout(avatar);
        avatar.setLayout(AvatarLayout);
        AvatarLayout.setHorizontalGroup(
            AvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        AvatarLayout.setVerticalGroup(
            AvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        Button1.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button1.setPreferredSize(new java.awt.Dimension(150, 100));
        Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button1MouseExited(evt);
            }
        });

        button1Label.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        button1Label.setForeground(new Color(PaletaDeColores.ColorLetras.R, PaletaDeColores.ColorLetras.G, PaletaDeColores.ColorLetras.B));
        button1Label.setText("Juegos");
        button1Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout Button1Layout = new javax.swing.GroupLayout(Button1);
        Button1.setLayout(Button1Layout);
        Button1Layout.setHorizontalGroup(
            Button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(button1Label)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        Button1Layout.setVerticalGroup(
            Button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(button1Label)
                .addGap(35, 35, 35))
        );

        Button2.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        Button2.setPreferredSize(new java.awt.Dimension(150, 100));
        Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button2MouseExited(evt);
            }
        });

        button2Label1.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        button2Label1.setForeground(new Color(PaletaDeColores.ColorLetras.R, PaletaDeColores.ColorLetras.G, PaletaDeColores.ColorLetras.B));
        button2Label1.setText("Tienda");
        button2Label1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout Button2Layout = new javax.swing.GroupLayout(Button2);
        Button2.setLayout(Button2Layout);
        Button2Layout.setHorizontalGroup(
            Button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(button2Label1)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        Button2Layout.setVerticalGroup(
            Button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(button2Label1)
                .addGap(35, 35, 35))
        );

        Button3.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        Button3.setPreferredSize(new java.awt.Dimension(150, 100));
        Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button3MouseExited(evt);
            }
        });

        button3Label.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        button3Label.setForeground(new Color(PaletaDeColores.ColorLetras.R, PaletaDeColores.ColorLetras.G, PaletaDeColores.ColorLetras.B));
        button3Label.setText("Perfil");

        javax.swing.GroupLayout Button3Layout = new javax.swing.GroupLayout(Button3);
        Button3.setLayout(Button3Layout);
        Button3Layout.setHorizontalGroup(
            Button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(button3Label)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        Button3Layout.setVerticalGroup(
            Button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(button3Label)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Button4.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        Button4.setPreferredSize(new java.awt.Dimension(150, 100));
        Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button4MouseExited(evt);
            }
        });

        button4Label.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        button4Label.setForeground(new Color(PaletaDeColores.ColorLetras.R, PaletaDeColores.ColorLetras.G, PaletaDeColores.ColorLetras.B));
        button4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button4Label.setText("Rankings");

        javax.swing.GroupLayout Button4Layout = new javax.swing.GroupLayout(Button4);
        Button4.setLayout(Button4Layout);
        Button4Layout.setHorizontalGroup(
            Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button4Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(button4Label)
                .addGap(37, 37, 37))
        );
        Button4Layout.setVerticalGroup(
            Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(button4Label)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Banner.setBackground(new Color(PaletaDeColores.PanelPrincipal.R, PaletaDeColores.PanelPrincipal.G, PaletaDeColores.PanelPrincipal.B));
        Banner.setForeground(new Color(PaletaDeColores.PanelPrincipal.R, PaletaDeColores.PanelPrincipal.G, PaletaDeColores.PanelPrincipal.B));

        tituloLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 48)); // NOI18N
        tituloLabel.setForeground(new Color(PaletaDeColores.ColorLetras.R, PaletaDeColores.ColorLetras.G, PaletaDeColores.ColorLetras.B));
        tituloLabel.setText("UTN GAMEHUB");

        javax.swing.GroupLayout BannerLayout = new javax.swing.GroupLayout(Banner);
        Banner.setLayout(BannerLayout);
        BannerLayout.setHorizontalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(tituloLabel)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        BannerLayout.setVerticalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BannerLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(tituloLabel))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>                        

    private void Button1MouseEntered(java.awt.event.MouseEvent evt) {                                     
        Button1.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }                                    

    private void Button1MouseExited(java.awt.event.MouseEvent evt) {   
        if(botonSeleccionado != Button1)                                  
            Button1.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
    }                                   

    private void Button1MouseClicked(java.awt.event.MouseEvent evt) { 
        if(botonSeleccionado != Button1) {                                      
            cambiarPanelPrincipal(paneles.get(0));
            setBotonSeleccionado(Button1);
        }
    }                                    

    private void Button2MouseEntered(java.awt.event.MouseEvent evt) {                                     
        Button2.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }                                    

    private void Button2MouseExited(java.awt.event.MouseEvent evt) { 
        if(botonSeleccionado != Button2)                                    
            Button2.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
    }                                   

    private void Button2MouseClicked(java.awt.event.MouseEvent evt) { 
        if(botonSeleccionado != Button2) { 
            if(!usuarioActivo.isAdmin()){
               ((PanelTienda)paneles.get(1)).actualizarPuntaje();
            }                                     
            cambiarPanelPrincipal(paneles.get(1));
            setBotonSeleccionado(Button2);
        }
    }                                    

    private void Button3MouseEntered(java.awt.event.MouseEvent evt) {                                     
        Button3.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }                                    

    private void Button3MouseExited(java.awt.event.MouseEvent evt) {  
        if(botonSeleccionado != Button3)                                   
            Button3.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
    }                                   

    private void Button3MouseClicked(java.awt.event.MouseEvent evt) {   
        if(botonSeleccionado != Button3) {                                      
            cambiarPanelPrincipal(paneles.get(2));
            setBotonSeleccionado(Button3);
        }
    }                                    

    private void Button4MouseEntered(java.awt.event.MouseEvent evt) {                                     
        Button4.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }                                    

    private void Button4MouseExited(java.awt.event.MouseEvent evt) { 
        if(botonSeleccionado != Button4)                                   
            Button4.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
    }                                   

    private void Button4MouseClicked(java.awt.event.MouseEvent evt) { 
        if(botonSeleccionado != Button4) {   
            paneles.add(3, new PanelRankings(usuarioActivo));                              
            cambiarPanelPrincipal(paneles.get(3));
            setBotonSeleccionado(Button4);
        }
    }                                    

    

}
