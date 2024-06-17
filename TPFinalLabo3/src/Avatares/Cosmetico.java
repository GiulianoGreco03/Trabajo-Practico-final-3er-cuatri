package Avatares;

public class Cosmetico {

    private String nombreCosmetico;
    private String pathSprite;
    private Long precio;
    private boolean habilitado;
    private EnumCosmeticos tipo;

    public Cosmetico(){

    }

    public Cosmetico(String nombreCosmetico, String pathSprite, Long precio, boolean habilitado, EnumCosmeticos tipo) {
        this.nombreCosmetico = nombreCosmetico;
        this.pathSprite = pathSprite;
        this.precio = precio;
        this.habilitado = habilitado;
        this.tipo = tipo;
    }

    public String getNombreCosmetico() {
        return nombreCosmetico;
    }

    public void setNombreCosmetico(String nombreCosmetico) {
        this.nombreCosmetico = nombreCosmetico;
    }

    public String getPathSprite() {
        return pathSprite;
    }

    public void setPathSprite(String pathSprite) {
        this.pathSprite = pathSprite;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public EnumCosmeticos getTipo() {
        return tipo;
    }

    public void setTipo(EnumCosmeticos tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cosmetico [nombreCosmetico=" + nombreCosmetico + ", pathSprite=" + pathSprite + ", precio=" + precio
                + ", habilitado=" + habilitado + ", tipo=" + tipo + "]";
    }

    

    

    

}
