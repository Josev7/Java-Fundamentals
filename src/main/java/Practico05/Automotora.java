package Practico05;

import java.util.Scanner;

public class Automotora {
    public static void main(String [] args) {
        Utilities.bienvenida(); //Como es un metodo ESTATICO, puedo invocarlo con clase y metodo!

        Scanner input = new Scanner(System.in);

        Utilities utils = new Utilities();
        utils.saludar(); // AHORA LO PUEDO USAR PORQUE CREE EL OBJETO.
        //tENGO QUE DARME QUE CUENTA Q SIGNIFICA QUE ESTE EL STATICO Y QUE NO ESTE
        //Si hago utils.bienvenida(); NO Va a estar porque es de la clase

        Camion c1 = new Camion();

        System.out.println("Patente de c1 es: " + c1.getPatente());
        System.out.println("El color de c1 es: " + c1.getColor());
        System.out.println("El modelo del camión es: " + c1.getañoCompra());

        Camion c2 = new Camion(1111);
        c2.setColor("Fucsia");

        System.out.println("Patente de c2 es: " + c2.getPatente());
        System.out.println("El color de c2 es: " + c2.getColor());
        System.out.println("El modelo del camión es: " + c2.getañoCompra());

        Camion c3 = new Camion(4532, "Amarillo");
        System.out.println("Ingrese el color del camion c3: ");
        String colorDeC3 = input.next();

        System.out.println("Ingrese la patente de c3: ");
        int patenteDec3 = input.nextInt();

        c3.setColor(colorDeC3);
        c3.setPatente(patenteDec3);

        System.out.println("Patente de c3 es: " + c3.getPatente());
        System.out.println("El color de c3 es: " + c3.getColor());

        Camion c4 = new Camion(patenteDec3, colorDeC3);
        System.out.println("Patente de c4 es: " + c4.getPatente());
        System.out.println("El color de c4 es: " + c4.getColor());

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        Utilities.finalizarPrograma();

    }

}
