package Rankings;

import Excepciones.*;
import java.util.Iterator;
import java.util.TreeSet;

public class GestorRankings{
    // Atributos
    private TreeSet<Ranking> rankingSnake;
    private TreeSet<Ranking> rankingBuscaminas;
    private TreeSet<Ranking> rankingDinosaurio;
    private TreeSet<Ranking> rankingBlackjack;
    private TreeSet<Ranking> rankingPacman;
    private TreeSet<Ranking> rankingGalaga;

    public TreeSet<Ranking> getRankingSnake() {
        return rankingSnake;
    }
    public void setRankingSnake(TreeSet<Ranking> rankingSnake) {
        this.rankingSnake = rankingSnake;
    }
    public TreeSet<Ranking> getRankingBuscaminas() {
        return rankingBuscaminas;
    }
    public void setRankingBuscaminas(TreeSet<Ranking> rankingBuscaminas) {
        this.rankingBuscaminas = rankingBuscaminas;
    }
    public TreeSet<Ranking> getRankingDinosaurio() {
        return rankingDinosaurio;
    }
    public void setRankingDinosaurio(TreeSet<Ranking> rankingDinosaurio) {
        this.rankingDinosaurio = rankingDinosaurio;
    }
    public TreeSet<Ranking> getRankingBlackjack() {
        return rankingBlackjack;
    }
    public void setRankingBlackjack(TreeSet<Ranking> rankingBlackjack) {
        this.rankingBlackjack = rankingBlackjack;
    }
    public TreeSet<Ranking> getRankingPacman() {
        return rankingPacman;
    }
    public void setRankingPacman(TreeSet<Ranking> rankingPacman) {
        this.rankingPacman = rankingPacman;
    }
    public TreeSet<Ranking> getRankingGalaga() {
        return rankingGalaga;
    }
    public void setRankingGalaga(TreeSet<Ranking> rankingGalaga) {
        this.rankingGalaga = rankingGalaga;
    }
    public GestorRankings(){
        rankingBuscaminas = new TreeSet<>();
        rankingDinosaurio = new TreeSet<>();
        rankingGalaga = new TreeSet<>();
        rankingPacman = new TreeSet<>();
        rankingSnake = new TreeSet<>();
        rankingBlackjack = new TreeSet<>();
    }
    public void agregarRankingSnake(Ranking ranking){
        rankingSnake.add(ranking);
    }
    public void agregarRankingBuscaminas(Ranking ranking){
        rankingBuscaminas.add(ranking);
    }
    public void agregarRankingDinosaurio(Ranking ranking){
        rankingDinosaurio.add(ranking);
    }
    public void agregarRankingGalaga(Ranking ranking){
        rankingGalaga.add(ranking);
    }
    public void agregarRankingPacman(Ranking ranking){
        rankingPacman.add(ranking);
    }
    public void agregarRankingBlackjack(Ranking ranking){
        rankingBlackjack.add(ranking);
    }

    public void mostrarRankingBlackjack(){
        Iterator<Ranking> it = rankingBlackjack.iterator();

        while (it.hasNext()) { 
            Ranking objeto = it.next();
            System.out.println(objeto.toString() + "\n");
        }
    }
    
    public void mostrarRankingBuscaminas(){
        Iterator<Ranking> it = rankingBuscaminas.iterator();

        while (it.hasNext()) { 
            Ranking objeto = it.next();
            System.out.println(objeto.toString() + "\n");
        }
    }
    public void mostrarRankingDinosaurio(){
        Iterator<Ranking> it = rankingDinosaurio.iterator();

        while (it.hasNext()) { 
            Ranking objeto = it.next();
            System.out.println(objeto.toString() + "\n");
        }
    }
    public void mostrarRankingGalaga(){
        Iterator<Ranking> it = rankingGalaga.iterator();

        while (it.hasNext()) { 
            Ranking objeto = it.next();
            System.out.println(objeto.toString() + "\n");
        }
    }
    public void mostrarRankingPacman(){
        Iterator<Ranking> it = rankingPacman.iterator();

        while (it.hasNext()) { 
            Ranking objeto = it.next();
            System.out.println(objeto.toString() + "\n");
        }
    }
    public void mostrarRankingSnake(){
        Iterator<Ranking> it = rankingSnake.iterator();

        while (it.hasNext()) { 
            Ranking objeto = it.next();
            System.out.println(objeto.toString() + "\n");
        }
    }
    

    public Ranking buscarRankingBlackjackPorUsuario(String nombre){
        try {
            Iterator<Ranking> it = rankingBlackjack.iterator();
            while (it.hasNext()) {
                Ranking objeto = it.next();

                if(objeto.getUsuario().equalsIgnoreCase(nombre) ){
                    return objeto;
                }
            }
            throw new UsuarioNoExisteException();  
        } catch (UsuarioNoExisteException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public Ranking buscarRankingBuscaminasPorUsuario(String nombre){
        try {
            Iterator<Ranking> it = rankingBuscaminas.iterator();
            while (it.hasNext()) {
                Ranking objeto = it.next();

                if(objeto.getUsuario().equalsIgnoreCase(nombre) ){
                    return objeto;
                }
            }
            throw new UsuarioNoExisteException();  
        } catch (UsuarioNoExisteException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public Ranking buscarRankingDinosaurioPorUsuario(String nombre){
        try {
            Iterator<Ranking> it = rankingDinosaurio.iterator();
            while (it.hasNext()) {
                Ranking objeto = it.next();

                if(objeto.getUsuario().equalsIgnoreCase(nombre) ){
                    return objeto;
                }
            }
            throw new UsuarioNoExisteException();  
        } catch (UsuarioNoExisteException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public Ranking buscarRankingGalagaPorUsuario(String nombre){
        try {
            Iterator<Ranking> it = rankingGalaga.iterator();
            while (it.hasNext()) {
                Ranking objeto = it.next();

                if(objeto.getUsuario().equalsIgnoreCase(nombre) ){
                    return objeto;
                }
            }
            throw new UsuarioNoExisteException();  
        } catch (UsuarioNoExisteException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public Ranking buscarRankingPacmanPorUsuario(String nombre){
        try {
            Iterator<Ranking> it = rankingPacman.iterator();
            while (it.hasNext()) {
                Ranking objeto = it.next();

                if(objeto.getUsuario().equalsIgnoreCase(nombre) ){
                    return objeto;
                }
            }
            throw new UsuarioNoExisteException();  
        } catch (UsuarioNoExisteException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public Ranking buscarRankingSnakePorUsuario(String nombre){
        try {
            Iterator<Ranking> it = rankingSnake.iterator();
            while (it.hasNext()) {
                Ranking objeto = it.next();

                if(objeto.getUsuario().equalsIgnoreCase(nombre) ){
                    return objeto;
                }
            }
            throw new UsuarioNoExisteException();  
        } catch (UsuarioNoExisteException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public void limpiarRankingBlackjack(){
        rankingBlackjack.clear();
    }
    public void limpiarRankingBuscaminas(){
        rankingBuscaminas.clear();
    }
    public void limpiarRankingDinosaurio(){
        rankingDinosaurio.clear();
    }
    public void limpiarRankingGalaga(){
        rankingGalaga.clear();
    }
    public void limpiarRankingPacman(){
        rankingPacman.clear();
    }
    public void limpiarRankingSnake(){
        rankingSnake.clear();
    }
    
    
    
}
