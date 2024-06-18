/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JLabel;
import Interfaces.IterableElementosSwing;
import Juegos.EnumJuegos;
import Rankings.GestorRankings;
import Rankings.Ranking;
import Usuarios.Usuario;



/**
 *
 * @author Usuario
 */
public class PanelRankings extends Panel implements IterableElementosSwing{

        //Atributos
        private GestorRankings gestorRankings = new GestorRankings();
        private Usuario usuarioActivo;

        //Componentes swing
        private javax.swing.JPanel background;
        private javax.swing.JPanel TetrisButton;
        private javax.swing.JPanel buscaminasButton;
        private javax.swing.JPanel dinosaurioButton;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel pacmanButton;
        private javax.swing.JPanel panelPuntuaciones;
        private javax.swing.JLabel puntuacion1;
        private javax.swing.JLabel puntuacion2;
        private javax.swing.JLabel puntuacion3;
        private javax.swing.JLabel puntuacion4;
        private javax.swing.JLabel puntuacion5;
        private javax.swing.JLabel puntuacionPersonal;
        private javax.swing.JPanel snakeButton;
        private javax.swing.JPanel spaceButton;
        private java.awt.Label textoPuntuacionGlobal;
        private javax.swing.JLabel textoPuntuacionPersonal;

        //Constructor
        public PanelRankings(Usuario usuarioActivo) {
            this.usuarioActivo = usuarioActivo;
            initComponents();
            this.botonSeleccionado = snakeButton;
            setBotonSeleccionado(snakeButton);
            cargarRankings(EnumJuegos.Snake);
        }

        //Metodos
        public void cargarRankings(EnumJuegos enumJuegos){
            Iterator<Ranking> it;

            switch (enumJuegos) {
                case EnumJuegos.Snake:
                     gestorRankings.snakeFromJson();
                     it = gestorRankings.getRankingSnake().iterator();
                    mostrarPuntuacion(it, enumJuegos);
                    break;
                case EnumJuegos.Buscaminas:
                    gestorRankings.buscaminasFromJson();
                    it = gestorRankings.getRankingBuscaminas().iterator();
                   mostrarPuntuacion(it, enumJuegos);
                   break;
                case EnumJuegos.Galaga:
                     gestorRankings.galagaFromJson();
                     it = gestorRankings.getRankingGalaga().iterator();
                    mostrarPuntuacion(it, enumJuegos);
                    break;
                case EnumJuegos.Dinosaurio:
                     gestorRankings.dinosaurioFromJson();
                     it = gestorRankings.getRankingDinosaurio().iterator();
                    mostrarPuntuacion(it, enumJuegos);
                    break;
                case EnumJuegos.Flappy:
                     gestorRankings.flappyFromJson();
                     it = gestorRankings.getRankingflappy().iterator();
                    mostrarPuntuacion(it, enumJuegos);
                    break;
                case EnumJuegos.Tetris:
                     gestorRankings.TetrisFromJson();
                     it = gestorRankings.getRankingTetris().iterator();
                    mostrarPuntuacion(it, enumJuegos);
                    break;
            }           
            
        }

        public ArrayList<JLabel> iteradorElementosSwing(){
            ArrayList<JLabel> labelRankings = new ArrayList<>();
            labelRankings.add(puntuacion1);
            labelRankings.add(puntuacion2);
            labelRankings.add(puntuacion3);
            labelRankings.add(puntuacion4);
            labelRankings.add(puntuacion5);

            return labelRankings;
        }

        public void mostrarPuntuacion(Iterator<Ranking> it, EnumJuegos juego){

            ArrayList<JLabel> puntuaciones = iteradorElementosSwing();
            int i = 0;
            while (i < puntuaciones.size() - 1 && it.hasNext()) {
                Ranking aux = it.next();

                puntuaciones.get(i).setText(String.format("%s: %d", aux.getUsuario(), aux.getPuntuacion()));
                i++;
            }

            if(i < puntuaciones.size() - 1){
                while (i < puntuaciones.size()) {
                    puntuaciones.get(i).setText("--------------");
                    i++;
                }
            }

            if(usuarioActivo.getPuntuacionMaxima().containsKey(juego)){
                puntuacionPersonal.setText(String.valueOf(usuarioActivo.getPuntuacionMaxima().get(juego)));
            }else{
                puntuacionPersonal.setText("--------------");
            }
        }

    
                          
