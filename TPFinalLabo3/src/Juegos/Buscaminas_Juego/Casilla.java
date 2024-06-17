package Juegos.Buscaminas_Juego;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Casilla {
       private int posFila ;
       private int posColumna ;
       private boolean mina ;
       
       private int numMinasAlreadedor ;
       
       private boolean abierta ;
       

    public Casilla(int posFila, int posColumna) {
        this.posFila = posFila;
        this.posColumna = posColumna;
    }

    /**
     * @return the posFila
     */
    public int getPosFila() {
        return posFila;
    }

    /**
     * @param posFila the posFila to set
     */
    public void setPosFila(int posFila) {
        this.posFila = posFila;
    }

    /**
     * @return the posColumna
     */
    public int getPosColumna() {
        return posColumna;
    }

    /**
     * @param posColumna the posColumna to set
     */
    public void setPosColumna(int posColumna) {
        this.posColumna = posColumna;
    }

    /**
     * @return the mina
     */
    public boolean isMina() {
        return mina;
    }

    /**
     * @param mina the mina to set
     */
    public void setMina(boolean mina) {
        this.mina = mina;
    }

    /**
     * @return the numMinasAlreadedor
     */
    public int getNumMinasAlreadedor() {
        return numMinasAlreadedor;
    }

    /**
     * @param numMinasAlreadedor the numMinasAlreadedor to set
     */
    public void setNumMinasAlreadedor(int numMinasAlreadedor) {
        this.numMinasAlreadedor = numMinasAlreadedor;
    }
    
    public void incrementarMinasAlrededor () {
        this.numMinasAlreadedor++ ;
    }

    /**
     * @return the abierta
     */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * @param abierta the abierta to set
     */
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }
    
    
       
    
       
}
