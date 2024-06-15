/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica;

import java.awt.*;

public class PanelTiendaAdmin extends Panel {

    
    public PanelTiendaAdmin() {
        initComponents();
    }

    private void initComponents() {

        backgorund1 = new javax.swing.JPanel();
        trajeButton10 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        gorroButton = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        lentesButton9 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
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
        habilitarDeshabilitar1 = new java.awt.Label();
        habilitarDeshabilitar2 = new java.awt.Label();
        habilitarDeshabilitar3 = new java.awt.Label();
        habilitarDeshabilitar4 = new java.awt.Label();
        habilitarDeshabilitar5 = new java.awt.Label();
        habilitarDeshabilitar6 = new java.awt.Label();
        habilitarDeshabilitar7 = new java.awt.Label();
        habilitarDeshabilitar8 = new java.awt.Label();
        cambiarPrecio1 = new javax.swing.JTextField();
        cambiarPrecio2 = new javax.swing.JTextField();
        cambiarPrecio3 = new javax.swing.JTextField();
        cambiarPrecio4 = new javax.swing.JTextField();
        cambiarPrecio5 = new javax.swing.JTextField();
        cambiarPrecio6 = new javax.swing.JTextField();
        cambiarPrecio7 = new javax.swing.JTextField();
        cambiarPrecio8 = new javax.swing.JTextField();

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

        icon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        icon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        icon3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        icon4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        icon5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        icon6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        icon7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        icon8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        habilitarDeshabilitar1.setAlignment(java.awt.Label.CENTER);
        habilitarDeshabilitar1.setBackground(new java.awt.Color(133, 36, 103));
        habilitarDeshabilitar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        habilitarDeshabilitar1.setForeground(new java.awt.Color(255, 255, 255));
        habilitarDeshabilitar1.setText("label1");
        habilitarDeshabilitar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar1MouseExited(evt);
            }
        });

        habilitarDeshabilitar2.setAlignment(java.awt.Label.CENTER);
        habilitarDeshabilitar2.setBackground(new java.awt.Color(133, 36, 103));
        habilitarDeshabilitar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        habilitarDeshabilitar2.setForeground(new java.awt.Color(255, 255, 255));
        habilitarDeshabilitar2.setText("label1");
        habilitarDeshabilitar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar2MouseExited(evt);
            }
        });

        habilitarDeshabilitar3.setAlignment(java.awt.Label.CENTER);
        habilitarDeshabilitar3.setBackground(new java.awt.Color(133, 36, 103));
        habilitarDeshabilitar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        habilitarDeshabilitar3.setForeground(new java.awt.Color(255, 255, 255));
        habilitarDeshabilitar3.setText("label1");
        habilitarDeshabilitar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar3MouseExited(evt);
            }
        });

        habilitarDeshabilitar4.setAlignment(java.awt.Label.CENTER);
        habilitarDeshabilitar4.setBackground(new java.awt.Color(133, 36, 103));
        habilitarDeshabilitar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        habilitarDeshabilitar4.setForeground(new java.awt.Color(255, 255, 255));
        habilitarDeshabilitar4.setText("label1");
        habilitarDeshabilitar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar4MouseExited(evt);
            }
        });

        habilitarDeshabilitar5.setAlignment(java.awt.Label.CENTER);
        habilitarDeshabilitar5.setBackground(new java.awt.Color(133, 36, 103));
        habilitarDeshabilitar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        habilitarDeshabilitar5.setForeground(new java.awt.Color(255, 255, 255));
        habilitarDeshabilitar5.setText("label1");
        habilitarDeshabilitar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar5MouseExited(evt);
            }
        });

        habilitarDeshabilitar6.setAlignment(java.awt.Label.CENTER);
        habilitarDeshabilitar6.setBackground(new java.awt.Color(133, 36, 103));
        habilitarDeshabilitar6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        habilitarDeshabilitar6.setForeground(new java.awt.Color(255, 255, 255));
        habilitarDeshabilitar6.setText("label1");
        habilitarDeshabilitar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar6MouseExited(evt);
            }
        });

        habilitarDeshabilitar7.setAlignment(java.awt.Label.CENTER);
        habilitarDeshabilitar7.setBackground(new java.awt.Color(133, 36, 103));
        habilitarDeshabilitar7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        habilitarDeshabilitar7.setForeground(new java.awt.Color(255, 255, 255));
        habilitarDeshabilitar7.setText("label1");
        habilitarDeshabilitar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar7MouseExited(evt);
            }
        });

        habilitarDeshabilitar8.setAlignment(java.awt.Label.CENTER);
        habilitarDeshabilitar8.setBackground(new java.awt.Color(133, 36, 103));
        habilitarDeshabilitar8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        habilitarDeshabilitar8.setForeground(new java.awt.Color(255, 255, 255));
        habilitarDeshabilitar8.setText("label1");
        habilitarDeshabilitar8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                habilitarDeshabilitar8MouseExited(evt);
            }
        });

        cambiarPrecio1.setBackground(new java.awt.Color(133, 36, 103));
        cambiarPrecio1.setForeground(new java.awt.Color(255, 255, 255));
        cambiarPrecio1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cambiarPrecio1.setText("CambiarPrecio");
        cambiarPrecio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarPrecio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarPrecio1MouseClicked(evt);
            }
        });
        cambiarPrecio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPrecio1ActionPerformed(evt);
            }
        });

        cambiarPrecio2.setBackground(new java.awt.Color(133, 36, 103));
        cambiarPrecio2.setForeground(new java.awt.Color(255, 255, 255));
        cambiarPrecio2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cambiarPrecio2.setText("CambiarPrecio");
        cambiarPrecio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarPrecio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarPrecio2MouseClicked(evt);
            }
        });
        cambiarPrecio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPrecio2ActionPerformed(evt);
            }
        });

        cambiarPrecio3.setBackground(new java.awt.Color(133, 36, 103));
        cambiarPrecio3.setForeground(new java.awt.Color(255, 255, 255));
        cambiarPrecio3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cambiarPrecio3.setText("CambiarPrecio");
        cambiarPrecio3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarPrecio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarPrecio3MouseClicked(evt);
            }
        });
        cambiarPrecio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPrecio3ActionPerformed(evt);
            }
        });

        cambiarPrecio4.setBackground(new java.awt.Color(133, 36, 103));
        cambiarPrecio4.setForeground(new java.awt.Color(255, 255, 255));
        cambiarPrecio4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cambiarPrecio4.setText("CambiarPrecio");
        cambiarPrecio4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarPrecio4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarPrecio4MouseClicked(evt);
            }
        });
        cambiarPrecio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPrecio4ActionPerformed(evt);
            }
        });

        cambiarPrecio5.setBackground(new java.awt.Color(133, 36, 103));
        cambiarPrecio5.setForeground(new java.awt.Color(255, 255, 255));
        cambiarPrecio5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cambiarPrecio5.setText("CambiarPrecio");
        cambiarPrecio5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarPrecio5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarPrecio5MouseClicked(evt);
            }
        });
        cambiarPrecio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPrecio5ActionPerformed(evt);
            }
        });

        cambiarPrecio6.setBackground(new java.awt.Color(133, 36, 103));
        cambiarPrecio6.setForeground(new java.awt.Color(255, 255, 255));
        cambiarPrecio6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cambiarPrecio6.setText("CambiarPrecio");
        cambiarPrecio6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarPrecio6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarPrecio6MouseClicked(evt);
            }
        });
        cambiarPrecio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPrecio6ActionPerformed(evt);
            }
        });

        cambiarPrecio7.setBackground(new java.awt.Color(133, 36, 103));
        cambiarPrecio7.setForeground(new java.awt.Color(255, 255, 255));
        cambiarPrecio7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cambiarPrecio7.setText("CambiarPrecio");
        cambiarPrecio7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarPrecio7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarPrecio7MouseClicked(evt);
            }
        });
        cambiarPrecio7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPrecio7ActionPerformed(evt);
            }
        });

        cambiarPrecio8.setBackground(new java.awt.Color(133, 36, 103));
        cambiarPrecio8.setForeground(new java.awt.Color(255, 255, 255));
        cambiarPrecio8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cambiarPrecio8.setText("CambiarPrecio");
        cambiarPrecio8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarPrecio8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarPrecio8MouseClicked(evt);
            }
        });
        cambiarPrecio8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPrecio8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgorund1Layout = new javax.swing.GroupLayout(backgorund1);
        backgorund1.setLayout(backgorund1Layout);
        backgorund1Layout.setHorizontalGroup(
            backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgorund1Layout.createSequentialGroup()
                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgorund1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgorund1Layout.createSequentialGroup()
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cambiarPrecio1)
                                            .addComponent(habilitarDeshabilitar1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))
                                .addGap(30, 30, 30)
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cambiarPrecio2)
                                            .addComponent(habilitarDeshabilitar2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))
                                .addGap(30, 30, 30)
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cambiarPrecio3)
                                            .addComponent(habilitarDeshabilitar3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))
                                .addGap(30, 30, 30)
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(habilitarDeshabilitar4, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                            .addComponent(cambiarPrecio4)))))
                            .addGroup(backgorund1Layout.createSequentialGroup()
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cambiarPrecio5)
                                            .addComponent(habilitarDeshabilitar5, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))
                                .addGap(30, 30, 30)
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cambiarPrecio6)
                                            .addComponent(habilitarDeshabilitar7, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))
                                .addGap(30, 30, 30)
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cambiarPrecio7)
                                            .addComponent(habilitarDeshabilitar6, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))
                                .addGap(30, 30, 30)
                                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cosmetico8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgorund1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(habilitarDeshabilitar8, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                            .addComponent(cambiarPrecio8)))))))
                    .addGroup(backgorund1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(gorroButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lentesButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(trajeButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        backgorund1Layout.setVerticalGroup(
            backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgorund1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gorroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lentesButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trajeButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cosmetico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(habilitarDeshabilitar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habilitarDeshabilitar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habilitarDeshabilitar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habilitarDeshabilitar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cambiarPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiarPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiarPrecio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiarPrecio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cosmetico5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cosmetico8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(habilitarDeshabilitar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habilitarDeshabilitar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habilitarDeshabilitar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habilitarDeshabilitar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(backgorund1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cambiarPrecio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiarPrecio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiarPrecio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiarPrecio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backgorund1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgorund1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void trajeButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trajeButton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_trajeButton10MouseClicked

    private void trajeButton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trajeButton10MouseEntered
        trajeButton10.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }//GEN-LAST:event_trajeButton10MouseEntered

    private void trajeButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trajeButton10MouseExited
        if(botonSeleccionado != trajeButton10){
            trajeButton10.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }//GEN-LAST:event_trajeButton10MouseExited

    private void gorroButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gorroButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_gorroButtonMouseClicked

    private void gorroButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gorroButtonMouseEntered
        gorroButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }//GEN-LAST:event_gorroButtonMouseEntered

    private void gorroButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gorroButtonMouseExited
        if(botonSeleccionado != gorroButton){
            gorroButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }//GEN-LAST:event_gorroButtonMouseExited

    private void lentesButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lentesButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lentesButton9MouseClicked

    private void lentesButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lentesButton9MouseEntered
        lentesButton9.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }//GEN-LAST:event_lentesButton9MouseEntered

    private void lentesButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lentesButton9MouseExited
        if(botonSeleccionado != lentesButton9){
            lentesButton9.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }//GEN-LAST:event_lentesButton9MouseExited

    private void cambiarPrecio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPrecio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio1ActionPerformed

    private void cambiarPrecio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPrecio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio2ActionPerformed

    private void cambiarPrecio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPrecio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio3ActionPerformed

    private void cambiarPrecio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPrecio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio4ActionPerformed

    private void cambiarPrecio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPrecio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio5ActionPerformed

    private void cambiarPrecio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPrecio6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio6ActionPerformed

    private void cambiarPrecio7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPrecio7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio7ActionPerformed

    private void cambiarPrecio8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPrecio8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio8ActionPerformed

    private void habilitarDeshabilitar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_habilitarDeshabilitar1MouseClicked

    private void habilitarDeshabilitar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar1MouseEntered
        habilitarDeshabilitar1.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }//GEN-LAST:event_habilitarDeshabilitar1MouseEntered

    private void habilitarDeshabilitar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar1MouseExited
            habilitarDeshabilitar1.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    //GEN-LAST:event_habilitarDeshabilitar1MouseExited

    private void habilitarDeshabilitar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar2MouseEntered
        habilitarDeshabilitar2.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }//GEN-LAST:event_habilitarDeshabilitar2MouseEntered

    private void habilitarDeshabilitar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar2MouseExited
        habilitarDeshabilitar2.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
    }//GEN-LAST:event_habilitarDeshabilitar2MouseExited

    private void habilitarDeshabilitar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_habilitarDeshabilitar2MouseClicked

    private void habilitarDeshabilitar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar3MouseEntered
        habilitarDeshabilitar3.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }//GEN-LAST:event_habilitarDeshabilitar3MouseEntered

    private void habilitarDeshabilitar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar3MouseExited
        habilitarDeshabilitar3.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
    }//GEN-LAST:event_habilitarDeshabilitar3MouseExited

    private void habilitarDeshabilitar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_habilitarDeshabilitar3MouseClicked

    private void habilitarDeshabilitar4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar4MouseEntered
        habilitarDeshabilitar4.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }//GEN-LAST:event_habilitarDeshabilitar4MouseEntered

    private void habilitarDeshabilitar4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar4MouseExited
        habilitarDeshabilitar4.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
    }//GEN-LAST:event_habilitarDeshabilitar4MouseExited

    private void habilitarDeshabilitar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_habilitarDeshabilitar4MouseClicked

    private void habilitarDeshabilitar5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar5MouseEntered
        habilitarDeshabilitar5.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }//GEN-LAST:event_habilitarDeshabilitar5MouseEntered

    private void habilitarDeshabilitar5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar5MouseExited
        habilitarDeshabilitar5.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
    }//GEN-LAST:event_habilitarDeshabilitar5MouseExited

    private void habilitarDeshabilitar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_habilitarDeshabilitar5MouseClicked

    private void habilitarDeshabilitar6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar6MouseEntered
        habilitarDeshabilitar6.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }//GEN-LAST:event_habilitarDeshabilitar6MouseEntered

    private void habilitarDeshabilitar6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar6MouseExited
        habilitarDeshabilitar6.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
    }//GEN-LAST:event_habilitarDeshabilitar6MouseExited

    private void habilitarDeshabilitar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_habilitarDeshabilitar6MouseClicked

    private void habilitarDeshabilitar7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar7MouseEntered
        habilitarDeshabilitar7.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }//GEN-LAST:event_habilitarDeshabilitar7MouseEntered

    private void habilitarDeshabilitar7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar7MouseExited
        habilitarDeshabilitar7.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
    }//GEN-LAST:event_habilitarDeshabilitar7MouseExited

    private void habilitarDeshabilitar7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_habilitarDeshabilitar7MouseClicked

    private void habilitarDeshabilitar8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar8MouseEntered
        habilitarDeshabilitar8.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }//GEN-LAST:event_habilitarDeshabilitar8MouseEntered

    private void habilitarDeshabilitar8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar8MouseExited
        habilitarDeshabilitar8.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
    }//GEN-LAST:event_habilitarDeshabilitar8MouseExited

    private void habilitarDeshabilitar8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarDeshabilitar8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_habilitarDeshabilitar8MouseClicked

    private void cambiarPrecio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarPrecio1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio1MouseClicked

    private void cambiarPrecio2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarPrecio2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio2MouseClicked

    private void cambiarPrecio3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarPrecio3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio3MouseClicked

    private void cambiarPrecio4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarPrecio4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio4MouseClicked

    private void cambiarPrecio5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarPrecio5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio5MouseClicked

    private void cambiarPrecio6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarPrecio6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio6MouseClicked

    private void cambiarPrecio7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarPrecio7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio7MouseClicked

    private void cambiarPrecio8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarPrecio8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarPrecio8MouseClicked

    private void icon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_icon1MouseClicked

    private void icon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_icon2MouseClicked

    private void icon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_icon3MouseClicked

    private void icon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_icon4MouseClicked

    private void icon5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_icon5MouseClicked

    private void icon6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_icon6MouseClicked

    private void icon7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_icon7MouseClicked

    private void icon8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_icon8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cosmetico1;
    private javax.swing.JPanel Cosmetico2;
    private javax.swing.JPanel Cosmetico3;
    private javax.swing.JPanel Cosmetico4;
    private javax.swing.JPanel Cosmetico5;
    private javax.swing.JPanel Cosmetico6;
    private javax.swing.JPanel Cosmetico7;
    private javax.swing.JPanel Cosmetico8;
    private javax.swing.JPanel backgorund1;
    private javax.swing.JTextField cambiarPrecio1;
    private javax.swing.JTextField cambiarPrecio2;
    private javax.swing.JTextField cambiarPrecio3;
    private javax.swing.JTextField cambiarPrecio4;
    private javax.swing.JTextField cambiarPrecio5;
    private javax.swing.JTextField cambiarPrecio6;
    private javax.swing.JTextField cambiarPrecio7;
    private javax.swing.JTextField cambiarPrecio8;
    private javax.swing.JPanel gorroButton;
    private java.awt.Label habilitarDeshabilitar1;
    private java.awt.Label habilitarDeshabilitar2;
    private java.awt.Label habilitarDeshabilitar3;
    private java.awt.Label habilitarDeshabilitar4;
    private java.awt.Label habilitarDeshabilitar5;
    private java.awt.Label habilitarDeshabilitar6;
    private java.awt.Label habilitarDeshabilitar7;
    private java.awt.Label habilitarDeshabilitar8;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JLabel icon6;
    private javax.swing.JLabel icon7;
    private javax.swing.JLabel icon8;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JPanel lentesButton9;
    private javax.swing.JPanel trajeButton10;
    // End of variables declaration//GEN-END:variables
}
