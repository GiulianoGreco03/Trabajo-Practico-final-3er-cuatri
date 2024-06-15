package Usuario;

import java.util.HashMap;

import Excepciones.UsuarioNoExisteException;
import Excepciones.UsuarioNoHabilitadoException;
import Excepciones.UsuarioYaExistenteException;

public class GestorUsuarios {

    private HashMap<String, Usuario> listadoUsuarios;

    public GestorUsuarios() {
        listadoUsuarios = new HashMap<>();
    }

    public HashMap<String, Usuario> getHashMap() {
        return listadoUsuarios;
    }
    public void setHashMap(HashMap<String, Usuario> listadoUsuarios) {
        this.listadoUsuarios = listadoUsuarios;
    }

    // metodos

    public Usuario buscarUsuario(String nombreUsuario) {
        try {
            if (listadoUsuarios.containsKey(nombreUsuario)) {
                if (listadoUsuarios.get(nombreUsuario).isCuentaActiva()) {
                    return listadoUsuarios.get(nombreUsuario);
                } else {
                    throw new UsuarioNoHabilitadoException();
                }

            } else {
                throw new UsuarioNoExisteException();
            }

        } catch (UsuarioNoExisteException e) {
            System.out.println(e.getMessage());
        } catch (UsuarioNoHabilitadoException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public void agregarUsuario(Usuario usuario) {
        try {
            if (listadoUsuarios.containsKey(usuario.getNombre())) {
                throw new UsuarioYaExistenteException();
            } else {
                listadoUsuarios.put(usuario.getNombre(), usuario);
            }
        } catch (UsuarioYaExistenteException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deshabilitarUsuario(Usuario usuario) {
        try {

            if (listadoUsuarios.containsKey(usuario.getNombre())) {
                listadoUsuarios.get(usuario.getNombre()).setCuentaActiva(false);
            } else {
                throw new UsuarioNoExisteException();
            }

        } catch (UsuarioNoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    

}
