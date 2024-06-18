package Juegos.CarpetaBuscaminas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Juegos.Juego;
import Usuarios.Usuario;

public class Buscamina extends Juego {

    private class MinaCasillero extends JButton {
        int f;
        int c;

        public MinaCasillero(int f, int c) {
            this.f = f;
            this.c = c;
        }
    }

    int numFilas = 8;
    int numColumnas = 8;
    int numMinas = 10;

    JLabel textoLabel = new JLabel();
    JPanel panelJuego = new JPanel();
    MinaCasillero[][] tablero = new MinaCasillero[numFilas][numColumnas];
    ArrayList<MinaCasillero> listaMinas;
    Random random = new Random();

    int casillerosClickeados = 0;
    boolean gameOver = false;
    Usuario usuario;

    public Buscamina(Usuario usuario) {
        super(usuario);
        setPreferredSize(new Dimension(450, 450));
        setLayout(new BorderLayout());

        // Configurar el título
        textoLabel.setFont(new Font("Cooper Black", Font.BOLD, 20));
        textoLabel.setHorizontalAlignment(JLabel.CENTER);
        textoLabel.setText("Buscaminas");
        add(textoLabel, BorderLayout.NORTH);

        // Configurar el panel de juego (tablero de botones)
        panelJuego.setLayout(new GridLayout(numFilas, numColumnas));
        add(panelJuego, BorderLayout.CENTER);

        for (int fila = 0; fila < numFilas; fila++) {
            for (int columna = 0; columna < numColumnas; columna++) {
                MinaCasillero casillero = new MinaCasillero(fila, columna);
                tablero[fila][columna] = casillero;
                casillero.setFocusable(false);
                casillero.setMargin(new Insets(0, 0, 0, 0));
                casillero.setFont(new Font("Arial Unicode MS", Font.BOLD, 25));
                panelJuego.add(casillero);

                casillero.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (gameOver) {
                            return;
                        }
                        MinaCasillero casillero = (MinaCasillero) (e.getSource());

                        // Botón izquierdo
                        if (e.getButton() == MouseEvent.BUTTON1) {
                            if (casillero.getText().equals("")) {
                                if (listaMinas.contains(casillero)) {
                                    revelarMinas();
                                    gameOver = true;
                                    textoLabel.setText("Game Over");
                                } else {
                                    checkMina(casillero.f, casillero.c);
                                }
                            }
                        } else if (e.getButton() == MouseEvent.BUTTON3) {
                            if (casillero.getText().equals("") && casillero.isEnabled()) {
                                casillero.setText("🚩");
                            } else if (casillero.getText().equals("🚩")) {
                                casillero.setText("");
                            }
                        }
                    }
                });
            }
        }
        setMinas();
    }

    void setMinas() {
        listaMinas = new ArrayList<>();
        int minasFaltantes = numMinas;
        while (minasFaltantes > 0) {
            int f = random.nextInt(numFilas);
            int c = random.nextInt(numColumnas);
            MinaCasillero casillero = tablero[f][c];
            if (!listaMinas.contains(casillero)) {
                listaMinas.add(casillero);
                minasFaltantes--;
            }
        }
    }

    void revelarMinas() {
        for (MinaCasillero casillero : listaMinas) {
            casillero.setText("💣");
        }
    }

    void checkMina(int f, int c) {
        if (f < 0 || f >= numFilas || c < 0 || c >= numColumnas) {
            return;
        }
        MinaCasillero casillero = tablero[f][c];
        if (!casillero.isEnabled()) {
            return;
        }
        casillero.setEnabled(false);
        casillerosClickeados++;

        int minasEncontradas = 0;

        minasEncontradas += contMina(f - 1, c - 1);
        minasEncontradas += contMina(f - 1, c);
        minasEncontradas += contMina(f - 1, c + 1);
        minasEncontradas += contMina(f, c - 1);
        minasEncontradas += contMina(f, c + 1);
        minasEncontradas += contMina(f + 1, c - 1);
        minasEncontradas += contMina(f + 1, c);
        minasEncontradas += contMina(f + 1, c + 1);

        if (minasEncontradas > 0) {
            casillero.setText(Integer.toString(minasEncontradas));
        } else {
            checkMina(f - 1, c - 1);
            checkMina(f - 1, c);
            checkMina(f - 1, c + 1);
            checkMina(f, c - 1);
            checkMina(f, c + 1);
            checkMina(f + 1, c - 1);
            checkMina(f + 1, c);
            checkMina(f + 1, c + 1);
        }

        if (casillerosClickeados == numColumnas * numFilas - listaMinas.size()) {
            textoLabel.setText("Ganaste!");
            gameOver = true;
        }
    }

    int contMina(int f, int c) {
        if (f < 0 || f >= numFilas || c < 0 || c >= numColumnas) {
            return 0;
        }
        if (listaMinas.contains(tablero[f][c])) {
            return 1;
        }
        return 0;
    }

    @Override
    public void restart() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'restart'");
    }

    @Override
    public Long calcularPuntuacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPuntuacion'");
    }
}




