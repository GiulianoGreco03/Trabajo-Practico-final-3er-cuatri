package Ranking;

import Juegos.*;
import java.io.Serializable;

public class Ranking implements Comparable<Ranking>, Serializable{
        private String usuario;
        private Long puntuacion;
        private EnumJuegos juego;

        public  Class<Ranking> getType(){
            return Ranking.class;
        }
        public String getUsuario() {
            return usuario;
        }
        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }
        public Long getPuntuacion() {
            return puntuacion;
        }
        public void setPuntuacion(Long puntuacion) {
            this.puntuacion = puntuacion;
        }
        public EnumJuegos getJuego() {
            return juego;
        }
        public void setJuego(EnumJuegos juego) {
            this.juego = juego;
        }
        
        public Ranking(String usuario, Long puntuacion, EnumJuegos juego) {
            this.usuario = usuario;
            this.puntuacion = puntuacion;
            this.juego = juego;
        }
        public Ranking() {
        }
        @Override
        public String toString() {
            return "Ranking [usuario=" + usuario + ", puntuacion=" + puntuacion + ", juego=" + juego + "]";
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
            result = prime * result + ((puntuacion == null) ? 0 : puntuacion.hashCode());
            result = prime * result + ((juego == null) ? 0 : juego.hashCode());
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
            Ranking other = (Ranking) obj;
            if (usuario == null) {
                if (other.usuario != null)
                    return false;
            } else if (!usuario.equals(other.usuario))
                return false;
            if (puntuacion == null) {
                if (other.puntuacion != null)
                    return false;
            } else if (!puntuacion.equals(other.puntuacion))
                return false;
            if (juego != other.juego)
                return false;
            return true;
        }
        @Override
        public int compareTo(Ranking o) {
            if (this.puntuacion.compareTo(o.getPuntuacion()) != 0) {
                return this.puntuacion.compareTo(o.puntuacion); // Orden descendente por puntuación
            } else {
                return this.usuario.compareTo(o.getUsuario()); // Orden ascendente por usuario
            }
        }
    }
