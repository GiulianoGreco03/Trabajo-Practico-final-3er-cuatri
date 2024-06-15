/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica;

/**
 *
 * @author Usuario
 */
public class PanelPerfilAdmin extends Panel {

    /**
     * Creates new form PanelPerfilAdmin
     */
    public PanelPerfilAdmin() {
        initComponents();
    }

    
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelUsuario = new javax.swing.JPanel();
        Usuario1 = new javax.swing.JLabel();
        Usuario2 = new javax.swing.JLabel();
        Usuario3 = new javax.swing.JLabel();
        Usuario4 = new javax.swing.JLabel();
        Usuario5 = new javax.swing.JLabel();
        Usuario6 = new javax.swing.JLabel();
        Usuario7 = new javax.swing.JLabel();
        Usuario8 = new javax.swing.JLabel();
        flechaCargarUsuarios = new javax.swing.JLabel();
        seleccionarUsuario = new javax.swing.JTextField();
        usuarioSeleccionado = new javax.swing.JLabel();
        darDeBajaButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        background.setBackground(new java.awt.Color(255, 255, 255));

        panelUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelUsuario.setOpaque(false);
        panelUsuario.setPreferredSize(new java.awt.Dimension(450, 600));

        Usuario1.setBackground(new java.awt.Color(133, 36, 103));
        Usuario1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuario1.setForeground(new java.awt.Color(255, 255, 255));
        Usuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario1.setText("JuanitaGamer");
        Usuario1.setOpaque(true);
        Usuario1.setPreferredSize(new java.awt.Dimension(350, 25));

        Usuario2.setBackground(new java.awt.Color(133, 36, 103));
        Usuario2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuario2.setForeground(new java.awt.Color(255, 255, 255));
        Usuario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario2.setText("JuanitaGamer");
        Usuario2.setOpaque(true);
        Usuario2.setPreferredSize(new java.awt.Dimension(350, 25));

        Usuario3.setBackground(new java.awt.Color(133, 36, 103));
        Usuario3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuario3.setForeground(new java.awt.Color(255, 255, 255));
        Usuario3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario3.setText("JuanitaGamer");
        Usuario3.setOpaque(true);
        Usuario3.setPreferredSize(new java.awt.Dimension(350, 25));

        Usuario4.setBackground(new java.awt.Color(133, 36, 103));
        Usuario4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuario4.setForeground(new java.awt.Color(255, 255, 255));
        Usuario4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario4.setText("JuanitaGamer");
        Usuario4.setOpaque(true);
        Usuario4.setPreferredSize(new java.awt.Dimension(350, 25));

        Usuario5.setBackground(new java.awt.Color(133, 36, 103));
        Usuario5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuario5.setForeground(new java.awt.Color(255, 255, 255));
        Usuario5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario5.setText("JuanitaGamer");
        Usuario5.setOpaque(true);
        Usuario5.setPreferredSize(new java.awt.Dimension(350, 25));

        Usuario6.setBackground(new java.awt.Color(133, 36, 103));
        Usuario6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuario6.setForeground(new java.awt.Color(255, 255, 255));
        Usuario6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario6.setText("JuanitaGamer");
        Usuario6.setOpaque(true);
        Usuario6.setPreferredSize(new java.awt.Dimension(350, 25));

        Usuario7.setBackground(new java.awt.Color(133, 36, 103));
        Usuario7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuario7.setForeground(new java.awt.Color(255, 255, 255));
        Usuario7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario7.setText("JuanitaGamer");
        Usuario7.setOpaque(true);
        Usuario7.setPreferredSize(new java.awt.Dimension(350, 25));

        Usuario8.setBackground(new java.awt.Color(133, 36, 103));
        Usuario8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuario8.setForeground(new java.awt.Color(255, 255, 255));
        Usuario8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario8.setText("JuanitaGamer");
        Usuario8.setOpaque(true);
        Usuario8.setPreferredSize(new java.awt.Dimension(350, 25));

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Usuario8, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario6, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Usuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Usuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Usuario6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Usuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Usuario8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        flechaCargarUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        flechaCargarUsuarios.setText("-------->");
        flechaCargarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        flechaCargarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechaCargarUsuariosMouseClicked(evt);
            }
        });

        seleccionarUsuario.setBackground(new java.awt.Color(73, 128, 153));
        seleccionarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        seleccionarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        seleccionarUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seleccionarUsuario.setText("Seleccione usuario");
        seleccionarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionarUsuarioMouseClicked(evt);
            }
        });
        seleccionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarUsuarioActionPerformed(evt);
            }
        });

        usuarioSeleccionado.setBackground(new java.awt.Color(133, 36, 103));
        usuarioSeleccionado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usuarioSeleccionado.setForeground(new java.awt.Color(255, 255, 255));
        usuarioSeleccionado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarioSeleccionado.setText("Usuario seleccionado");
        usuarioSeleccionado.setOpaque(true);

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dar de baja usuario");

        javax.swing.GroupLayout darDeBajaButtonLayout = new javax.swing.GroupLayout(darDeBajaButton);
        darDeBajaButton.setLayout(darDeBajaButtonLayout);
        darDeBajaButtonLayout.setHorizontalGroup(
            darDeBajaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        darDeBajaButtonLayout.setVerticalGroup(
            darDeBajaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seleccionarUsuario)
                            .addComponent(usuarioSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(darDeBajaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(flechaCargarUsuarios)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(seleccionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(usuarioSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(darDeBajaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(flechaCargarUsuarios)
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void flechaCargarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechaCargarUsuariosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_flechaCargarUsuariosMouseClicked

    private void seleccionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionarUsuarioActionPerformed

    private void darDeBajaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darDeBajaButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_darDeBajaButtonMouseEntered

    private void darDeBajaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darDeBajaButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_darDeBajaButtonMouseExited

    private void darDeBajaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darDeBajaButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_darDeBajaButtonMouseClicked

    private void seleccionarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionarUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionarUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Usuario1;
    private javax.swing.JLabel Usuario2;
    private javax.swing.JLabel Usuario3;
    private javax.swing.JLabel Usuario4;
    private javax.swing.JLabel Usuario5;
    private javax.swing.JLabel Usuario6;
    private javax.swing.JLabel Usuario7;
    private javax.swing.JLabel Usuario8;
    private javax.swing.JPanel background;
    private javax.swing.JPanel darDeBajaButton;
    private javax.swing.JLabel flechaCargarUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JTextField seleccionarUsuario;
    private javax.swing.JLabel usuarioSeleccionado;
    // End of variables declaration//GEN-END:variables
}
