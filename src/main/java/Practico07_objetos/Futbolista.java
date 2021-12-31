package Practico07_objetos;

public class Futbolista {
        private int id;
        private String nombre;
        private String posicion;

        public Futbolista(int unId, String unNombre, String unaPosición) {
            this.id = unId;
            this.nombre = unNombre;
            this.posicion = unaPosición;
        }

        public void setId(int unId) {
            this.id = unId;
        }

        public int getId() {
            return this.id;
        }

        public void setNombre(String unNombre) {
            this.nombre = unNombre;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setPosicion(String unaPosicion) {
            this.posicion = unaPosicion;
        }

        public String getPosicion() {
            return this.posicion;
        }

        public String toString() {
            return "El nombre del futbolista es " + this.nombre + ". su ID es " + this.id + " y su posicion es " + this.posicion + ".";
        }
}
