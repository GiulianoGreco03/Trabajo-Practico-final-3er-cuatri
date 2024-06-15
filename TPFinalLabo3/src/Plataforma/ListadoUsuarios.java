package Plataforma;

import java.util.HashMap;

import Excepciones.*;
import Usuario.Usuario;

public class ListadoUsuarios {
    HashMap<String, Usuario> listadoUsuarios ;

    public ListadoUsuarios () {
        listadoUsuarios = new HashMap<>() ;
    }

    public HashMap<String, Usuario> getHashMap() {
        return listadoUsuarios;
    }
    public void setHashMap ( HashMap<String, Usuario> listadoUsuarios ) {
        this.listadoUsuarios = listadoUsuarios ;
    }

    public void ingresoUsuario ( Usuario usuario ) {
        try {
            if ( !listadoUsuarios.containsKey(usuario.getNombre()) ) {
                listadoUsuarios.put(usuario.getNombre(), usuario) ;
            } else {
                throw new UsuarioYaExistenteException(usuario.getNombre()) ;
            }
        } catch ( UsuarioYaExistenteException e ) {
            System.out.println(e.getMessage());
        }
    }

}
