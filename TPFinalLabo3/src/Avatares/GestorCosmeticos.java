package Avatares;

import java.util.LinkedList;

import Archivos.ClaseJsonGenerica;

public class GestorCosmeticos {

    private LinkedList<Cosmetico> gorros;
    private LinkedList<Cosmetico> lentes;
    private LinkedList<Cosmetico> trajes;
    private ClaseJsonGenerica<Cosmetico> json;


    public GestorCosmeticos() {
        this.gorros = new LinkedList<>();
        this.lentes = new LinkedList<>();
        this.trajes = new LinkedList<>();
        json = new ClaseJsonGenerica<>();

        gorrosFromJson();
        lentesFromJson();
        trajesFromJson();
    }

    public void agregarCosmetico(Cosmetico cosmetico){
        switch (cosmetico.getTipo()) {
            case EnumCosmeticos.GORRO:
                gorros.add(cosmetico);
                break;
            case EnumCosmeticos.LENTE:
                lentes.add(cosmetico);
                break;
            case EnumCosmeticos.TRAJE:
                trajes.add(cosmetico);
                break;
        }
    }

    public LinkedList<Cosmetico> listaHabilitada(EnumCosmeticos e){
        LinkedList<Cosmetico> listaNueva = new LinkedList<>();
        switch (e) {
            case GORRO:
                for (Cosmetico gorro : gorros) {
                    if(gorro.isHabilitado())
                        listaNueva.add(gorro);
                }
                break;
            case LENTE:
            for (Cosmetico lente : lentes) {
                if(lente.isHabilitado())
                    listaNueva.add(lente);
            }
                break;
            case TRAJE:
            for (Cosmetico traje : trajes) {
                if(traje.isHabilitado())
                    listaNueva.add(traje);
            }
                break;
        }

        return listaNueva;
    }




    public ClaseJsonGenerica<Cosmetico> getJson() {
        return json;
    }

    public void setJson(ClaseJsonGenerica<Cosmetico> json) {
        this.json = json;
    }

    public void modificarCosmetico(Cosmetico cosmetico,int index){
        switch (cosmetico.getTipo()) {
            case EnumCosmeticos.GORRO:
                gorros.set(index, cosmetico);
                break;
            case EnumCosmeticos.LENTE:
                lentes.set(index, cosmetico);
                break;
            case EnumCosmeticos.TRAJE:
                trajes.set(index, cosmetico);
                break;
        }
    }

    public void gorrosToJson(){    
        json.CargarValores(gorros, "src\\Archivos\\Gorros.json");
    }

    public void gorrosFromJson(){
        gorros = json.LeerValoresLinked("src\\Archivos\\Gorros.json", new Cosmetico());
    }

    public void lentesToJson(){
        json = new ClaseJsonGenerica<>();
        json.CargarValores(lentes, "src\\Archivos\\Lentes.json");
    }

    public void lentesFromJson(){
        lentes = json.LeerValoresLinked("src\\Archivos\\Lentes.json", new Cosmetico());
    }

    public void trajesToJson(){
        json = new ClaseJsonGenerica<>();
        json.CargarValores(trajes, "src\\Archivos\\Trajes.json");
    }

    public void trajesFromJson(){
        trajes = json.LeerValoresLinked("src\\Archivos\\Trajes.json", new Cosmetico());
    }

    /*public void cargarGorros(){
        gorros.add(new Cosmetico("Ninguno", "", 100l,true, EnumCosmeticos.GORRO));
        gorros.add(new Cosmetico("Sombrero Verde", "src\\Avatares\\Sprites\\SombreroVerde.png", 100l,true, EnumCosmeticos.GORRO));
        gorros.add(new Cosmetico("Sombrero Rojo", "src\\Avatares\\Sprites\\SombreroRojo.png", 100l,true, EnumCosmeticos.GORRO));
    }*/

    public LinkedList<Cosmetico> getGorros() {
        return gorros;
    }

    public void setGorros(LinkedList<Cosmetico> gorros) {
        this.gorros = gorros;
    }

    public LinkedList<Cosmetico> getLentes() {
        return lentes;
    }

    public void setLentes(LinkedList<Cosmetico> lentes) {
        this.lentes = lentes;
    }

    public LinkedList<Cosmetico> getTrajes() {
        return trajes;
    }

    public void setTrajes(LinkedList<Cosmetico> trajes) {
        this.trajes = trajes;
    }

    





    

}
