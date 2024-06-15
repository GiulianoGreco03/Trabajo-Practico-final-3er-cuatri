package Excepciones;
//
public class UsuarioYaExistenteException extends RuntimeException {
    public UsuarioYaExistenteException(String nombre){
        System.out.println("El usuario " + nombre + " ya existe") ;
    }
    
}