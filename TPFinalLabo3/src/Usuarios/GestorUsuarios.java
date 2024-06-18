package Usuarios;

import java.io.File;
import java.util.HashMap;

import com.fasterxml.jackson.core.type.TypeReference;

import Archivos.ClaseJsonGenerica;
import Excepciones.UsuarioNoExisteException;
import Excepciones.UsuarioNoHabilitadoException;
import Excepciones.UsuarioYaExistenteException;

public class GestorUsuarios {

    private HashMap<String, Usuario> listadoUsuarios;
    private ClaseJsonGenerica<Usuario> json = new ClaseJsonGenerica<Usuario>();

    public GestorUsuarios() {
        listadoUsuarios = new HashMap<>();
        if(new File("src\\Archivos\\Usuarios.json").exists())
            listadoUsuarios = json.LeerValoresHashMap("src\\Archivos\\Usuarios.json", new TypeReference<HashMap<String, Usuario>>() {});
    }

    public HashMap<String, Usuario> getHashMap() {
        return listadoUsuarios;
    }

    public void setHashMap(HashMap<String, Usuario> listadoUsuarios) {
        this.listadoUsuarios = listadoUsuarios;
    }

    // metodos

    public Usuario buscarUsuario(String nombreUsuario) {
        Usuario aux = null;
        try {  

            if (getHashMap().containsKey(nombreUsuario)) {
                
                if (getHashMap().get(nombreUsuario).isCuentaActiva()) {
                    aux = getHashMap().get(nombreUsuario);
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

        return aux;
    }

    public Usuario buscarUsuarioAdmin(String nombreUsuario) {
        Usuario aux = null;
        try {  

            if (getHashMap().containsKey(nombreUsuario)) {
                    aux = getHashMap().get(nombreUsuario);            

            } else {
                throw new UsuarioNoExisteException();
            }

        } catch (UsuarioNoExisteException e) {
            System.out.println(e.getMessage());
        } 

        return aux;
    }


    public boolean usuarioRegistrado(String nombre){
        boolean registrado;
        try {
            if(listadoUsuarios.containsKey(nombre)){
                throw new UsuarioYaExistenteException();
            }else{
                registrado = false;
            }
        } catch (UsuarioYaExistenteException e) {
            registrado = true;
            System.out.println(e.getMessage());
        }

        return registrado;
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

    public Usuario crearUsuario(String nombre, String contraseña){
        return new Usuario(nombre, contraseña, false, true);
    }

    public Usuario crearUsuarioAdmin(String nombre, String contraseña){
        return new Usuario(nombre, contraseña, true, true);
    }

    public void cargarUsuarioJson(Usuario usuario){
        listadoUsuarios.put(usuario.getNombre(), usuario);
        json.CargarValores(listadoUsuarios, "src\\Archivos\\Usuarios.json");
    }

}
