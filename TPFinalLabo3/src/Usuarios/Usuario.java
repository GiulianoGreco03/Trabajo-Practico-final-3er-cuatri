package Usuarios;

import Juegos.*;
import java.util.HashMap;
import java.util.LinkedList;

import Avatares.Avatar;
import Avatares.Cosmetico;
import Avatares.EnumCosmeticos;
import Excepciones.UsuarioYaPoseeCosmetico;

public class Usuario {
    private String nombre;
    private String contraseña;
    private boolean admin;
    private Long puntuacion;
    private HashMap<EnumJuegos, Long> puntuacionMaxima;
    private boolean cuentaActiva;

    public Usuario() {

    }

    public Usuario(String nombre, String contraseña, boolean admin, boolean cuentaActiva) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.admin = admin;
        this.puntuacionMaxima = new HashMap<>();
        this.cuentaActiva = cuentaActiva;
    }

    // Parametos avatar

    private LinkedList<String> sombreros;
    private int sombreroActivo;
    private LinkedList<String> lentes;
    private int lenteActivo;
    private LinkedList<String> traje;
    private int trajeActivo;

    // getters y setters

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<String> getSombreros() {
        return sombreros;
    }

    public void setSombreros(LinkedList<String> sombreros) {
        this.sombreros = sombreros;
    }

    public int getSombreroActivo() {
        return sombreroActivo;
    }

    public void setSombreroActivo(int sombreroActivo) {
        this.sombreroActivo = sombreroActivo;
    }

    public LinkedList<String> getLentes() {
        return lentes;
    }

    public void setLentes(LinkedList<String> lentes) {
        this.lentes = lentes;
    }

    public int getLenteActivo() {
        return lenteActivo;
    }

    public void setLenteActivo(int lenteActivo) {
        this.lenteActivo = lenteActivo;
    }

    public LinkedList<String> getTraje() {
        return traje;
    }

    public void setTraje(LinkedList<String> traje) {
        this.traje = traje;
    }

    public int getTrajeActivo() {
        return trajeActivo;
    }

    public void setTrajeActivo(int trajeActivo) {
        this.trajeActivo = trajeActivo;
    }

    // Metodos
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

    public void cargarAvatarDefault() {
        sombreros = new LinkedList<>();
        lentes = new LinkedList<>();
        traje = new LinkedList<>();
        sombreros.add("");
        sombreroActivo = 0;
        lentes.add("");
        lenteActivo = 0;
        traje.add("");
        trajeActivo = 0;
    }

    public boolean agregarCosmetico(Cosmetico cosmetico) {
        boolean flag = false;
        switch (cosmetico.getTipo()) {
            case EnumCosmeticos.GORRO:
                try {
                    if (!sombreros.contains(cosmetico.getPathSprite())) {
                        sombreros.add(cosmetico.getPathSprite());
                        flag = true;
                    } else
                        throw new UsuarioYaPoseeCosmetico();
                } catch (UsuarioYaPoseeCosmetico e) {
                    System.out.println(e.getMessage());
                    flag = false;
                }
                break;

            case EnumCosmeticos.LENTE:
                try {
                    if (!lentes.contains(cosmetico.getPathSprite())) {
                        lentes.add(cosmetico.getPathSprite());
                        flag = true;
                    } else
                        throw new UsuarioYaPoseeCosmetico();
                } catch (UsuarioYaPoseeCosmetico e) {
                    System.out.println(e.getMessage());
                    flag = false;
                }
                break;

            case EnumCosmeticos.TRAJE:
                try {
                    if (!traje.contains(cosmetico.getPathSprite())) {
                        traje.add(cosmetico.getPathSprite());
                        flag = true;
                    } else
                        throw new UsuarioYaPoseeCosmetico();
                } catch (UsuarioYaPoseeCosmetico e) {
                    System.out.println(e.getMessage());
                    flag = false;
                }
                break;

        }

        return flag;

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
