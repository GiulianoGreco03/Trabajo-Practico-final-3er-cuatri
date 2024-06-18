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
    private TreeSet<Ranking> rankingTetris;
    private TreeSet<Ranking> rankingflappy;
    private TreeSet<Ranking> rankingGalaga;
    private ClaseJsonGenerica<Ranking> json;

    public GestorRankings(){
        rankingBuscaminas = new TreeSet<>();
        rankingDinosaurio = new TreeSet<>();
        rankingGalaga = new TreeSet<>();
        rankingflappy = new TreeSet<>();
        rankingSnake = new TreeSet<>();
        rankingTetris = new TreeSet<>();
    }

    public void snakeFromJson(){
        
       
        
        if(new File("src\\Archivos\\RankingSnake.json").exists()){
            json = new ClaseJsonGenerica<>();
            rankingSnake = json.LeerValoresTreeSet("src\\Archivos\\RankingSnake.json", new Ranking());
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
            case EnumJuegos.Tetris:
                TetrisFromJson();
                agregarRankingTetris(ranking);
                TetrisToJson();
                break;
            case EnumJuegos.Dinosaurio:
                dinosaurioFromJson();
                agregarRankingDinosaurio(ranking);
                dinosaurioToJson();
                break;
            case EnumJuegos.Flappy:
                flappyFromJson();
                agregarRankingflappy(ranking);
                flappyToJson();
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
            case EnumJuegos.Tetris:
                
                agregarRankingTetris(ranking);
                
                break;
            case EnumJuegos.Dinosaurio:
                
                agregarRankingDinosaurio(ranking);
                
                break;
            case EnumJuegos.Flappy:
                
                agregarRankingflappy(ranking);
                
                break;
        }
    }

    public void snakeToJson(){
                json = new ClaseJsonGenerica<>();
                json.CargarValores(rankingSnake, "src\\Archivos\\RankingSnake.json");
            

    }

    public void buscaminasFromJson(){
    
         
         if(new File("src\\Archivos\\RankingBuscaminas.json").exists()){
             json = new ClaseJsonGenerica<>();
             rankingBuscaminas = json.LeerValoresTreeSet("src\\Archivos\\RankingBuscaminas.json", new Ranking());
         }
         
     }
 
     public void buscaminasToJson(){
        json = new ClaseJsonGenerica<>();
        json.CargarValores(rankingBuscaminas, "src\\Archivos\\RankingBuscaminas.json");
     }

     public void dinosaurioFromJson(){
        
        
         
         if(new File("src\\Archivos\\RankingDinosaurio.json").exists()){
             json = new ClaseJsonGenerica<>();
             rankingDinosaurio = json.LeerValoresTreeSet("src\\Archivos\\RankingDinosaurio.json", new Ranking());
         }
         
     }
 
     public void dinosaurioToJson(){
        json = new ClaseJsonGenerica<>();
        json.CargarValores(rankingDinosaurio, "src\\Archivos\\RankingDinosaurio.json");
     }

     public void TetrisFromJson(){
        
       
         
         if(new File("src\\Archivos\\RankingTetris.json").exists()){
             json = new ClaseJsonGenerica<>();
             rankingTetris = json.LeerValoresTreeSet("src\\Archivos\\RankingTetris.json", new Ranking());
         }
         
     }
 
     public void TetrisToJson(){
        json = new ClaseJsonGenerica<>();
        json.CargarValores(rankingTetris, "src\\Archivos\\RankingTetris.json");
     }

     public void flappyFromJson(){
        
         
         if(new File("src\\Archivos\\Rankingflappy.json").exists()){
             json = new ClaseJsonGenerica<>();
             rankingflappy = json.LeerValoresTreeSet("src\\Archivos\\Rankingflappy.json", new Ranking());
         }
         
     }
 
     public void flappyToJson(){
        json = new ClaseJsonGenerica<>();
        json.CargarValores(rankingflappy, "src\\Archivos\\Rankingflappy.json");
     }

     public void galagaFromJson(){
        
        
         if(new File("src\\Archivos\\RankingGalaga.json").exists()){
             json = new ClaseJsonGenerica<>();
             rankingGalaga = json.LeerValoresTreeSet("src\\Archivos\\RankingGalaga.json", new Ranking());
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
    public TreeSet<Ranking> getRankingTetris() {
        return rankingTetris;
    }
    public void setRankingTetris(TreeSet<Ranking> rankingTetris) {
        this.rankingTetris = rankingTetris;
    }
    public TreeSet<Ranking> getRankingflappy() {
        return rankingflappy;
    }
    public void setRankingPacman(TreeSet<Ranking> rankingPacman) {
        this.rankingflappy = rankingPacman;
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
    public void agregarRankingflappy(Ranking ranking){
        rankingflappy.add(ranking);
    }
    public void agregarRankingTetris(Ranking ranking){
        rankingTetris.add(ranking);
    }

    public void mostrarRankingTetris(){
        Iterator<Ranking> it = rankingTetris.iterator();

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
    public void mostrarRankingflappy(){
        Iterator<Ranking> it = rankingflappy.iterator();

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
    

    public Ranking buscarRankingTetrisPorUsuario(String nombre){
        try {
            Iterator<Ranking> it = rankingTetris.iterator();
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
    public Ranking buscarRankingflappyPorUsuario(String nombre){
        try {
            Iterator<Ranking> it = rankingflappy.iterator();
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
    public void limpiarRankingTetris(){
        rankingTetris.clear();
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
    public void limpiarRankingflappy(){
        rankingflappy.clear();
    }
    public void limpiarRankingSnake(){
        rankingSnake.clear();
    }

    
    
    
    
}
