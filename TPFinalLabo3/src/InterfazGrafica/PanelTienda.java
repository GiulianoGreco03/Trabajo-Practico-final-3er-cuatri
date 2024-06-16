
package InterfazGrafica;

import java.awt.*;




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
    private javax.swing.JPanel avatar;
    private javax.swing.JPanel cambiarGorro;
    private javax.swing.JPanel cambiarLentes;
    private javax.swing.JPanel cambiarTraje;
    private javax.swing.JPanel gorroButton;
    private javax.swing.JPanel guardarButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private javax.swing.JPanel lentesButton9;
    private javax.swing.JLabel puntos;
    private java.awt.Label puntuacionLabel;
    private javax.swing.JPanel trajeButton10;


    //Constructores

    public PanelTienda() {
        initComponents();
    }

                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        trajeButton10 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        gorroButton = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        lentesButton9 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        Cosmetico1 = new javax.swing.JPanel();
        Cosmetico2 = new javax.swing.JPanel();
        Cosmetico3 = new javax.swing.JPanel();
        Cosmetico4 = new javax.swing.JPanel();
        Cosmetico5 = new javax.swing.JPanel();
        Cosmetico6 = new javax.swing.JPanel();
        Cosmetico7 = new javax.swing.JPanel();
        Cosmetico8 = new javax.swing.JPanel();
        Precio1 = new java.awt.Label();
        Precio2 = new java.awt.Label();
        Precio3 = new java.awt.Label();
        Precio4 = new java.awt.Label();
        Precio5 = new java.awt.Label();
        Precio6 = new java.awt.Label();
        Precio7 = new java.awt.Label();
        Precio8 = new java.awt.Label();
        puntuacionLabel = new java.awt.Label();
        puntos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cambiarGorro = new javax.swing.JPanel();
        label4 = new java.awt.Label();
        cambiarLentes = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        cambiarTraje = new javax.swing.JPanel();
        label6 = new java.awt.Label();
        avatar = new javax.swing.JPanel();
        guardarButton = new javax.swing.JPanel();
        label7 = new java.awt.Label();

        setBackground(new java.awt.Color(106, 25, 148));
        setForeground(new java.awt.Color(106, 25, 148));

        this.botonSeleccionado = gorroButton;
        setBotonSeleccionado(gorroButton);

        jTabbedPane1.setBackground(new java.awt.Color(106, 25, 148));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTabbedPane1.setOpaque(true);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        trajeButton10.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
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

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Trajes");

        javax.swing.GroupLayout trajeButton10Layout = new javax.swing.GroupLayout(trajeButton10);
        trajeButton10.setLayout(trajeButton10Layout);
        trajeButton10Layout.setHorizontalGroup(
            trajeButton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trajeButton10Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        trajeButton10Layout.setVerticalGroup(
            trajeButton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trajeButton10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gorroButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
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

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Gorros");

        javax.swing.GroupLayout gorroButtonLayout = new javax.swing.GroupLayout(gorroButton);
        gorroButton.setLayout(gorroButtonLayout);
        gorroButtonLayout.setHorizontalGroup(
            gorroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gorroButtonLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        gorroButtonLayout.setVerticalGroup(
            gorroButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gorroButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lentesButton9.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
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

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Lentes");

        javax.swing.GroupLayout lentesButton9Layout = new javax.swing.GroupLayout(lentesButton9);
        lentesButton9.setLayout(lentesButton9Layout);
        lentesButton9Layout.setHorizontalGroup(
            lentesButton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lentesButton9Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        lentesButton9Layout.setVerticalGroup(
            lentesButton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lentesButton9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Cosmetico1.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico1.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico1.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout Cosmetico1Layout = new javax.swing.GroupLayout(Cosmetico1);
        Cosmetico1.setLayout(Cosmetico1Layout);
        Cosmetico1Layout.setHorizontalGroup(
            Cosmetico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Cosmetico1Layout.setVerticalGroup(
            Cosmetico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        Cosmetico2.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico2.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico2.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout Cosmetico2Layout = new javax.swing.GroupLayout(Cosmetico2);
        Cosmetico2.setLayout(Cosmetico2Layout);
        Cosmetico2Layout.setHorizontalGroup(
            Cosmetico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Cosmetico2Layout.setVerticalGroup(
            Cosmetico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        Cosmetico3.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico3.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico3.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout Cosmetico3Layout = new javax.swing.GroupLayout(Cosmetico3);
        Cosmetico3.setLayout(Cosmetico3Layout);
        Cosmetico3Layout.setHorizontalGroup(
            Cosmetico3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Cosmetico3Layout.setVerticalGroup(
            Cosmetico3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        Cosmetico4.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico4.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico4.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout Cosmetico4Layout = new javax.swing.GroupLayout(Cosmetico4);
        Cosmetico4.setLayout(Cosmetico4Layout);
        Cosmetico4Layout.setHorizontalGroup(
            Cosmetico4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Cosmetico4Layout.setVerticalGroup(
            Cosmetico4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        Cosmetico5.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico5.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico5.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout Cosmetico5Layout = new javax.swing.GroupLayout(Cosmetico5);
        Cosmetico5.setLayout(Cosmetico5Layout);
        Cosmetico5Layout.setHorizontalGroup(
            Cosmetico5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Cosmetico5Layout.setVerticalGroup(
            Cosmetico5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        Cosmetico6.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico6.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico6.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout Cosmetico6Layout = new javax.swing.GroupLayout(Cosmetico6);
        Cosmetico6.setLayout(Cosmetico6Layout);
        Cosmetico6Layout.setHorizontalGroup(
            Cosmetico6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Cosmetico6Layout.setVerticalGroup(
            Cosmetico6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        Cosmetico7.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico7.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico7.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout Cosmetico7Layout = new javax.swing.GroupLayout(Cosmetico7);
        Cosmetico7.setLayout(Cosmetico7Layout);
        Cosmetico7Layout.setHorizontalGroup(
            Cosmetico7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Cosmetico7Layout.setVerticalGroup(
            Cosmetico7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        Cosmetico8.setBackground(new java.awt.Color(73, 128, 153));
        Cosmetico8.setMinimumSize(new java.awt.Dimension(150, 100));
        Cosmetico8.setPreferredSize(new java.awt.Dimension(120, 120));

        javax.swing.GroupLayout Cosmetico8Layout = new javax.swing.GroupLayout(Cosmetico8);
        Cosmetico8.setLayout(Cosmetico8Layout);
        Cosmetico8Layout.setHorizontalGroup(
            Cosmetico8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Cosmetico8Layout.setVerticalGroup(
            Cosmetico8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        Precio1.setAlignment(java.awt.Label.CENTER);
        Precio1.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        Precio1.setForeground(new java.awt.Color(255, 255, 255));
        Precio1.setText("label1");

        Precio2.setAlignment(java.awt.Label.CENTER);
        Precio2.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        Precio2.setForeground(new java.awt.Color(255, 255, 255));
        Precio2.setText("label1");

        Precio3.setAlignment(java.awt.Label.CENTER);
        Precio3.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        Precio3.setForeground(new java.awt.Color(255, 255, 255));
        Precio3.setText("label1");

        Precio4.setAlignment(java.awt.Label.CENTER);
        Precio4.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        Precio4.setForeground(new java.awt.Color(255, 255, 255));
        Precio4.setText("label1");

        Precio5.setAlignment(java.awt.Label.CENTER);
        Precio5.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        Precio5.setForeground(new java.awt.Color(255, 255, 255));
        Precio5.setText("label1");

        Precio6.setAlignment(java.awt.Label.CENTER);
        Precio6.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        Precio6.setForeground(new java.awt.Color(255, 255, 255));
        Precio6.setText("label1");

        Precio7.setAlignment(java.awt.Label.CENTER);
        Precio7.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        Precio7.setForeground(new java.awt.Color(255, 255, 255));
        Precio7.setText("label1");

        Precio8.setAlignment(java.awt.Label.CENTER);
        Precio8.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        Precio8.setForeground(new java.awt.Color(255, 255, 255));
        Precio8.setText("label1");

        puntuacionLabel.setAlignment(java.awt.Label.CENTER);
        puntuacionLabel.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        puntuacionLabel.setForeground(new java.awt.Color(255, 255, 255));
        puntuacionLabel.setPreferredSize(new java.awt.Dimension(100, 40));
        puntuacionLabel.setText("Puntuación");

        puntos.setBackground(new java.awt.Color(73, 128, 153));
        puntos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        puntos.setForeground(new java.awt.Color(255, 255, 255));
        puntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos.setOpaque(true);
        puntos.setPreferredSize(new java.awt.Dimension(100, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(gorroButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lentesButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(trajeButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Precio8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(puntuacionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(puntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gorroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lentesButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trajeButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cosmetico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Precio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cosmetico5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Precio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntuacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tienda", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 600));

        cambiarGorro.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
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

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Cambiar Gorro");

        javax.swing.GroupLayout cambiarGorroLayout = new javax.swing.GroupLayout(cambiarGorro);
        cambiarGorro.setLayout(cambiarGorroLayout);
        cambiarGorroLayout.setHorizontalGroup(
            cambiarGorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        cambiarGorroLayout.setVerticalGroup(
            cambiarGorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cambiarGorroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cambiarLentes.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
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

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Cambiar Lentes");

        javax.swing.GroupLayout cambiarLentesLayout = new javax.swing.GroupLayout(cambiarLentes);
        cambiarLentes.setLayout(cambiarLentesLayout);
        cambiarLentesLayout.setHorizontalGroup(
            cambiarLentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        cambiarLentesLayout.setVerticalGroup(
            cambiarLentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cambiarLentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cambiarTraje.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
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

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Cambiar Traje");

        javax.swing.GroupLayout cambiarTrajeLayout = new javax.swing.GroupLayout(cambiarTraje);
        cambiarTraje.setLayout(cambiarTrajeLayout);
        cambiarTrajeLayout.setHorizontalGroup(
            cambiarTrajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        cambiarTrajeLayout.setVerticalGroup(
            cambiarTrajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cambiarTrajeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        avatar.setPreferredSize(new java.awt.Dimension(400, 400));

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

        guardarButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
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

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Guardar Cambios");

        javax.swing.GroupLayout guardarButtonLayout = new javax.swing.GroupLayout(guardarButton);
        guardarButton.setLayout(guardarButtonLayout);
        guardarButtonLayout.setHorizontalGroup(
            guardarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        guardarButtonLayout.setVerticalGroup(
            guardarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardarButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        // TODO add your handling code here:
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


                   
    
                
}
