package Practico06;

public class Profesor extends Persona{
    //ATRIBUTOS
    //Hereda de Persona nombre y dni
    private String materia;

    //CONSTRUCTOR
    public Profesor(String unNombre, int unDni, String unaMateria) {
        super(unNombre, unDni); //llamo a la clase padre
        this.materia = unaMateria;
    }

    //SETTERS AND GETTERS

    public void setMateria(String unaMateria) {
        this.materia = unaMateria;
    }
    public String getMateria() {
        return this.materia;
    }

    public String toString() {
        return "El profesor " + this.getNombre() + " tiene DNI: " + this.getDni() + " y su materia es: " + this.materia;
        //return super.toString() + " y su materia es: " + this.materia;
    }


}
