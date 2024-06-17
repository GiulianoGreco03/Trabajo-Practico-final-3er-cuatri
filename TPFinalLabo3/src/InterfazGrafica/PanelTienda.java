
package InterfazGrafica;

import java.awt.*;

import Avatares.Avatar;




public class PanelTienda extends Panel {


    //Componentes Swing
    private javax.swing.JPanel Cosmetico1;
    private javax.swing.JPanel Cosmetico2;
    private javax.swing.JPanel Cosmetico3;
    private javax.swing.JPanel Cosmetico4;
    private javax.swing.JPanel Cosmetico5;
    private javax.swing.JPanel Cosmetico6;
    private javax.swing.JPanel Cosmetico7;
    private javax.swing.JPanel Cosmetico8;
    private java.awt.Label Precio1;
    private java.awt.Label Precio2;
    private java.awt.Label Precio3;
    private java.awt.Label Precio4;
    private java.awt.Label Precio5;
    private java.awt.Label Precio6;
    private java.awt.Label Precio7;
    private java.awt.Label Precio8;
   // private javax.swing.JPanel avatar;
    private javax.swing.JPanel backgorund1;
    private javax.swing.JPanel cambiarGorro;
    private javax.swing.JPanel cambiarLentes;
    private javax.swing.JPanel cambiarTraje;
    private javax.swing.JPanel gorroButton;
    private javax.swing.JPanel guardarButton;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JLabel icon6;
    private javax.swing.JLabel icon7;
    private javax.swing.JLabel icon8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel lentesButton9;
    private javax.swing.JLabel puntos;
    private javax.swing.JPanel trajeButton10;
    private Avatar avatar;
    // End of variables declaration    


    //Constructores

