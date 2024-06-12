import java.util.*;
import java.io.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClaseJsonGenerica<T> {

    private ObjectMapper mapper;

    public ClaseJsonGenerica(){
        mapper = new ObjectMapper();
    }

    public void CargarValores(List<T> aCargar, String path){
        try {
           mapper.writeValue(new File(path), aCargar); 
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void LeerValores(List<T> aCargar, String path){
        try {
           mapper.readValue(new File(path), new TypeReference<List<T>>(){}); 
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void CargarValores(HashMap<String, T> aCargar, String path){
        try {
            mapper.writeValue(new File(path), aCargar); 
         } catch (IOException e) {
             System.out.println(e.getMessage());
         }
    }

    public void CargarValores(TreeSet<T> aCargar, String path){
        try {
            mapper.writeValue(new File(path), aCargar); 
         } catch (IOException e) {
             System.out.println(e.getMessage());
         }
    }





}
