package Juegos;
public enum EnumJuegos {
    Snake(0),
    Flappy(1),
    Galaga(2),
    Dinosaurio(3),
    Tetris(4),
    Buscaminas(5);

    private int valor;

    private EnumJuegos(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }
}
