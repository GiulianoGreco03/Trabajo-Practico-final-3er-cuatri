/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Juegos.Buscaminas_Juego;

//import Juegos.Buscaminas_Juego.Casilla;
//import Juegos.Buscaminas_Juego.Tablero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class FrameBuscaminas extends javax.swing.JFrame {
    int numFilas =  8;
    int numColumna = 8 ;
    int numMinas = 20 ;
    int puntaje = 5 ;
    
    JButton[][] botonesTablero ;
    
    Tablero tablero ;

    /**
     * Creates new form FrameBuscaminas
     */
    public FrameBuscaminas() {
        initComponents();
        juegoNuevo() ;
    } 
    
    private void juegoNuevo () {
        descargarControles() ; //para que no haya sobrecarga
        cargaControles() ;
        declararTablero() ;
        repaint() ; //para que refresque la pantalla
    }
    
    void descargarControles() {
        if ( botonesTablero!=null ) {
            for ( int i=0; i<botonesTablero.length; i++ ) {
                for ( int j=0; j<botonesTablero[i].length; j++ ) {
                    if ( botonesTablero[i][j] !=  null ) {
                        getContentPane().remove(botonesTablero[i][j]);
                    }
                }
            }
        }
    }
    
    private void declararTablero () {
        tablero = new Tablero (numFilas, numColumna, numMinas ) ;
        tablero.setEventoPartidaPerdida(new Consumer<List<Casilla>>() {
            @Override 
            public void accept(List<Casilla> t) {
                for ( Casilla casillaConMina: t ) {
                    botonesTablero[casillaConMina.getPosFila()][casillaConMina.getPosColumna()].setText("*") ;
//                    JOptionPane.showMessageDialog(rootPane,"Fin Partida");
                }
                juegoNuevo() ;
                JOptionPane.showMessageDialog(rootPane,"Fin Partida") ;
            }
        });
        tablero.setEventoPartidaGanada(new Consumer<List<Casilla>>() {
            @Override 
            public void accept(List<Casilla> t) {
                for ( Casilla casillaConMina: t ) {
                    botonesTablero[casillaConMina.getPosFila()][casillaConMina.getPosColumna()].setText(":)") ;
//                    JOptionPane.showMessageDialog(rootPane,"Ganaste!!");
                }
                puntaje+=puntaje ;
                JOptionPane.showMessageDialog(rootPane,"Ganaste!! Puntaje: " +puntaje);
                juegoNuevo() ;
            }
        });
        tablero.setEventoCasillaAbierta(new Consumer<Casilla>(){
            @Override
            public void accept(Casilla t){
               botonesTablero[t.getPosFila()][t.getPosColumna()].setEnabled(false);
               botonesTablero[t.getPosFila()][t.getPosColumna()].setText(t.getNumMinasAlreadedor()==0?"":t.getNumMinasAlreadedor()+"");
            }
        });
        tablero.imprimirTablero();
    }
    
    private void cargaControles() {
        int posXReferencia = 25 ;
        int posYReferencia = 25 ;
        int anchoControl = 30 ;
        int altoControl = 30 ;
        
        botonesTablero = new JButton[numFilas][numColumna] ;
        for ( int i=0; i<botonesTablero.length; i++ ) {
            for ( int j=0; j<botonesTablero[i].length; j++ ) {
                botonesTablero[i][j] = new JButton() ;
                botonesTablero[i][j].setName(i+","+j);
                botonesTablero[i][j].setBorder(null);
                if ( i==0 &&j==0) {
                    botonesTablero[i][j].setBounds(posXReferencia, 
                            posYReferencia, anchoControl, altoControl );
                } else if ( i==0 && j!=0 ) {
                    botonesTablero[i][j].setBounds(botonesTablero[i][j-1].getX()+
                            botonesTablero[i][j-1].getWidth(), 
                            posYReferencia, anchoControl, altoControl );
                } else {
                    botonesTablero[i][j].setBounds(
                            botonesTablero[i-1][j].getX(), 
                            botonesTablero[i-1][j].getY()+botonesTablero[i-1][j].getHeight(), 
                            anchoControl, altoControl);
                }
                botonesTablero[i][j].addActionListener(new ActionListener() {
                    @Override 
                    public void actionPerformed ( ActionEvent e) {
                        buttonClick(e) ;
                    }
                });
                getContentPane().add(botonesTablero[i][j]) ;
            } 
        }
    }
    
    private void buttonClick(ActionEvent e) {
        JButton btn = (JButton)e.getSource() ;
        String[] cordenada = btn.getName().split(",") ;
        int posFila = Integer.parseInt(cordenada[0]) ;
        int posColumna = Integer.parseInt(cordenada[1]) ;
        //JOptionPane.showMessageDialog(rootPane, posFila+","+posColumna);
        tablero.seleccionarCasilla(posFila, posColumna);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Juego");

        jMenuItem1.setText("Nueva Partida");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Nivel");

        jMenuItem2.setText("Facil");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Intermedio");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Dificil");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        juegoNuevo() ;
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.numFilas = 8 ;
        this.numColumna = 9 ;
        juegoNuevo() ;
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.numFilas = 12 ;
        this.numColumna = 13 ;
        juegoNuevo() ;
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.numFilas = 14 ;
        this.numColumna = 15 ;
        juegoNuevo() ;
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameBuscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBuscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBuscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBuscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBuscaminas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
