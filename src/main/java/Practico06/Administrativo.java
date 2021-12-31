package Practico06;

public class Administrativo extends Persona{

    public Administrativo(String unNombre, int unDni) {
        super(unNombre, unDni);
    }

    public String toString(){
        return this.getNombre() + " es un administrativo";
    }



}
