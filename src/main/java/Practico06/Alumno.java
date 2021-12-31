package Practico06;

public class Alumno extends Persona {   //AGREGO HERENCIA
    //atributos

    private String curso;

    //Constructores
    public Alumno(String unNombre, int unDni, String unCurso) {
        super(unNombre, unDni); //Llamo al metodo constructor de la clase padre
        this.curso = unCurso;
    }

    //Defino setter y getter ya que no está en la clase Padre
    public void setCurso(String unCurso) {
        this.curso = unCurso;
    }
    public String getCurso() {
        return this.curso;
    }

    public String toString() {
        return "El alumno es " + this.getNombre() + " con DNI: " + this.getDni() + " y cursa: " + this.curso;
    }

}
