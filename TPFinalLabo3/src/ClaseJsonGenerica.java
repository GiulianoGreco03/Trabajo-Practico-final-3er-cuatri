import java.util.*;
import java.io.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClaseJsonGenerica<T> {

    private T datosACargar;
    private ObjectMapper mapper;

    public ClaseJsonGenerica(){
        mapper = new ObjectMapper();
    }

    public void crearJson(String nombre){
        File file = new File("TPFinalLabo3\src", nombre);
    }

    public void CargarValores(List<T> aCargar, String path){
        try {
           mapper.writeValue(new File(path), aCargar); 
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void CargarValores(HashMap<String, T> aCargar, String path){
        try {
            mapper.writeValue(new File(path), new TypeReference<HashMap<String, T>>() {}); 
         } catch (IOException e) {
             System.out.println(e.getMessage());
         }
    }

    public void CargarValores(TreeSet<T> aCargar, String path){
        try {
            mapper.writeValue(new File(path), new TypeReference<TreeSet<T>>() {}); 
         } catch (IOException e) {
             System.out.println(e.getMessage());
         }
    }



}
