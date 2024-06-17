/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica;
import java.awt.*;

import Excepciones.CampoVacioException;
import Usuarios.GestorUsuarios;
import Usuarios.Usuario;
/**
 *
 * @author Usuario
 */
public class PanelPerfil extends Panel {

    //atributos

    private Usuario usuario;
    private MainFrame mainFrame;
    private GestorUsuarios listadoUsuarios;
    
    //variables swing
    private javax.swing.JPanel background;
    private javax.swing.JPanel cerrarSesionButton;
    private javax.swing.JPanel confirmarButton;
    private javax.swing.JPanel darDeBajaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JTextField textFieldCambiarContraseña;


    public PanelPerfil(Usuario usuarioActivo, MainFrame mainFrame) {
        this.usuario = usuarioActivo;
        this.mainFrame = mainFrame;
        initComponents();
    }


    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldCambiarContraseña = new javax.swing.JTextField();
        confirmarButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cerrarSesionButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        darDeBajaButton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        background.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nombre de usuario");

        nombreUsuario.setBackground(new java.awt.Color(73, 128, 153));
        nombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreUsuario.setText(usuario.getNombre());
        nombreUsuario.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Cambiar contraseña");

        textFieldCambiarContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldCambiarContraseña.setText("");
        textFieldCambiarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldCambiarContraseñaMouseClicked(evt);
            }
        });
        textFieldCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCambiarContraseñaActionPerformed(evt);
            }
        });

        confirmarButton.setBackground(new java.awt.Color(133, 36, 103));
        confirmarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmarButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmarButtonMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Confirmar");

        javax.swing.GroupLayout confirmarButtonLayout = new javax.swing.GroupLayout(confirmarButton);
        confirmarButton.setLayout(confirmarButtonLayout);
        confirmarButtonLayout.setHorizontalGroup(
            confirmarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        confirmarButtonLayout.setVerticalGroup(
            confirmarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        cerrarSesionButton.setBackground(new java.awt.Color(133, 36, 103));
        cerrarSesionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarSesionButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarSesionButtonMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cerrar sesión");

        javax.swing.GroupLayout cerrarSesionButtonLayout = new javax.swing.GroupLayout(cerrarSesionButton);
        cerrarSesionButton.setLayout(cerrarSesionButtonLayout);
        cerrarSesionButtonLayout.setHorizontalGroup(
            cerrarSesionButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        cerrarSesionButtonLayout.setVerticalGroup(
            cerrarSesionButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        darDeBajaButton.setBackground(new java.awt.Color(133, 36, 103));
        darDeBajaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        darDeBajaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                darDeBajaButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                darDeBajaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                darDeBajaButtonMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Dar de baja usuario");

        javax.swing.GroupLayout darDeBajaButtonLayout = new javax.swing.GroupLayout(darDeBajaButton);
        darDeBajaButton.setLayout(darDeBajaButtonLayout);
        darDeBajaButtonLayout.setHorizontalGroup(
            darDeBajaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        darDeBajaButtonLayout.setVerticalGroup(
            darDeBajaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(textFieldCambiarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(confirmarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(cerrarSesionButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(darDeBajaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nombreUsuario)
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(textFieldCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(confirmarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrarSesionButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(darDeBajaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCambiarContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldCambiarContraseñaMouseClicked
        textFieldCambiarContraseña.setText("");
        jLabel4.setText("Confirmar");
    }//GEN-LAST:event_textFieldCambiarContraseñaMouseClicked

    private void textFieldCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCambiarContraseñaActionPerformed
        // TODO add your handling code here:
    }

    private void confirmarButtonMouseEntered(java.awt.event.MouseEvent evt) {
        confirmarButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }

    private void confirmarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarButtonMouseExited
        if(botonSeleccionado != confirmarButton){
            confirmarButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }

    private void confirmarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarButtonMouseClicked
        String contraseña = textFieldCambiarContraseña.getText();

        try {
            if(!contraseña.isBlank()){
              listadoUsuarios = new GestorUsuarios();
              usuario.setContraseña(contraseña);
              jLabel4.setText("Contraseña cambiada");
              listadoUsuarios.cargarUsuarioJson(usuario);  
            } else {
                throw new CampoVacioException();
            }
        } catch (CampoVacioException e) {
            System.out.println(e.getMessage());
            jLabel4.setText("Campo vacio");
        }
    }

    private void cerrarSesionButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionButtonMouseEntered
        cerrarSesionButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }//GEN-LAST:event_cerrarSesionButtonMouseEntered

    private void cerrarSesionButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionButtonMouseExited
        if(botonSeleccionado != cerrarSesionButton){
            cerrarSesionButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }//GEN-LAST:event_cerrarSesionButtonMouseExited

    private void cerrarSesionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionButtonMouseClicked
        mainFrame.showPanelLogin();
    }

    private void darDeBajaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darDeBajaButtonMouseEntered
        darDeBajaButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }//GEN-LAST:event_darDeBajaButtonMouseEntered

    private void darDeBajaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darDeBajaButtonMouseExited
        if(botonSeleccionado != darDeBajaButton){
            darDeBajaButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }//GEN-LAST:event_darDeBajaButtonMouseExited

    private void darDeBajaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darDeBajaButtonMouseClicked
        listadoUsuarios = new GestorUsuarios();
        usuario.setCuentaActiva(false);
        listadoUsuarios.cargarUsuarioJson(usuario);
        mainFrame.showPanelLogin();
    }


    
    
    
}