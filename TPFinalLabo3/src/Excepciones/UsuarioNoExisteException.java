package Excepciones;

public class UsuarioNoExisteException extends Exception {
    public UsuarioNoExisteException(String nombre){
    super("Usuario no existe") ;
    }
}

