package Practico05;

public class Camion {
    //Atributos de INSTANCIA
    private int patente;
    private String color;
    private int añoCompra;
    private int idCamion;

    //Atributo de clase
    private static int CONTADOR_CAMIONES = 5000;

    //Constructor sin parametros
    public Camion() {
        this.patente = 1234;
        this.color = "negro";
        this.añoCompra = 2021;
        this.idCamion = CONTADOR_CAMIONES;
        CONTADOR_CAMIONES++;
    }

    //Constructor con un parametro
    public Camion(int unPatente) {
        this.patente = unPatente;
        this.color = "gris";
        this.añoCompra = 2021;
    }

    //Constructor con dos parametros
    public Camion(int unPatente, String unColor) {
        this.patente = unPatente;
        this.color = unColor;
        this.añoCompra = 2021;
    }

    //Setters y getters

    //Para cada método vamos a tener dos atributos, un set y un get
    public void setColor(String unColor) { //retorno void, porque NO hay retorno
        this.color = unColor;
    }

    public String getColor() {
        return this.color;
    }

    public void setPatente(int unPatente) {
        this.patente = unPatente;
    }

    public int getPatente() {
        return this.patente;
    }

    //TOSTRING: Convertir de HEXA a String

    public String toString() {
        String retorno = "El ID del camión es " + this.idCamion + ". El color del camion es " + this.color + " y su chapa es " + this.patente;
        retorno += ". El año de compra es: " + this.añoCompra + ". ";
        if (this.leTocaRevision() == true) {
            retorno += "Le toca revision ";
        } else {
            retorno += "NO le toca revisión";
        }
        return retorno;
    }

    public void setAñoCompra(int unAño) {
        this.añoCompra = unAño;
    }

    public int getañoCompra() {
        return this.añoCompra;
    }

    public boolean leTocaRevision() {
        if (this.añoCompra < 2015) {
            return true;
        } else {
            return false;
        }
    }



}

