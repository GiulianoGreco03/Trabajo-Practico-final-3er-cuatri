/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica;
import java.awt.*;
import java.util.HashMap;
import javax.swing.*;
import Excepciones.*;
import Plataformas.Plataforma;
import Usuarios.GestorUsuarios;
import Usuarios.Usuario;


public class PanelLogin extends Panel {

    private GestorUsuarios listadoUsuarios = new GestorUsuarios();
    private MainFrame mainFrame;

    public PanelLogin(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }

                           
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        banner = new javax.swing.JLabel();
        textFieldUsuarioInicio = new javax.swing.JTextField();
        textoContraseña = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        textoUsuario = new javax.swing.JLabel();
        textFieldContraseñaInicio = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        iniciarSesionButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        errorUsuarioInicio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        textFieldUsuarioRegistro = new javax.swing.JTextField();
        textoUsuario1 = new javax.swing.JLabel();
        textoConfirmarContraseña = new javax.swing.JLabel();
        textFieldConfirmarContraseñaRegistro = new javax.swing.JPasswordField();
        banner1 = new javax.swing.JLabel();
        crearCuentaButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textoContraseña1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        textFieldContraseñaRegistro = new javax.swing.JPasswordField();
        errorUsuarioRegistro = new javax.swing.JLabel();
        errorContraseñaRegistro = new javax.swing.JLabel();
        errorConfirmarContraseña = new javax.swing.JLabel();

