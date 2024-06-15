package Excepciones;

public class UsuarioNoHabilitadoException extends Exception{
    public UsuarioNoHabilitadoException(){
        super("El usuario esta dehabilitado");
    }
}
