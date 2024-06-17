package Usuarios;

import Juegos.*;
import java.util.HashMap;

public class Usuario {
    private String nombre;
    private String contraseña;
    private boolean admin;
    private Long puntuacion;
    private HashMap<EnumJuegos, Long> puntuacionMaxima;
    // private Avatar avatar
    private boolean cuentaActiva;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setPuntuacion(Long puntuacion) {
        this.puntuacion = puntuacion;
    }

    public HashMap<EnumJuegos, Long> getPuntuacionMaxima() {
        return puntuacionMaxima;
    }

    public void setPuntuacionMaxima(HashMap<EnumJuegos, Long> puntuacionMaxima) {
        this.puntuacionMaxima = puntuacionMaxima;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isCuentaActiva() {
        return cuentaActiva;
    }

    public void setCuentaActiva(boolean cuentaActiva) {
        this.cuentaActiva = cuentaActiva;
    }

    public Usuario() {

    }

    public Usuario(String nombre, String contraseña, boolean admin, boolean cuentaActiva) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.admin = admin;
        this.puntuacionMaxima = new HashMap<>();
        this.cuentaActiva = cuentaActiva;
    }

    public void sumarPuntajeUsuario(long puntuacion) {
        this.puntuacion += puntuacion;
    }

    public void cargarPuntacionMaxima(EnumJuegos juego, Long puntuacionGanada) {

        if (puntuacionMaxima.containsKey(juego)) {
            if (puntuacionGanada > puntuacionMaxima.get(juego)) {
                puntuacionMaxima.put(juego, puntuacionGanada);
            }
        } else {
            puntuacionMaxima.put(juego, puntuacionGanada);
        }

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((contraseña == null) ? 0 : contraseña.hashCode());
        result = prime * result + (admin ? 1231 : 1237);
        result = prime * result + ((puntuacion == null) ? 0 : puntuacion.hashCode());
        result = prime * result + (cuentaActiva ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (contraseña == null) {
            if (other.contraseña != null)
                return false;
        } else if (!contraseña.equals(other.contraseña))
            return false;
        if (admin != other.admin)
            return false;
        if (puntuacion == null) {
            if (other.puntuacion != null)
                return false;
        } else if (!puntuacion.equals(other.puntuacion))
            return false;
        if (cuentaActiva != other.cuentaActiva)
            return false;
        return true;
    }

    public Long getPuntuacion() {
        return puntuacion;
    }

}
