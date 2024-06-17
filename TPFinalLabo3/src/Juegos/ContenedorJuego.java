/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Juegos;

import java.awt.Color;

import javax.swing.JPanel;

import InterfazGrafica.FramePrincipal;
import InterfazGrafica.PaletaDeColores;
import InterfazGrafica.Panel;
import InterfazGrafica.PanelJuegos;

/**
 *
 * @author Usuario
 */
public class ContenedorJuego extends Panel {

    PanelJuegos panelAnterior;
    FramePrincipal framePrincipal;
    JPanel juego;

    
    public ContenedorJuego(PanelJuegos panelAnterior, FramePrincipal framePrincipal, JPanel juego) {
        this.panelAnterior = panelAnterior;
        this.framePrincipal = framePrincipal;
        this.juego = juego;
       
        initComponents();

        juego.requestFocusInWindow();
        
    }

    private void initComponents() {

        
        instruccionesJuego = new javax.swing.JLabel();
        volverButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 0, 102));
        

        panelJuego = juego;
        panelJuego.setPreferredSize(new java.awt.Dimension(500, 500));
        panelJuego.requestFocus();

        javax.swing.GroupLayout panelJuegoLayout = new javax.swing.GroupLayout(panelJuego);
        panelJuego.setLayout(panelJuegoLayout);
        panelJuegoLayout.setHorizontalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        panelJuegoLayout.setVerticalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        instruccionesJuego.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        instruccionesJuego.setForeground(new java.awt.Color(255, 255, 255));
        instruccionesJuego.setText("Controles: Flechas");

        volverButton.setBackground(new java.awt.Color(133, 36, 103));
        volverButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverButtonMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Volver");

        javax.swing.GroupLayout volverButtonLayout = new javax.swing.GroupLayout(volverButton);
        volverButton.setLayout(volverButtonLayout);
        volverButtonLayout.setHorizontalGroup(
            volverButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        volverButtonLayout.setVerticalGroup(
            volverButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volverButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(instruccionesJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volverButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(instruccionesJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(panelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void volverButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverButtonMouseEntered
        volverButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R,
                PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }

    private void volverButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverButtonMouseExited
        volverButton.setBackground(new Color(PaletaDeColores.Botones.R,
        PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
    }

    private void volverButtonMouseClicked(java.awt.event.MouseEvent evt) {
        this.removeAll();
        framePrincipal.cambiarPanelPrincipal(framePrincipal.volverAtras());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel instruccionesJuego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelJuego;
    private javax.swing.JPanel volverButton;
    // End of variables declaration//GEN-END:variables
}
