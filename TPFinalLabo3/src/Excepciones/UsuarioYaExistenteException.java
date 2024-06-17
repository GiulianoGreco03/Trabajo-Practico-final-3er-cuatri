package Excepciones;
//
public class UsuarioYaExistenteException extends Exception {
    public UsuarioYaExistenteException(){
        System.out.println("El usuario ya existe") ;
    }
    
}