        private void initComponents() {
    
            background = new javax.swing.JPanel();
            panelPuntuaciones = new javax.swing.JPanel();
            puntuacion1 = new javax.swing.JLabel();
            puntuacion2 = new javax.swing.JLabel();
            puntuacion3 = new javax.swing.JLabel();
            puntuacion4 = new javax.swing.JLabel();
            puntuacion5 = new javax.swing.JLabel();
            textoPuntuacionPersonal = new javax.swing.JLabel();
            puntuacionPersonal = new javax.swing.JLabel();
            textoPuntuacionGlobal = new java.awt.Label();
            snakeButton = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            TetrisButton = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            buscaminasButton = new javax.swing.JPanel();
            jLabel3 = new javax.swing.JLabel();
            dinosaurioButton = new javax.swing.JPanel();
            jLabel4 = new javax.swing.JLabel();
            pacmanButton = new javax.swing.JPanel();
            jLabel5 = new javax.swing.JLabel();
            spaceButton = new javax.swing.JPanel();
            jLabel6 = new javax.swing.JLabel();
    
            background.setBackground(new java.awt.Color(255, 255, 255));
    
            panelPuntuaciones.setBackground(new java.awt.Color(255, 255, 255));
            panelPuntuaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
    
            puntuacion1.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            puntuacion1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            puntuacion1.setForeground(new java.awt.Color(255, 255, 255));
            puntuacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            puntuacion1.setText("JuanitoGamer: 20000");
            puntuacion1.setOpaque(true);
            puntuacion1.setPreferredSize(new java.awt.Dimension(340, 40));
    
            puntuacion2.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            puntuacion2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            puntuacion2.setForeground(new java.awt.Color(255, 255, 255));
            puntuacion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            puntuacion2.setText("jLabel7");
            puntuacion2.setOpaque(true);
            puntuacion2.setPreferredSize(new java.awt.Dimension(340, 40));
    
            puntuacion3.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            puntuacion3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            puntuacion3.setForeground(new java.awt.Color(255, 255, 255));
            puntuacion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            puntuacion3.setText("jLabel7");
            puntuacion3.setOpaque(true);
            puntuacion3.setPreferredSize(new java.awt.Dimension(340, 40));
    
            puntuacion4.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            puntuacion4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            puntuacion4.setForeground(new java.awt.Color(255, 255, 255));
            puntuacion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            puntuacion4.setText("jLabel7");
            puntuacion4.setOpaque(true);
            puntuacion4.setPreferredSize(new java.awt.Dimension(340, 40));
    
            puntuacion5.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            puntuacion5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            puntuacion5.setForeground(new java.awt.Color(255, 255, 255));
            puntuacion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            puntuacion5.setText("jLabel7");
            puntuacion5.setOpaque(true);
            puntuacion5.setPreferredSize(new java.awt.Dimension(340, 40));
    
            textoPuntuacionPersonal.setBackground(new java.awt.Color(73, 128, 153));
            textoPuntuacionPersonal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            textoPuntuacionPersonal.setForeground(new java.awt.Color(255, 255, 255));
            textoPuntuacionPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            textoPuntuacionPersonal.setText("Record personal");
            textoPuntuacionPersonal.setOpaque(true);
            textoPuntuacionPersonal.setPreferredSize(new java.awt.Dimension(340, 40));
    
            puntuacionPersonal.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            puntuacionPersonal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            puntuacionPersonal.setForeground(new java.awt.Color(255, 255, 255));
            puntuacionPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            puntuacionPersonal.setText("jLabel7");
            puntuacionPersonal.setOpaque(true);
            puntuacionPersonal.setPreferredSize(new java.awt.Dimension(340, 40));
    
            textoPuntuacionGlobal.setAlignment(java.awt.Label.CENTER);
            textoPuntuacionGlobal.setBackground(new java.awt.Color(73, 128, 153));
            textoPuntuacionGlobal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            textoPuntuacionGlobal.setForeground(new java.awt.Color(255, 255, 255));
            textoPuntuacionGlobal.setPreferredSize(new java.awt.Dimension(340, 40));
            textoPuntuacionGlobal.setText("Puntuación Global");
    
            javax.swing.GroupLayout panelPuntuacionesLayout = new javax.swing.GroupLayout(panelPuntuaciones);
            panelPuntuaciones.setLayout(panelPuntuacionesLayout);
            panelPuntuacionesLayout.setHorizontalGroup(
                panelPuntuacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPuntuacionesLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(panelPuntuacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textoPuntuacionGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(puntuacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(puntuacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(puntuacion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(puntuacion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(puntuacion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(puntuacionPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoPuntuacionPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(22, Short.MAX_VALUE))
            );
            panelPuntuacionesLayout.setVerticalGroup(
                panelPuntuacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPuntuacionesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textoPuntuacionGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(puntuacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)
                    .addComponent(puntuacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)
                    .addComponent(puntuacion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)
                    .addComponent(puntuacion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)
                    .addComponent(puntuacion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                    .addComponent(textoPuntuacionPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(puntuacionPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24))
            );
    
            snakeButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            snakeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            snakeButton.setMinimumSize(new java.awt.Dimension(160, 40));
            snakeButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    snakeButtonMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    snakeButtonMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    snakeButtonMouseExited(evt);
                }
            });
    
            jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Snake");
    
            javax.swing.GroupLayout snakeButtonLayout = new javax.swing.GroupLayout(snakeButton);
            snakeButton.setLayout(snakeButtonLayout);
            snakeButtonLayout.setHorizontalGroup(
                snakeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            );
            snakeButtonLayout.setVerticalGroup(
                snakeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            );
    
            TetrisButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            TetrisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            TetrisButton.setMinimumSize(new java.awt.Dimension(160, 40));
            TetrisButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    TetrisButtonMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    TetrisButtonMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    TetrisButtonMouseExited(evt);
                }
            });
    
            jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Tetris");
    
            javax.swing.GroupLayout TetrisButtonLayout = new javax.swing.GroupLayout(TetrisButton);
            TetrisButton.setLayout(TetrisButtonLayout);
            TetrisButtonLayout.setHorizontalGroup(
                TetrisButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            );
            TetrisButtonLayout.setVerticalGroup(
                TetrisButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            );
    
            buscaminasButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            buscaminasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            buscaminasButton.setMinimumSize(new java.awt.Dimension(160, 40));
            buscaminasButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    buscaminasButtonMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    buscaminasButtonMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    buscaminasButtonMouseExited(evt);
                }
            });
    
            jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 255));
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("Buscaminas");
    
            javax.swing.GroupLayout buscaminasButtonLayout = new javax.swing.GroupLayout(buscaminasButton);
            buscaminasButton.setLayout(buscaminasButtonLayout);
            buscaminasButtonLayout.setHorizontalGroup(
                buscaminasButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            );
            buscaminasButtonLayout.setVerticalGroup(
                buscaminasButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            );
    
            dinosaurioButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            dinosaurioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            dinosaurioButton.setMinimumSize(new java.awt.Dimension(160, 40));
            dinosaurioButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    dinosaurioButtonMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    dinosaurioButtonMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    dinosaurioButtonMouseExited(evt);
                }
            });
    
            jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("Dinosaurio");
    
            javax.swing.GroupLayout dinosaurioButtonLayout = new javax.swing.GroupLayout(dinosaurioButton);
            dinosaurioButton.setLayout(dinosaurioButtonLayout);
            dinosaurioButtonLayout.setHorizontalGroup(
                dinosaurioButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            );
            dinosaurioButtonLayout.setVerticalGroup(
                dinosaurioButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            );
    
            pacmanButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            pacmanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            pacmanButton.setMinimumSize(new java.awt.Dimension(160, 40));
            pacmanButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    pacmanButtonMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    pacmanButtonMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    pacmanButtonMouseExited(evt);
                }
            });
    
            jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel5.setText("Pac-Man");
    
            javax.swing.GroupLayout pacmanButtonLayout = new javax.swing.GroupLayout(pacmanButton);
            pacmanButton.setLayout(pacmanButtonLayout);
            pacmanButtonLayout.setHorizontalGroup(
                pacmanButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            );
            pacmanButtonLayout.setVerticalGroup(
                pacmanButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            );
    
            spaceButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            spaceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            spaceButton.setMinimumSize(new java.awt.Dimension(160, 40));
            spaceButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    spaceButtonMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    spaceButtonMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    spaceButtonMouseExited(evt);
                }
            });
    
            jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(255, 255, 255));
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel6.setText("Space Invaders");
    
            javax.swing.GroupLayout spaceButtonLayout = new javax.swing.GroupLayout(spaceButton);
            spaceButton.setLayout(spaceButtonLayout);
            spaceButtonLayout.setHorizontalGroup(
                spaceButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            );
            spaceButtonLayout.setVerticalGroup(
                spaceButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            );
    
            javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
            background.setLayout(backgroundLayout);
            backgroundLayout.setHorizontalGroup(
                backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(snakeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TetrisButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(buscaminasButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dinosaurioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pacmanButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(panelPuntuaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE))
            );
            backgroundLayout.setVerticalGroup(
                backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(snakeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(TetrisButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(buscaminasButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(dinosaurioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(pacmanButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(spaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(panelPuntuaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(60, Short.MAX_VALUE))
            );
    
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
        }// </editor-fold>                        
    
        private void snakeButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
            if(botonSeleccionado != snakeButton){
                setBotonSeleccionado(snakeButton);
                cargarRankings(EnumJuegos.Snake);
            }
        }                                        
    
        private void snakeButtonMouseEntered(java.awt.event.MouseEvent evt) {                                         
            snakeButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
        }                                        
    
        private void snakeButtonMouseExited(java.awt.event.MouseEvent evt) {                                        
            if(botonSeleccionado != snakeButton){
                snakeButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            }
        }                                       
    
        private void TetrisButtonMouseClicked(java.awt.event.MouseEvent evt) {                                             
            if(botonSeleccionado != TetrisButton){
                setBotonSeleccionado(TetrisButton);
                cargarRankings(EnumJuegos.Tetris);
            }
        }                                            
    
        private void TetrisButtonMouseEntered(java.awt.event.MouseEvent evt) {                                             
            TetrisButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
        }                                            
    
        private void TetrisButtonMouseExited(java.awt.event.MouseEvent evt) {                                            
            if(botonSeleccionado != TetrisButton){
                TetrisButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            }
        }                                           
    
        private void buscaminasButtonMouseClicked(java.awt.event.MouseEvent evt) {                                              
            if(botonSeleccionado != buscaminasButton){
                setBotonSeleccionado(buscaminasButton);
                cargarRankings(EnumJuegos.Buscaminas);
            }
        }                                             
    
        private void buscaminasButtonMouseEntered(java.awt.event.MouseEvent evt) {                                              
            buscaminasButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
        }                                             
    
        private void buscaminasButtonMouseExited(java.awt.event.MouseEvent evt) {                                             
            if(botonSeleccionado != buscaminasButton){
                buscaminasButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            }
        }                                            
    
        private void dinosaurioButtonMouseClicked(java.awt.event.MouseEvent evt) {                                              
            if(botonSeleccionado != dinosaurioButton){
                setBotonSeleccionado(dinosaurioButton);
                cargarRankings(EnumJuegos.Dinosaurio);
            }
        }                                             
    
        private void dinosaurioButtonMouseEntered(java.awt.event.MouseEvent evt) {                                              
            dinosaurioButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
        }                                             
    
        private void dinosaurioButtonMouseExited(java.awt.event.MouseEvent evt) {                                             
            if(botonSeleccionado != dinosaurioButton){
                dinosaurioButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            }
        }                                            
    
        private void pacmanButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
            if(botonSeleccionado != pacmanButton){
                setBotonSeleccionado(pacmanButton);
                cargarRankings(EnumJuegos.Flappy);
            }
        }                                         
    
        private void pacmanButtonMouseEntered(java.awt.event.MouseEvent evt) {                                          
            pacmanButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
        }                                         
    
        private void pacmanButtonMouseExited(java.awt.event.MouseEvent evt) {                                         
            if(botonSeleccionado != pacmanButton){
                pacmanButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            }
        }                                        
    
        private void spaceButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
            if(botonSeleccionado != spaceButton){
                setBotonSeleccionado(spaceButton);
                cargarRankings(EnumJuegos.Galaga);
            }
        }                                        
    
        private void spaceButtonMouseEntered(java.awt.event.MouseEvent evt) {                                         
            spaceButton.setBackground(new Color(PaletaDeColores.BotonPresionado.R, PaletaDeColores.BotonPresionado.G, PaletaDeColores.BotonPresionado.B));
        }                                        
    
        private void spaceButtonMouseExited(java.awt.event.MouseEvent evt) {                                        
            if(botonSeleccionado != spaceButton){
                spaceButton.setBackground(new Color(PaletaDeColores.Botones.R, PaletaDeColores.Botones.G, PaletaDeColores.Botones.B));
            }
        }                                       
    
    
                  
        
                 
    }