/*package Juegos.CarpetaBuscaminas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Juegos.EnumJuegos;
import Juegos.Juego;
import Usuarios.Usuario;

public class Buscamina extends Juego{

    private class MinaCasillero extends JButton{
        int f;
        int c;

        public MinaCasillero(int f, int c){
            this.f = f;
            this.c = c;
        }
        
    }

    long puntuacion = 0;
    int tamañoCasillero = 60;
    int numFilas =  8;
    int numColumnas = 8 ;
    int numMinas = 20 ;
    int dimension = 500;

    JLabel textoLabel = new JLabel();
    JPanel textoPanel = new JPanel();

    JButton restartBoton = new JButton();
    JPanel panelJuego = new JPanel();

    int contadorMinas = 10;
    MinaCasillero[][] tablero = new MinaCasillero[numFilas][numColumnas];
    ArrayList<MinaCasillero> listaMinas;
    Random random = new Random();

    int casillerosClickeados = 0;
    boolean gameOver = false;
    Usuario usuario;

    public Buscamina(Usuario usuario){

        super(usuario);
        setSize(new Dimension(dimension, dimension));
        setPreferredSize(new Dimension(dimension, dimension));
        setLayout(new BorderLayout());

        // Configurar el título
        textoLabel.setFont(new Font("Cooper Black", Font.BOLD, 25));
        textoLabel.setHorizontalAlignment(JLabel.CENTER);
        textoLabel.setText( "Score: " + puntuacion +"  |  Buscaminas: " + Integer.toString(contadorMinas));
        textoLabel.setOpaque(true);
        textoPanel.setLayout(new BorderLayout());
        textoPanel.add(textoLabel, BorderLayout.CENTER);
        add(textoPanel, BorderLayout.NORTH);
        textoPanel.setBounds(150, 0,60,20);

        restartBoton.setText("Restart");
        restartBoton.setFont(new Font("Cooper Black", Font.BOLD, 15));
        restartBoton.setHorizontalAlignment(SwingConstants.RIGHT);
        textoPanel.add(restartBoton,BorderLayout.EAST);
        restartBoton.setSize(100, 10);

        // Configurar el panel de juego (tablero de botones)
        panelJuego.setLayout(new GridLayout(numFilas, numColumnas));
        add(panelJuego);

        for (int fila = 0; fila < numFilas; fila++) {
            for (int columna = 0; columna < numColumnas; columna++) {
                MinaCasillero casillero = new MinaCasillero(fila, columna);
                tablero[fila][columna] = casillero;

                casillero.setFocusable(false);
                casillero.setMargin(new Insets(0, 0, 0, 0));
                casillero.setFont(new Font("Arial Unicode MS", Font.BOLD, 45));
                panelJuego.add(casillero);
                
              //  casillero.setText("💣");
                casillero.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e){
                        if(gameOver){
                            gameOver();
                            return;
                        }
                        MinaCasillero casillero = (MinaCasillero)(e.getSource());

                        //Boton izquierdo
                        if (e.getButton() == MouseEvent.BUTTON1) {
                            if(casillero.getText() == ""){
                                if (listaMinas.contains(casillero)) {
                                    revelarMinas();
                                    gameOver();
                                }else{
                                checkMina(casillero.f,casillero.c);
                                }
                            }
                        }else if (e.getButton() == MouseEvent.BUTTON3) {
                            if(casillero.getText() == "" && casillero.isEnabled()){
                                casillero.setText("🚩");
                            }else if (casillero.getText() == "🚩") {
                                casillero.setText("");
                            }
                        }
                    }
                }); 
            }
        }
        setMinas();
    }

    void resetCasilleros(){
        for (int fila = 0; fila < numFilas; fila++) {
            for (int columna = 0; columna < numColumnas; columna++) {
                tablero[fila][columna].setEnabled(true);
                tablero[fila][columna].setText("");
            }
        }
    }

    void setMinas(){
        listaMinas = new ArrayList<MinaCasillero>();

        // listaMinas.add(tablero[2][2]);
        // listaMinas.add(tablero[2][3]);
        // listaMinas.add(tablero[5][6]);
        // listaMinas.add(tablero[3][4]);
        // listaMinas.add(tablero[1][1]);

        int minasFaltantes = contadorMinas;
        while (minasFaltantes > 0) {
            int f = random.nextInt(numFilas);
            int c =  random.nextInt(numColumnas);

            MinaCasillero casillero = tablero[f][c];
            if (!listaMinas.contains(casillero)) {
                listaMinas.add(casillero);
                minasFaltantes--;
            }
        }
    }

    public void restart(){
        restartBoton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                if (e.getButton() == MouseEvent.BUTTON1) {
                    casillerosClickeados = 0;
                    resetCasilleros();
                    panelJuego.setLayout(new GridLayout(numFilas, numColumnas));
                    setMinas();
                    gameOver = false;
                    textoLabel.setText( "Score: " + puntuacion +"  |  Buscaminas: " + Integer.toString(contadorMinas));
                }
            } 
        });
    }

    public long getPuntaje(){
        return puntuacion;
    }



    public void gameOver(){
        gameOver = true;
        if (casillerosClickeados == numColumnas*numFilas -listaMinas.size()) {
            textoLabel.setText("Ganaste!"); 
            puntuacion += 400;
            rankingYPuntaje(calcularPuntuacion(), EnumJuegos.Buscaminas, usuario);
            puntuacion = 0;
            revelarMinas();
            restart();
        }else{
            textoLabel.setText("GameOver!");
            restart();
        }  
    }

    void revelarMinas(){
        for (int i = 0; i < listaMinas.size(); i++) {
            MinaCasillero casillero = listaMinas.get(i);
            casillero.setText("💣");
        }
    }

    void checkMina(int f, int c) {
        if (f < 0 || f >= numFilas || c < 0 || c >= numColumnas) {
            return;
        }
        MinaCasillero casillero = tablero[f][c];
        if (!casillero.isEnabled()) {
            return;
        }
        casillero.setEnabled(false);
        casillerosClickeados +=1;
    
        int minasEncontradas = 0;
    
        // Revisar alrededor del casillero para contar minas
        minasEncontradas += contMina(f - 1, c - 1); // arriba a la izquierda
        minasEncontradas += contMina(f - 1, c);     // arriba
        minasEncontradas += contMina(f - 1, c + 1); // arriba a la derecha
        minasEncontradas += contMina(f, c - 1);     // izquierda
        minasEncontradas += contMina(f, c + 1);     // derecha
        minasEncontradas += contMina(f + 1, c - 1); // abajo a la izquierda
        minasEncontradas += contMina(f + 1, c);     // abajo
        minasEncontradas += contMina(f + 1, c + 1); // abajo a la derecha
    
        if (minasEncontradas > 0) {
            casillero.setText(Integer.toString(minasEncontradas));
        } else {
            // Si no hay minas adyacentes, seguir revelando los botones adyacentes vacíos
            checkMina(f - 1, c - 1); // arriba a la izquierda
            checkMina(f - 1, c);     // arriba
            checkMina(f - 1, c + 1); // arriba a la derecha
            checkMina(f, c - 1);     // izquierda
            checkMina(f, c + 1);     // derecha
            checkMina(f + 1, c - 1); // abajo a la izquierda
            checkMina(f + 1, c);     // abajo
            checkMina(f + 1, c + 1); // abajo a la derecha
    
            casillero.setText(""); // Dejar el texto vacío una vez que todos los adyacentes estén revelados
        }
        if (casillerosClickeados == numColumnas*numFilas -listaMinas.size()) {
            gameOver();
        }
    }
    
    int contMina(int f, int c) {
        if (f < 0 || f >= numFilas || c < 0 || c >= numColumnas) {
            return 0;
        }
        if (listaMinas.contains(tablero[f][c])) {
            return 1;
        }
        return 0;
    }

    @Override
    public Long calcularPuntuacion() {
        return getPuntaje();
    }
    
    
}*/
