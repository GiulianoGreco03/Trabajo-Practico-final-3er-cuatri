package Juegos;
public enum EnumJuegos {
    Snake(0),
    Pacman(1),
    Galaga(2),
    Dinosaurio(3),
    Blackjack(4),
    Buscaminas(5);

    private int valor;

    private EnumJuegos(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }
}
