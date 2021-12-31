package Practico05;

public class Utilities {
    public void saludar() { //NO PERTENECE a la clase, SINO a los objetos que se creen a partir de la clase
        System.out.println("Hola que tal?");    //Metodo sin VOID
    }

    public static void bienvenida() { //METODO ESTATICO. puedo usarlo en el main con clase.metodo()
        System.out.println("********** BIENVENIDO AL PROGRAMA **********");
    }

    public static void finalizarPrograma() { //METODO ESTATICO
        System.out.println("********** FIN DE PROGRAMA *********");
    }




}
