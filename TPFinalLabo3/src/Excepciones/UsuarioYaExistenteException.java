package Excepciones;
//
public class UsuarioYaExistenteException extends RuntimeException {
    public UsuarioYaExistenteException(){
        System.out.println("El usuario ya existe") ;
    }
    
}