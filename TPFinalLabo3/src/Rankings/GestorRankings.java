package Rankings;

import Excepciones.*;
import Juegos.EnumJuegos;
import Usuarios.Usuario;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

import Archivos.ClaseJsonGenerica;

public class GestorRankings{

    private TreeSet<Ranking> rankingSnake;
    private TreeSet<Ranking> rankingBuscaminas;
    private TreeSet<Ranking> rankingDinosaurio;
    private TreeSet<Ranking> rankingBlackjack;
    private TreeSet<Ranking> rankingPacman;
    private TreeSet<Ranking> rankingGalaga;
    private ClaseJsonGenerica<Ranking> json;

    public GestorRankings(){
        rankingBuscaminas = new TreeSet<>();
        rankingDinosaurio = new TreeSet<>();
        rankingGalaga = new TreeSet<>();
        rankingPacman = new TreeSet<>();
        rankingSnake = new TreeSet<>();
        rankingBlackjack = new TreeSet<>();
    }

    public void snakeFromJson(){
        
       try {
        
        if(new File("src\\Archivos\\RankingSnake.json").exists()){
            json = new ClaseJsonGenerica<>();
            rankingSnake = json.LeerValoresTreeSet("src\\Archivos\\RankingSnake.json", new Ranking());
        }else{
            throw new IOException();
        }
       } catch (IOException e) {
         System.out.println("Hola" +e.getMessage());
       } 
        
    }

    public void cargarRankingJson(Ranking ranking){
        switch (ranking.getJuego()) {
            case EnumJuegos.Snake:
                snakeFromJson();
                agregarRankingSnake(ranking);
                snakeToJson();
                
                break;
            case EnumJuegos.Buscaminas:
                buscaminasFromJson();
                agregarRankingBuscaminas(ranking);
                buscaminasToJson();
                break;
            case EnumJuegos.Galaga:
                galagaFromJson();
                agregarRankingGalaga(ranking);
                galagaToJson();
                break;
            case EnumJuegos.Blackjack:
                blackjackFromJson();
                agregarRankingBlackjack(ranking);
                blackjackToJson();
                break;
            case EnumJuegos.Dinosaurio:
                dinosaurioFromJson();
                agregarRankingDinosaurio(ranking);
                dinosaurioToJson();
                break;
            case EnumJuegos.Pacman:
                pacmanFromJson();
                agregarRankingPacman(ranking);
                pacmanToJson();
                break;
        }
    }

    public void cargarRanking(Ranking ranking){
        switch (ranking.getJuego()) {
            case EnumJuegos.Snake:
                
                agregarRankingSnake(ranking);
            
                
                break;
            case EnumJuegos.Buscaminas:
                
                agregarRankingBuscaminas(ranking);
               
                break;
            case EnumJuegos.Galaga:
                
                agregarRankingGalaga(ranking);
                
                break;
            case EnumJuegos.Blackjack:
                
                agregarRankingBlackjack(ranking);
                
                break;
            case EnumJuegos.Dinosaurio:
                
                agregarRankingDinosaurio(ranking);
                
                break;
            case EnumJuegos.Pacman:
                
                agregarRankingPacman(ranking);
                
                break;
        }
    }

    public void snakeToJson(){
                json = new ClaseJsonGenerica<>();
                json.CargarValores(rankingSnake, "src\\Archivos\\RankingSnake.json");
            

    }

    public void buscaminasFromJson(){
        
        try {
         
         if(new File("src\\Archivos\\RankingBuscaminas.json").exists()){
             json = new ClaseJsonGenerica<>();
             rankingBuscaminas = json.LeerValoresTreeSet("src\\Archivos\\RankingBuscaminas.json", new Ranking());
         }else{
             throw new IOException();
         }
        } catch (IOException e) {
          System.out.println(e.getMessage());
        } 
         
     }
 
     public void buscaminasToJson(){
        json = new ClaseJsonGenerica<>();
        json.CargarValores(rankingBuscaminas, "src\\Archivos\\RankingBuscaminas.json");
     }

     public void dinosaurioFromJson(){
        
        try {
         
         if(new File("src\\Archivos\\RankingDinosaurio.json").exists()){
             json = new ClaseJsonGenerica<>();
             rankingDinosaurio = json.LeerValoresTreeSet("src\\Archivos\\RankingDinosaurio.json", new Ranking());
         }else{
             throw new IOException();
         }
        } catch (IOException e) {
          System.out.println(e.getMessage());
        } 
         
     }
 
     public void dinosaurioToJson(){
        json = new ClaseJsonGenerica<>();
        json.CargarValores(rankingDinosaurio, "src\\Archivos\\RankingDinosaurio.json");
     }

     public void blackjackFromJson(){
        
        try {
         
         if(new File("src\\Archivos\\RankingBlackjack.json").exists()){
             json = new ClaseJsonGenerica<>();
             rankingBlackjack = json.LeerValoresTreeSet("src\\Archivos\\RankingBlackjack.json", new Ranking());
         }else{
             throw new IOException();
         }
        } catch (IOException e) {
          System.out.println(e.getMessage());
        } 
         
     }
 
     public void blackjackToJson(){
        json = new ClaseJsonGenerica<>();
        json.CargarValores(rankingBlackjack, "src\\Archivos\\RankingBlackjack.json");
     }

     public void pacmanFromJson(){
        
        try {
         
         if(new File("src\\Archivos\\RankingPacman.json").exists()){
             json = new ClaseJsonGenerica<>();
             rankingPacman = json.LeerValoresTreeSet("src\\Archivos\\RankingPacman.json", new Ranking());
         }else{
             throw new IOException();
         }
        } catch (IOException e) {
          System.out.println(e.getMessage());
        } 
         
     }
 
     public void pacmanToJson(){
        json = new ClaseJsonGenerica<>();
        json.CargarValores(rankingPacman, "src\\Archivos\\RankingPacman.json");
     }

     public void galagaFromJson(){
        
        try {
         
         if(new File("src\\Archivos\\RankingGalaga.json").exists()){
             json = new ClaseJsonGenerica<>();
             rankingGalaga = json.LeerValoresTreeSet("src\\Archivos\\RankingGalaga.json", new Ranking());
         }else{
             throw new IOException();
         }
        } catch (IOException e) {
          System.out.println(e.getMessage());
        } 
         
     }
 
     public void galagaToJson(){
        json = new ClaseJsonGenerica<>();
        json.CargarValores(rankingGalaga, "src\\Archivos\\RankingGalaga.json");
     }

     

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
