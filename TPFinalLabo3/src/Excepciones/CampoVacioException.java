package Excepciones;

public class CampoVacioException extends Exception{
    public CampoVacioException(){
        super("Hay campos que se encuentran vacios");
    }
}
