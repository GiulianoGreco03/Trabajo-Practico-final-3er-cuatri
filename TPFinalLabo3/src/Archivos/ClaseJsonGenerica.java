package Archivos;
import java.util.*;
import java.io.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ClaseJsonGenerica<T /*extends Comparable<T>*/> {

    private ObjectMapper mapper;

    public ClaseJsonGenerica(){
        mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public void CargarValores(HashMap<String, T> aCargar, String path){
        try {
            mapper.writeValue(new File(path), aCargar); 
         } catch (IOException e) {
             System.out.println(e.getMessage());
         }
    }

    public HashMap<String, T> LeerValoresHashMap(String ruta, TypeReference<HashMap<String, T>> typeRef) {
        try {
            return mapper.readValue(new File(ruta), typeRef);
        } catch (IOException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }

    public void CargarValores(List<T> aCargar, String path){
        try {
           mapper.writeValue(new File(path), aCargar); 
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public List<T> LeerValoresArray(String path, Object clase){
        List<T> aCargar = new ArrayList<>(); 
     try {
        JavaType type = mapper.getTypeFactory().constructCollectionType(ArrayList.class, clase.getClass());
        aCargar = mapper.readValue(new File(path), type);

    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    return aCargar;
}

    public LinkedList<T> LeerValoresLinked(String path, Object clase){
        LinkedList<T> aCargar = new LinkedList<>(); 
     try {
        JavaType type = mapper.getTypeFactory().constructCollectionType(LinkedList.class, clase.getClass());
        aCargar = mapper.readValue(new File(path), type);

    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    return aCargar;
}

    

    public void CargarValores(TreeSet<T> aCargar, String path){
        try {
            mapper.writeValue(new File(path), aCargar); 
         } catch (IOException e) {
             System.out.println(e.getMessage());
         }
    }

    public TreeSet<T> LeerValoresTreeSet(String path, T clase){
            TreeSet<T> aCargar = new TreeSet<>();
         try {
            JavaType type = mapper.getTypeFactory().constructCollectionType(TreeSet.class, clase.getClass());
            aCargar = mapper.readValue(new File(path), type);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return aCargar;
    }

    public ObjectMapper getMapper() {
        return mapper;
    }

    public void setMapper(ObjectMapper mapper) {
        this.mapper = mapper;
    }
 

    




}
