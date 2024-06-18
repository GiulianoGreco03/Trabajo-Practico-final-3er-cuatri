
package InterfazGrafica;

import java.awt.*;

import javax.swing.ImageIcon;

import Juegos.*;
import Juegos.CarpetaDinosaurio.ChromeDinosaurio;
import Juegos.CarpetaFlappy.FlappyBird;
import Juegos.CarpetaSpaceInvaders.SpaceInvaders;
import Juegos.Tetris.Tetri;
import Usuarios.Usuario;


public class PanelJuegos extends Panel {

        private FramePrincipal framePrincipal;
        private Usuario usuarioActivo;


        public PanelJuegos(FramePrincipal framePrincipal, Usuario usuarioActivo) {
            this.usuarioActivo = usuarioActivo;
            this.framePrincipal = framePrincipal;
            initComponents();
        }
                             
        private void initComponents() {

            jPanel4 = new javax.swing.JPanel();
            background = new javax.swing.JPanel();
            juego1 = new javax.swing.JPanel();
            icon1 = new javax.swing.JLabel();
            juego2 = new javax.swing.JPanel();
            icon2 = new javax.swing.JLabel();
            juego3 = new javax.swing.JPanel();
            icon3 = new javax.swing.JLabel();
            juego4 = new javax.swing.JPanel();
            icon4 = new javax.swing.JLabel();
            juego5 = new javax.swing.JPanel();
            icon5 = new javax.swing.JLabel();
            juego6 = new javax.swing.JPanel();
            icon6 = new javax.swing.JLabel();
            nombre1 = new javax.swing.JPanel();
            nombre1Label1 = new javax.swing.JLabel();
            nombre2 = new javax.swing.JPanel();
            nombre1Label = new javax.swing.JLabel();
            nombre3 = new javax.swing.JPanel();
            nombre1Label3 = new javax.swing.JLabel();
            nombre4 = new javax.swing.JPanel();
            nombre1Label4 = new javax.swing.JLabel();
            nombre5 = new javax.swing.JPanel();
            nombre1Label5 = new javax.swing.JLabel();
            nombre6 = new javax.swing.JPanel();
            nombre1Label2 = new javax.swing.JLabel();
    
            jPanel4.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
    
            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 150, Short.MAX_VALUE)
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 40, Short.MAX_VALUE)
            );
    
            background.setPreferredSize(new java.awt.Dimension(600, 600));
    
            juego1.setBackground(new java.awt.Color(73, 128, 153));
            juego1.setMinimumSize(new java.awt.Dimension(150, 100));
            juego1.setPreferredSize(new java.awt.Dimension(150, 150));
    
            icon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            icon1.setIcon(new ImageIcon("src\\Juegos\\Iconos\\snake_icon.png"));
            icon1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    icon1MouseClicked(evt);
                }
            });
    
            javax.swing.GroupLayout juego1Layout = new javax.swing.GroupLayout(juego1);
            juego1.setLayout(juego1Layout);
            juego1Layout.setHorizontalGroup(
                juego1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(juego1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(icon1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addContainerGap())
            );
            juego1Layout.setVerticalGroup(
                juego1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(juego1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(icon1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addContainerGap())
            );
    
            juego2.setBackground(new java.awt.Color(73, 128, 153));
            juego2.setMinimumSize(new java.awt.Dimension(150, 100));
            juego2.setPreferredSize(new java.awt.Dimension(150, 150));
    
            icon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            icon2.setIcon(new ImageIcon("src\\Juegos\\Iconos\\buscamina_icon.png"));
            icon2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    icon2MouseClicked(evt);
                }
            });
    
            javax.swing.GroupLayout juego2Layout = new javax.swing.GroupLayout(juego2);
            juego2.setLayout(juego2Layout);
            juego2Layout.setHorizontalGroup(
                juego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(juego2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(icon2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addContainerGap())
            );
            juego2Layout.setVerticalGroup(
                juego2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(juego2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(icon2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addContainerGap())
            );
    
            juego3.setBackground(new java.awt.Color(73, 128, 153));
            juego3.setMinimumSize(new java.awt.Dimension(150, 100));
            juego3.setPreferredSize(new java.awt.Dimension(150, 150));
    
            icon3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            icon3.setIcon(new ImageIcon("src\\Juegos\\Iconos\\space_invaders_icon.png"));
            icon3.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    icon3MouseClicked(evt);
                }
            });
    
            javax.swing.GroupLayout juego3Layout = new javax.swing.GroupLayout(juego3);
            juego3.setLayout(juego3Layout);
            juego3Layout.setHorizontalGroup(
                juego3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(juego3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(icon3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addContainerGap())
            );
            juego3Layout.setVerticalGroup(
                juego3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(juego3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(icon3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addContainerGap())
            );
    
            juego4.setBackground(new java.awt.Color(73, 128, 153));
            juego4.setMinimumSize(new java.awt.Dimension(150, 100));
            juego4.setPreferredSize(new java.awt.Dimension(150, 150));
    
            icon4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            icon4.setIcon(new ImageIcon("src\\Juegos\\Iconos\\Flappy_Bird_icon.png"));
            icon4.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    icon4MouseClicked(evt);
                }
            });
    
            javax.swing.GroupLayout juego4Layout = new javax.swing.GroupLayout(juego4);
            juego4.setLayout(juego4Layout);
            juego4Layout.setHorizontalGroup(
                juego4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(juego4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(icon4, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addContainerGap())
            );
            juego4Layout.setVerticalGroup(
                juego4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(juego4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(icon4, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addContainerGap())
            );
    
            juego5.setBackground(new java.awt.Color(73, 128, 153));
            juego5.setMinimumSize(new java.awt.Dimension(150, 100));
            juego5.setPreferredSize(new java.awt.Dimension(150, 150));
    
            icon5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            icon5.setIcon(new ImageIcon("src\\Juegos\\Iconos\\Dinosaurio_juego_icon.png"));
            icon5.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    icon5MouseClicked(evt);
                }
            });
    
            javax.swing.GroupLayout juego5Layout = new javax.swing.GroupLayout(juego5);
            juego5.setLayout(juego5Layout);
            juego5Layout.setHorizontalGroup(
                juego5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(juego5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(icon5, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addContainerGap())
            );
            juego5Layout.setVerticalGroup(
                juego5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(juego5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(icon5, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addContainerGap())
            );
    
            juego6.setBackground(new java.awt.Color(73, 128, 153));
            juego6.setMinimumSize(new java.awt.Dimension(150, 100));
            juego6.setPreferredSize(new java.awt.Dimension(150, 150));
    
            icon6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            icon6.setIcon(new ImageIcon("src\\Juegos\\Iconos\\Tetris_icon.png"));
            icon6.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    icon6MouseClicked(evt);
                }
            });
    
            javax.swing.GroupLayout juego6Layout = new javax.swing.GroupLayout(juego6);
            juego6.setLayout(juego6Layout);
            juego6Layout.setHorizontalGroup(
                juego6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(juego6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(icon6, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addContainerGap())
            );
            juego6Layout.setVerticalGroup(
                juego6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(juego6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(icon6, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addContainerGap())
            );
    
            nombre1.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            nombre1.setLayout(new java.awt.BorderLayout());
    
            nombre1Label1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
            nombre1Label1.setForeground(new java.awt.Color(255, 255, 255));
            nombre1Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            nombre1Label1.setText("Snake");
            nombre1.add(nombre1Label1, java.awt.BorderLayout.CENTER);
    
            nombre2.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            nombre2.setLayout(new java.awt.BorderLayout());
    
            nombre1Label.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
            nombre1Label.setForeground(new java.awt.Color(255, 255, 255));
            nombre1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            nombre1Label.setText("Buscaminas");
            nombre2.add(nombre1Label, java.awt.BorderLayout.CENTER);
    
            nombre3.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            nombre3.setLayout(new java.awt.BorderLayout());
    
            nombre1Label3.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
            nombre1Label3.setForeground(new java.awt.Color(255, 255, 255));
            nombre1Label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            nombre1Label3.setText("Space Invaders");
            nombre3.add(nombre1Label3, java.awt.BorderLayout.CENTER);
    
            nombre4.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            nombre4.setLayout(new java.awt.BorderLayout());
    
            nombre1Label4.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
            nombre1Label4.setForeground(new java.awt.Color(255, 255, 255));
            nombre1Label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            nombre1Label4.setText("Flappy bird");
            nombre4.add(nombre1Label4, java.awt.BorderLayout.CENTER);
    
            nombre5.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            nombre5.setLayout(new java.awt.BorderLayout());
    
            nombre1Label5.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
            nombre1Label5.setForeground(new java.awt.Color(255, 255, 255));
            nombre1Label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            nombre1Label5.setText("Dinosaurio");
            nombre5.add(nombre1Label5, java.awt.BorderLayout.CENTER);
    
            nombre6.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            nombre6.setLayout(new java.awt.BorderLayout());
    
            nombre1Label2.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
            nombre1Label2.setForeground(new java.awt.Color(255, 255, 255));
            nombre1Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            nombre1Label2.setText("Tetris");
            nombre6.add(nombre1Label2, java.awt.BorderLayout.CENTER);
    
            javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
            background.setLayout(backgroundLayout);
            backgroundLayout.setHorizontalGroup(
                backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addComponent(juego1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(juego2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(juego3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addComponent(nombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(nombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(nombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addComponent(juego4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(juego5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(juego6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            );
            backgroundLayout.setVerticalGroup(
                backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(juego1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(juego2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(juego3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(60, 60, 60)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(juego4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(juego5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(juego6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );
    
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
        }// </editor-fold>                        
    
        private void icon1MouseClicked(java.awt.event.MouseEvent evt) {                                   
            refrescarPanel(this, new ContenedorJuego(this, framePrincipal, new Snake(usuarioActivo)));
        }                                  
    
        private void icon2MouseClicked(java.awt.event.MouseEvent evt) {                                   
            //refrescarPanel(this, new ContenedorJuego(null, framePrincipal, new FrameBuscaminas()));
        }                                  
    
        private void icon3MouseClicked(java.awt.event.MouseEvent evt) {                                   
            refrescarPanel(this, new ContenedorJuego(null, framePrincipal, new SpaceInvaders(usuarioActivo)));
        }                                  
    
        private void icon4MouseClicked(java.awt.event.MouseEvent evt) {                                   
            refrescarPanel(this, new ContenedorJuego(this, framePrincipal, new FlappyBird(usuarioActivo)));
        }                                  
    
        private void icon5MouseClicked(java.awt.event.MouseEvent evt) {                                   
            refrescarPanel(this, new ContenedorJuego(this, framePrincipal, new ChromeDinosaurio(usuarioActivo)));
        }                                  
    
        private void icon6MouseClicked(java.awt.event.MouseEvent evt) {                                   
           refrescarPanel(this, new ContenedorJuego(this, framePrincipal, new Tetri()));
        }                                  
    
    
        // Variables declaration - do not modify                     
        private javax.swing.JPanel background;
        private javax.swing.JLabel icon1;
        private javax.swing.JLabel icon2;
        private javax.swing.JLabel icon3;
        private javax.swing.JLabel icon4;
        private javax.swing.JLabel icon5;
        private javax.swing.JLabel icon6;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel juego1;
        private javax.swing.JPanel juego2;
        private javax.swing.JPanel juego3;
        private javax.swing.JPanel juego4;
        private javax.swing.JPanel juego5;
        private javax.swing.JPanel juego6;
        private javax.swing.JPanel nombre1;
        private javax.swing.JLabel nombre1Label;
        private javax.swing.JLabel nombre1Label1;
        private javax.swing.JLabel nombre1Label2;
        private javax.swing.JLabel nombre1Label3;
        private javax.swing.JLabel nombre1Label4;
        private javax.swing.JLabel nombre1Label5;
        private javax.swing.JPanel nombre2;
        private javax.swing.JPanel nombre3;
        private javax.swing.JPanel nombre4;
        private javax.swing.JPanel nombre5;
        private javax.swing.JPanel nombre6;
        // End of variables declaration                   
    }