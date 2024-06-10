package InterfazGrafica;
public enum PaletaDeColores {

    PanelPrincipal(106,25,148),
    Botones(133,36,103),
    BotonPresionado(115,115,115),
    CuadradoTexto(66, 140, 140),
    ColorLetras(255, 255, 255);

    
    int R;
    int G;
    int B;

    private PaletaDeColores(int R, int G, int B){
        this.R = R;
        this.G = G;
        this.B = B;
    }
}
