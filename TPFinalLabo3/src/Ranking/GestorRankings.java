package ColeccionGenerica;

import java.util.Iterator;
import java.util.TreeSet;

import Excepciones.ObraNoEncontradaException;
import ObrasDeArte.*;

public class ColeccionGenerica<T extends ObraDeArte> {

    private TreeSet<T> elementos;

    public ColeccionGenerica(){
        elementos = new TreeSet<>();
    }

    public TreeSet<T> getElementos() {
        return elementos;
    }

    public void setElementos(TreeSet<T> elementos) {
        this.elementos = elementos;
    }


    public void agregarElemento(T elemento){
        elementos.add(elemento);
    }

    public void mostrarElementos(){
        Iterator<T> it = elementos.iterator();

        while (it.hasNext()) { 
            T objeto = it.next();
           
            System.out.println(objeto.toString() + "\n");
        }
            
        }
    
    

    public T buscarElementoPorTitulo(String titulo){
        try {
            Iterator<T> it = elementos.iterator();

            while (it.hasNext()) {
                T objeto = it.next();

                if(objeto.getTitulo().equalsIgnoreCase(titulo) ){
                    return objeto;
                }
            }

            throw new ObraNoEncontradaException();
            
        } catch (ObraNoEncontradaException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }



}
