package Excepciones;

public class UsuarioYaPoseeCosmetico extends Exception{
    public UsuarioYaPoseeCosmetico(){
        super("El usuario ya posee este cosmetico");
    }
}