        jTabbedPane1.setBackground(new java.awt.Color(133, 36, 103));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(810, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        banner.setBackground(new java.awt.Color(106, 25, 148));
        banner.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        banner.setForeground(new java.awt.Color(255, 255, 255));
        banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banner.setText("UTN GameHub");
        banner.setOpaque(true);

        textFieldUsuarioInicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldUsuarioInicio.setText("");
        textFieldUsuarioInicio.setBorder(null);
        textFieldUsuarioInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldUsuarioInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUsuarioInicioActionPerformed(evt);
            }
        });

        textoContraseña.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoContraseña.setText("Contraseña");

        jSeparator1.setBackground(new java.awt.Color(73, 128, 153));
        jSeparator1.setForeground(new java.awt.Color(73, 128, 153));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        textoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoUsuario.setText("Usuario");

        textFieldContraseñaInicio.setText("");
        textFieldContraseñaInicio.setBorder(null);
        textFieldContraseñaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldContraseñaInicioActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(73, 128, 153));
        jSeparator3.setForeground(new java.awt.Color(73, 128, 153));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        iniciarSesionButton.setBackground(new java.awt.Color(133, 36, 103));
        iniciarSesionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarSesionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarSesionButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iniciarSesionButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iniciarSesionButtonMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Iniciar sesión");

        javax.swing.GroupLayout iniciarSesionButtonLayout = new javax.swing.GroupLayout(iniciarSesionButton);
        iniciarSesionButton.setLayout(iniciarSesionButtonLayout);
        iniciarSesionButtonLayout.setHorizontalGroup(
            iniciarSesionButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        iniciarSesionButtonLayout.setVerticalGroup(
            iniciarSesionButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        errorUsuarioInicio.setForeground(new java.awt.Color(255, 0, 0));
        errorUsuarioInicio.setText(" ");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(iniciarSesionButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoContraseña)
                    .addComponent(textoUsuario)
                    .addComponent(jLabel2)
                    .addComponent(errorUsuarioInicio)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textFieldUsuarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1)
                        .addComponent(textFieldContraseñaInicio)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(221, 221, 221))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(textoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldUsuarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorUsuarioInicio)
                .addGap(27, 27, 27)
                .addComponent(textoContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldContraseñaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(iniciarSesionButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("                           Iniciar sesión                            ", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator4.setBackground(new java.awt.Color(73, 128, 153));
        jSeparator4.setForeground(new java.awt.Color(73, 128, 153));
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        textFieldUsuarioRegistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldUsuarioRegistro.setText("");
        textFieldUsuarioRegistro.setBorder(null);
        textFieldUsuarioRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldUsuarioRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUsuarioRegistroActionPerformed(evt);
            }
        });

        textoUsuario1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoUsuario1.setText("Usuario");

        textoConfirmarContraseña.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoConfirmarContraseña.setText("Confirme su contraseña");

        textFieldConfirmarContraseñaRegistro.setText("");
        textFieldConfirmarContraseñaRegistro.setBorder(null);
        textFieldConfirmarContraseñaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldConfirmarContraseñaRegistroActionPerformed(evt);
            }
        });

        banner1.setBackground(new java.awt.Color(106, 25, 148));
        banner1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        banner1.setForeground(new java.awt.Color(255, 255, 255));
        banner1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banner1.setText("UTN GameHub");
        banner1.setOpaque(true);
        banner1.setPreferredSize(new java.awt.Dimension(810, 150));

        crearCuentaButton.setBackground(new java.awt.Color(133, 36, 103));
        crearCuentaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearCuentaButton.setPreferredSize(new java.awt.Dimension(200, 50));
        crearCuentaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCuentaButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearCuentaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearCuentaButtonMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear cuenta");

        javax.swing.GroupLayout crearCuentaButtonLayout = new javax.swing.GroupLayout(crearCuentaButton);
        crearCuentaButton.setLayout(crearCuentaButtonLayout);
        crearCuentaButtonLayout.setHorizontalGroup(
            crearCuentaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        crearCuentaButtonLayout.setVerticalGroup(
            crearCuentaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        textoContraseña1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoContraseña1.setText("Contraseña");

        jSeparator2.setBackground(new java.awt.Color(73, 128, 153));
        jSeparator2.setForeground(new java.awt.Color(73, 128, 153));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jSeparator5.setBackground(new java.awt.Color(73, 128, 153));
        jSeparator5.setForeground(new java.awt.Color(73, 128, 153));
        jSeparator5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        textFieldContraseñaRegistro.setText("");
        textFieldContraseñaRegistro.setBorder(null);
        textFieldContraseñaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldContraseñaRegistroActionPerformed(evt);
            }
        });

        errorUsuarioRegistro.setForeground(new java.awt.Color(255, 0, 0));
        errorUsuarioRegistro.setText("jLabel3");

        errorContraseñaRegistro.setForeground(new java.awt.Color(255, 0, 0));
        errorContraseñaRegistro.setText("jLabel3");

        errorConfirmarContraseña.setForeground(new java.awt.Color(255, 0, 0));
        errorConfirmarContraseña.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoConfirmarContraseña)
                    .addComponent(textoContraseña1)
                    .addComponent(textoUsuario1)
                    .addComponent(errorConfirmarContraseña)
                    .addComponent(errorContraseñaRegistro)
                    .addComponent(errorUsuarioRegistro)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textFieldUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator2)
                        .addComponent(textFieldContraseñaRegistro)
                        .addComponent(jSeparator5)
                        .addComponent(textFieldConfirmarContraseñaRegistro)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(crearCuentaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(banner1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(textoUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorUsuarioRegistro)
                .addGap(27, 27, 27)
                .addComponent(textoContraseña1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldContraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorContraseñaRegistro)
                .addGap(23, 23, 23)
                .addComponent(textoConfirmarContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldConfirmarContraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorConfirmarContraseña)
                .addGap(8, 8, 8)
                .addComponent(crearCuentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("                              Registrarse                             ", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>                        

    private void crearCuentaButtonMouseEntered(java.awt.event.MouseEvent evt) {                                               
        crearCuentaButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }                                              

    private void crearCuentaButtonMouseExited(java.awt.event.MouseEvent evt) {                                              
        if(botonSeleccionado != crearCuentaButton){
            crearCuentaButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }                                             

    private void crearCuentaButtonMouseClicked(java.awt.event.MouseEvent evt) {                                               
        
    }                                              

    private void iniciarSesionButtonMouseEntered(java.awt.event.MouseEvent evt) {                                                 
        iniciarSesionButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
    }                                                

    private void iniciarSesionButtonMouseExited(java.awt.event.MouseEvent evt) {                                                
        if(botonSeleccionado != iniciarSesionButton){
            iniciarSesionButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
        }
    }                                               

    private void iniciarSesionButtonMouseClicked(java.awt.event.MouseEvent evt) {                                                 
        String nombre = textFieldUsuarioInicio.getText();
        String contraseña = String.copyValueOf(textFieldContraseñaInicio.getPassword());


        Usuario aux = listadoUsuarios.buscarUsuario(nombre);

        if(aux != null){
            if(aux.getContraseña().compareTo(contraseña) == 0){
                mainFrame.showSystemPanel();
            }
            else{
                jLabel2.setText("Contraseña incorrecta");
            }
        }else{
            errorUsuarioInicio.setText("Usuario no encontrado");
        }


        

        
    }                                                

    private void textFieldContraseñaRegistroActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        // TODO add your handling code here:
    }                                                           

    private void textFieldUsuarioRegistroActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void textFieldConfirmarContraseñaRegistroActionPerformed(java.awt.event.ActionEvent evt) {                                                                     
        // TODO add your handling code here:
    }                                                                    

    private void textFieldUsuarioInicioActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        
    }                                                      

    private void textFieldContraseñaInicioActionPerformed(java.awt.event.ActionEvent evt) {       

    }                                                         


    // Variables declaration - do not modify                     
    private javax.swing.JLabel banner;
    private javax.swing.JLabel banner1;
    private javax.swing.JPanel crearCuentaButton;
    private javax.swing.JLabel errorConfirmarContraseña;
    private javax.swing.JLabel errorContraseñaRegistro;
    private javax.swing.JLabel errorUsuarioInicio;
    private javax.swing.JLabel errorUsuarioRegistro;
    private javax.swing.JPanel iniciarSesionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2; //errorContraseñaInicio
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPasswordField textFieldConfirmarContraseñaRegistro;
    private javax.swing.JPasswordField textFieldContraseñaInicio;
    private javax.swing.JPasswordField textFieldContraseñaRegistro;
    private javax.swing.JTextField textFieldUsuarioInicio;
    private javax.swing.JTextField textFieldUsuarioRegistro;
    private javax.swing.JLabel textoConfirmarContraseña;
    private javax.swing.JLabel textoContraseña;
    private javax.swing.JLabel textoContraseña1;
    private javax.swing.JLabel textoUsuario;
    private javax.swing.JLabel textoUsuario1;
    // End of variables declaration                   
}