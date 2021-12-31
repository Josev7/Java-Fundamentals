package Practico06;

public class Persona {
    //atributos
    private String nombre;
    private int dni;
    //protected String nombre; LOS HIJOS PUEDEN USAR
    //protected int dni;        LOS HIJOS PUEDEN USAR

    //Constructores
    public Persona(String unNombre, int unDni) {
        this.nombre = unNombre;
        this.dni = unDni;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setDni(int unDni) {
        this.dni = unDni;
    }
    public int getDni() {
        return this.dni;
    }

    public String toString() {
        return "La Persona " + this.nombre + " con DNI: " + this.dni;
    }


}
