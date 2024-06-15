package Plataforma;

import java.util.HashMap;

import Excepciones.UsuarioYaExistente;
import Usuario.Usuario;

public class ListadoUsuarios {
    HashMap<String, Usuario> listadoUsuarios ;

    public ListadoUsuarios () {
        listadoUsuarios = new HashMap<>() ;
    }

    public HashMap getHashMap() {
        return listadoUsuarios;
    }

    public void ingresoUsuario ( Usuario usuario ) {
        try {
            if ( !listadoUsuarios.containsValue(usuario.getNombre) ) {
                listadoUsuarios.put(usuario.getNombre, usuario) ;
            } else {
                throw new UsuarioYaExistente() ;
            }
        } catch ( UsuarioYaExistente e ) {
            System.out.println("Usuario ya existe");
        }
    }

    
}