    public PanelTienda() {
        initComponents();
        this.botonSeleccionado = null;
        setBotonSeleccionado(gorroButton);
    }
                      
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        backgorund1 = new javax.swing.JPanel();
        trajeButton10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        gorroButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lentesButton9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Cosmetico1 = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        Cosmetico2 = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        Cosmetico3 = new javax.swing.JPanel();
        icon3 = new javax.swing.JLabel();
        Cosmetico4 = new javax.swing.JPanel();
        icon4 = new javax.swing.JLabel();
        Cosmetico5 = new javax.swing.JPanel();
        icon5 = new javax.swing.JLabel();
        Cosmetico6 = new javax.swing.JPanel();
        icon6 = new javax.swing.JLabel();
        Cosmetico7 = new javax.swing.JPanel();
        icon7 = new javax.swing.JLabel();
        Cosmetico8 = new javax.swing.JPanel();
        icon8 = new javax.swing.JLabel();
        Precio1 = new java.awt.Label();
        Precio2 = new java.awt.Label();
        Precio3 = new java.awt.Label();
        Precio4 = new java.awt.Label();
        Precio5 = new java.awt.Label();
        Precio6 = new java.awt.Label();
        Precio7 = new java.awt.Label();
        Precio8 = new java.awt.Label();
        puntos = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cambiarGorro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cambiarLentes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cambiarTraje = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        avatar = new Avatar(400);
        guardarButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(106, 25, 148));
        setForeground(new java.awt.Color(106, 25, 148));

        jTabbedPane1.setBackground(new java.awt.Color(106, 25, 148));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTabbedPane1.setOpaque(true);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(600, 600));

        backgorund1.setBackground(new java.awt.Color(255, 255, 255));

        trajeButton10.setBackground(new java.awt.Color(133, 36, 103));
        trajeButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trajeButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trajeButton10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                trajeButton10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                trajeButton10MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Trajes");

        javax.swing.GroupLayout trajeButton10Layout = new javax.swing.GroupLayout(trajeButton10);
        trajeButton10.setLayout(trajeButton10Layout);
        trajeButton10Layout.setHorizontalGroup(
            trajeButton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        trajeButton10Layout.setVerticalGroup(
            trajeButton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        gorroButton.setBackground(new java.awt.Color(133, 36, 103));
        gorroButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gorroButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gorroButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gorroButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gorroButtonMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gorros");

        javax.swing.GroupLayout gorroButtonLayout = new javax.swing.GroupLayout(gorroButton);
        gorroButton.setLayout(gorroButtonLayout);
        gorroButtonLayout.setHorizontalGroup(
            gorroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        gorroButtonLayout.setVerticalGroup(
            gorroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lentesButton9.setBackground(new java.awt.Color(133, 36, 103));
        lentesButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lentesButton9.setPreferredSize(new java.awt.Dimension(150, 40));
        lentesButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lentesButton9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lentesButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lentesButton9MouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Lentes");

        javax.swing.GroupLayout lentesButton9Layout = new javax.swing.GroupLayout(lentesButton9);
        lentesButton9.setLayout(lentesButton9Layout);
        lentesButton9Layout.setHorizontalGroup(
            lentesButton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        lentesButton9Layout.setVerticalGroup(
            lentesButton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Cosmetico1.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico1.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico1.setPreferredSize(new java.awt.Dimension(120, 120));

        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Cosmetico1Layout = new javax.swing.GroupLayout(Cosmetico1);
        Cosmetico1.setLayout(Cosmetico1Layout);
        Cosmetico1Layout.setHorizontalGroup(
            Cosmetico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cosmetico1Layout.createSequentialGroup()
                .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Cosmetico1Layout.setVerticalGroup(
            Cosmetico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        Cosmetico2.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico2.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico2.setPreferredSize(new java.awt.Dimension(120, 120));

        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Cosmetico2Layout = new javax.swing.GroupLayout(Cosmetico2);
        Cosmetico2.setLayout(Cosmetico2Layout);
        Cosmetico2Layout.setHorizontalGroup(
            Cosmetico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cosmetico2Layout.createSequentialGroup()
                .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Cosmetico2Layout.setVerticalGroup(
            Cosmetico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        Cosmetico3.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico3.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico3.setPreferredSize(new java.awt.Dimension(120, 120));

        icon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Cosmetico3Layout = new javax.swing.GroupLayout(Cosmetico3);
        Cosmetico3.setLayout(Cosmetico3Layout);
        Cosmetico3Layout.setHorizontalGroup(
            Cosmetico3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cosmetico3Layout.createSequentialGroup()
                .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Cosmetico3Layout.setVerticalGroup(
            Cosmetico3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        Cosmetico4.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico4.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico4.setPreferredSize(new java.awt.Dimension(120, 120));

        icon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Cosmetico4Layout = new javax.swing.GroupLayout(Cosmetico4);
        Cosmetico4.setLayout(Cosmetico4Layout);
        Cosmetico4Layout.setHorizontalGroup(
            Cosmetico4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cosmetico4Layout.createSequentialGroup()
                .addComponent(icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Cosmetico4Layout.setVerticalGroup(
            Cosmetico4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        Cosmetico5.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico5.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico5.setPreferredSize(new java.awt.Dimension(120, 120));

        icon5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Cosmetico5Layout = new javax.swing.GroupLayout(Cosmetico5);
        Cosmetico5.setLayout(Cosmetico5Layout);
        Cosmetico5Layout.setHorizontalGroup(
            Cosmetico5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cosmetico5Layout.createSequentialGroup()
                .addComponent(icon5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Cosmetico5Layout.setVerticalGroup(
            Cosmetico5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        Cosmetico6.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico6.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico6.setPreferredSize(new java.awt.Dimension(120, 120));

        icon6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Cosmetico6Layout = new javax.swing.GroupLayout(Cosmetico6);
        Cosmetico6.setLayout(Cosmetico6Layout);
        Cosmetico6Layout.setHorizontalGroup(
            Cosmetico6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cosmetico6Layout.createSequentialGroup()
                .addComponent(icon6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Cosmetico6Layout.setVerticalGroup(
            Cosmetico6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon6, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        Cosmetico7.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico7.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico7.setPreferredSize(new java.awt.Dimension(120, 120));

        icon7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Cosmetico7Layout = new javax.swing.GroupLayout(Cosmetico7);
        Cosmetico7.setLayout(Cosmetico7Layout);
        Cosmetico7Layout.setHorizontalGroup(
            Cosmetico7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cosmetico7Layout.createSequentialGroup()
                .addComponent(icon7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Cosmetico7Layout.setVerticalGroup(
            Cosmetico7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon7, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        Cosmetico8.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico8.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico8.setPreferredSize(new java.awt.Dimension(120, 120));

        icon8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Cosmetico8Layout = new javax.swing.GroupLayout(Cosmetico8);
        Cosmetico8.setLayout(Cosmetico8Layout);
        Cosmetico8Layout.setHorizontalGroup(
            Cosmetico8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cosmetico8Layout.createSequentialGroup()
                .addComponent(icon8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Cosmetico8Layout.setVerticalGroup(
            Cosmetico8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon8, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        Precio1.setAlignment(java.awt.Label.CENTER);
        Precio1.setBackground(new java.awt.Color(133, 36, 103));
        Precio1.setForeground(new java.awt.Color(255, 255, 255));
        Precio1.setText("label1");

        Precio2.setAlignment(java.awt.Label.CENTER);
        Precio2.setBackground(new java.awt.Color(133, 36, 103));
        Precio2.setForeground(new java.awt.Color(255, 255, 255));
        Precio2.setText("label1");

        Precio3.setAlignment(java.awt.Label.CENTER);
        Precio3.setBackground(new java.awt.Color(133, 36, 103));
        Precio3.setForeground(new java.awt.Color(255, 255, 255));
        Precio3.setText("label1");

        Precio4.setAlignment(java.awt.Label.CENTER);
        Precio4.setBackground(new java.awt.Color(133, 36, 103));
        Precio4.setForeground(new java.awt.Color(255, 255, 255));
        Precio4.setText("label1");

        Precio5.setAlignment(java.awt.Label.CENTER);
        Precio5.setBackground(new java.awt.Color(133, 36, 103));
        Precio5.setForeground(new java.awt.Color(255, 255, 255));
        Precio5.setText("label1");

        Precio6.setAlignment(java.awt.Label.CENTER);
        Precio6.setBackground(new java.awt.Color(133, 36, 103));
        Precio6.setForeground(new java.awt.Color(255, 255, 255));
        Precio6.setText("label1");

        Precio7.setAlignment(java.awt.Label.CENTER);
        Precio7.setBackground(new java.awt.Color(133, 36, 103));
        Precio7.setForeground(new java.awt.Color(255, 255, 255));
        Precio7.setText("label1");

        Precio8.setAlignment(java.awt.Label.CENTER);
        Precio8.setBackground(new java.awt.Color(133, 36, 103));
        Precio8.setForeground(new java.awt.Color(255, 255, 255));
        Precio8.setText("label1");

        puntos.setBackground(new java.awt.Color(73, 128, 153));
        puntos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        puntos.setForeground(new java.awt.Color(255, 255, 255));
        puntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        puntos.setOpaque(true);
        puntos.setPreferredSize(new java.awt.Dimension(100, 40));

        jLabel8.setBackground(new java.awt.Color(133, 36, 103));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Puntuación");
        jLabel8.setOpaque(true);

        javax.swing.GroupLayout backgorund1Layout = new javax.swing.GroupLayout(backgorund1);
        backgorund1.setLayout(backgorund1Layout);
        backgorund1Layout.setHorizontalGroup(
            backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgorund1Layout.createSequentialGroup()
                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgorund1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(gorroButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lentesButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(trajeButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgorund1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgorund1Layout.createSequentialGroup()
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(backgorund1Layout.createSequentialGroup()
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(backgorund1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(puntos, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        backgorund1Layout.setVerticalGroup(
            backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgorund1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gorroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lentesButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trajeButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cosmetico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Precio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cosmetico5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Precio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tienda", backgorund1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 600));

        cambiarGorro.setBackground(new java.awt.Color(133, 36, 103));
        cambiarGorro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarGorro.setPreferredSize(new java.awt.Dimension(150, 40));
        cambiarGorro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarGorroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarGorroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cambiarGorroMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cambiar gorro");

        javax.swing.GroupLayout cambiarGorroLayout = new javax.swing.GroupLayout(cambiarGorro);
        cambiarGorro.setLayout(cambiarGorroLayout);
        cambiarGorroLayout.setHorizontalGroup(
            cambiarGorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        cambiarGorroLayout.setVerticalGroup(
            cambiarGorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        cambiarLentes.setBackground(new java.awt.Color(133, 36, 103));
        cambiarLentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarLentes.setPreferredSize(new java.awt.Dimension(150, 40));
        cambiarLentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarLentesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarLentesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cambiarLentesMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cambiar lentes");

        javax.swing.GroupLayout cambiarLentesLayout = new javax.swing.GroupLayout(cambiarLentes);
        cambiarLentes.setLayout(cambiarLentesLayout);
        cambiarLentesLayout.setHorizontalGroup(
            cambiarLentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        cambiarLentesLayout.setVerticalGroup(
            cambiarLentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cambiarTraje.setBackground(new java.awt.Color(133, 36, 103));
        cambiarTraje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarTraje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarTrajeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cambiarTrajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cambiarTrajeMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cambiar traje");

        javax.swing.GroupLayout cambiarTrajeLayout = new javax.swing.GroupLayout(cambiarTraje);
        cambiarTraje.setLayout(cambiarTrajeLayout);
        cambiarTrajeLayout.setHorizontalGroup(
            cambiarTrajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        cambiarTrajeLayout.setVerticalGroup(
            cambiarTrajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        
        //avatar.setPreferredSize(new java.awt.Dimension(400, 400));
        

        javax.swing.GroupLayout avatarLayout = new javax.swing.GroupLayout(avatar);
        avatar.setLayout(avatarLayout);
        avatarLayout.setHorizontalGroup(
            avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        avatarLayout.setVerticalGroup(
            avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        guardarButton.setBackground(new java.awt.Color(133, 36, 103));
        guardarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarButton.setPreferredSize(new java.awt.Dimension(150, 40));
        guardarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarButtonMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Guardar");

        javax.swing.GroupLayout guardarButtonLayout = new javax.swing.GroupLayout(guardarButton);
        guardarButton.setLayout(guardarButtonLayout);
        guardarButtonLayout.setHorizontalGroup(
            guardarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        guardarButtonLayout.setVerticalGroup(
            guardarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(cambiarGorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(cambiarLentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(cambiarTraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(guardarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(guardarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cambiarGorro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cambiarLentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cambiarTraje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Personalizar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>                        

    private void gorroButtonMouseEntered(java.awt.event.MouseEvent evt) {                                         
        gorroButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }                                        

    private void gorroButtonMouseExited(java.awt.event.MouseEvent evt) {                                        
        if(botonSeleccionado != gorroButton){
            gorroButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }                                       

    private void gorroButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
        if(botonSeleccionado != gorroButton){
            setBotonSeleccionado(gorroButton);
        }
    }                                        

    private void lentesButton9MouseEntered(java.awt.event.MouseEvent evt) {                                           
            lentesButton9.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }                                          

    private void lentesButton9MouseExited(java.awt.event.MouseEvent evt) {                                          
        if(botonSeleccionado != lentesButton9){
            lentesButton9.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }                                         

    private void lentesButton9MouseClicked(java.awt.event.MouseEvent evt) {                                           
        if(botonSeleccionado != lentesButton9){
            setBotonSeleccionado(lentesButton9);
        }
    }                                          

    private void trajeButton10MouseEntered(java.awt.event.MouseEvent evt) {                                           
        trajeButton10.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }                                          

    private void trajeButton10MouseExited(java.awt.event.MouseEvent evt) {                                          
        if(botonSeleccionado != trajeButton10){
            trajeButton10.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }                                         

    private void trajeButton10MouseClicked(java.awt.event.MouseEvent evt) {                                           
        if(botonSeleccionado != trajeButton10){
            setBotonSeleccionado(trajeButton10);
        }
    }                                          

    private void guardarButtonMouseEntered(java.awt.event.MouseEvent evt) {                                           
        guardarButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }                                          

    private void guardarButtonMouseExited(java.awt.event.MouseEvent evt) {                                          
        if(botonSeleccionado != guardarButton){
            guardarButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }                                         

    private void guardarButtonMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void cambiarGorroMouseEntered(java.awt.event.MouseEvent evt) {                                          
        cambiarGorro.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }                                         

    private void cambiarGorroMouseExited(java.awt.event.MouseEvent evt) {                                         
        if(botonSeleccionado != cambiarGorro){
            cambiarGorro.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }                                        

    private void cambiarGorroMouseClicked(java.awt.event.MouseEvent evt) {                                          
        avatar.cambiarGorro();
    }                                         

    private void cambiarLentesMouseEntered(java.awt.event.MouseEvent evt) {                                           
        cambiarLentes.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }                                          

    private void cambiarLentesMouseExited(java.awt.event.MouseEvent evt) {                                          
        if(botonSeleccionado != cambiarLentes){
            cambiarLentes.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }                                         

    private void cambiarLentesMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void cambiarTrajeMouseEntered(java.awt.event.MouseEvent evt) {                                          
        cambiarTraje.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }                                         

    private void cambiarTrajeMouseExited(java.awt.event.MouseEvent evt) {                                         
        if(botonSeleccionado != cambiarTraje){
            cambiarTraje.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }                                        

    private void cambiarTrajeMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
    }                                          

    private void icon1MouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void icon2MouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void icon3MouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void icon4MouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void icon5MouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void icon6MouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void icon7MouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void icon8MouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

                
                   
}
