package Juegos.Buscaminas_Juego;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Tablero {
    Casilla[][] casillas ;
    
    int numFilas ;
    int numColumnas ;
    int numMinas ;
    
    int numCasillaAbierta ;
    boolean juegoTerminado ;
    
    private Consumer<List<Casilla>> eventoPartidaPerdida ;
    private Consumer<List<Casilla>> eventoPartidaGanada ;
    
    
    Consumer<Casilla> eventoCasillaAbierta ;

    public Tablero(int numFilas, int numColumnas, int numMinas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.numMinas = numMinas ;
        inicializarCasillas();
    }
    
    public void inicializarCasillas() {
        casillas = new Casilla[this.numFilas][this.numColumnas] ;
        
        for ( int i=0; i<casillas.length; i++ ) {
            for (int j=0; j<casillas[i].length; j++ ) {
                casillas[i][j] = new Casilla(i, j) ;
            }
        }
        this.generarMinas() ;
    }
    
    public void generarMinas () {
        int minasGeneradas = 0 ;
        
        while ( minasGeneradas != numMinas ) {
            int posTmpFila = (int) (Math.random()*casillas.length) ;
            int posTmpColumna = (int) (Math.random()*casillas[0].length) ;
            if ( !casillas[posTmpFila][posTmpColumna].isMina() ) {
                casillas[posTmpFila][posTmpColumna].setMina(true);
                minasGeneradas++ ;
            }
        }
        this.actualizarNumMinasAlrededor();
    }
    
    public void imprimirTablero() {
        for ( int i=0; i<casillas.length; i++ ) {
            for (int j=0; j<casillas[i].length; j++ ) {
                System.out.print(casillas[i][j].isMina()?"*":"0");
            }
            System.out.println("");
        }
    }
    
    public void imprimirPistas() {
        for ( int i=0; i<casillas.length; i++ ) {
            for (int j=0; j<casillas[i].length; j++ ) {
                System.out.print(casillas[i][j].getNumMinasAlreadedor());
            }
            System.out.println("");
        }
    }
    
    public void actualizarNumMinasAlrededor () {
        for ( int i=0; i<casillas.length; i++ ) {
            for (int j=0; j<casillas[i].length; j++ ) {
                if ( casillas[i][j].isMina() ) {
                    List<Casilla> casillaAlrededor = obtenerCasillaAlrededor(i, j) ;
                    casillaAlrededor.forEach((c)->c.incrementarMinasAlrededor());
                }
            }
        }
    }
    
    public List<Casilla> obtenerCasillaAlrededor( int posFila, int posColumna ) {
        List<Casilla> listadoCasilla = new LinkedList<>() ;
        
        for ( int i=0; i<8 ; i++ ) {
            int tmpPosFila = posFila ;
            int tmpPosColumna = posColumna ;
            
            switch (i) {
                case 0 : //ARRIBA
                    tmpPosFila-- ;
                    break;
                case 1 : //ARRIBA DERECHA
                    tmpPosFila-- ;
                    tmpPosColumna++ ;
                    break;
                case 2 : //DERECHA
                    tmpPosColumna++ ;
                    break;
                case 3 : //DERECHA ABAJO
                    tmpPosColumna++ ;
                    tmpPosFila++ ;
                    break;    
                case 4 : //ABAJO
                    tmpPosFila++ ;
                    break;
                case 5 : //ABAJO IZQUIERDA
                    tmpPosFila++ ;
                    tmpPosColumna-- ;
                    break;
                case 6 : //IZQUIERDA
                    tmpPosColumna-- ;
                    break;
                case 7 : //IZQUIEDA ARRIBA
                    tmpPosFila-- ;
                    tmpPosColumna-- ;
                    break;     
            }
            
            if ( tmpPosFila>=0 && tmpPosFila<this.casillas.length &&
                    tmpPosColumna>=0 && tmpPosColumna<this.casillas[0].length ) {
                listadoCasilla.add(this.casillas[tmpPosFila][tmpPosColumna]) ;
            }
        }
                
        return listadoCasilla ;
    }
    
    List<Casilla> obtenerCasillaConMinas ( ) {
        List<Casilla> casillasConMinas = new LinkedList<>() ;
            for ( int i=0; i<casillas.length; i++ ) {
                for (int j=0; j<casillas[i].length; j++ ) {
                    if ( casillas[i][j].isMina() ) {
                        casillasConMinas.add(casillas[i][j]) ;
                    }
                }
            }
        return casillasConMinas ;
    }
    
    public void seleccionarCasilla ( int posFila, int posColumna ) {
        eventoCasillaAbierta.accept(this.casillas[posFila][posColumna]);
        
        if ( this.casillas[posFila][posColumna].isMina() ) {
           eventoPartidaPerdida.accept(obtenerCasillaConMinas());
            
        } else if ( this.casillas[posFila][posColumna].getNumMinasAlreadedor() == 0 ){
            marcarCasillaAbierta(posFila, posColumna) ;
            List<Casilla> casillaAlrededor = obtenerCasillaAlrededor(posFila, posColumna) ;
            for ( Casilla casilla: casillaAlrededor ) {
                if ( !casilla.isAbierta() ) {
                    seleccionarCasilla(casilla.getPosFila(), casilla.getPosColumna()) ;
                }
            }   
        } else {
            marcarCasillaAbierta(posFila,posColumna) ;
        }
        
        if ( partidaGanada() ) {
            eventoPartidaGanada.accept(obtenerCasillaConMinas());
        }
    }
    
    void marcarCasillaAbierta ( int posFila, int posColumna ) {
        if ( !this.casillas[posFila][posColumna].isAbierta() ) {
            numCasillaAbierta++ ;
            this.casillas[posFila][posColumna].setAbierta(true);
        }
    }
    
    boolean partidaGanada () {
        return numCasillaAbierta>=(numFilas*numColumnas)-numMinas ;
    }

    /**
     * @param eventoPartidaPerdida the eventoPartidaPerdida to set
     */
    public void setEventoPartidaPerdida(Consumer<List<Casilla>> eventoPartidaPerdida) {
        this.eventoPartidaPerdida = eventoPartidaPerdida;
    }

    /**
     * @param eventoCasillaAbierta the eventoCasillaAbierta to set
     */
    public void setEventoCasillaAbierta(Consumer<Casilla> eventoCasillaAbierta) {
        this.eventoCasillaAbierta = eventoCasillaAbierta;
    }

    /**
     * @param eventoPartidaGanada the eventoPartidaGanada to set
     */
    public void setEventoPartidaGanada(Consumer<List<Casilla>> eventoPartidaGanada) {
        this.eventoPartidaGanada = eventoPartidaGanada;
    }
}
    