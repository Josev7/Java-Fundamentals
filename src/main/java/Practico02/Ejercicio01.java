package Practico02;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String args[]) {
        String nombre= "";
        int año = 0;
        int edad = 0;
        //TECLADO
        Scanner input = new Scanner(System.in);

        //MOSTRAR
        System.out.println("Ingrese su nombre: ");
        nombre = input.next();

        System.out.println("Ingrese su año de nacimiento: ");
        año = input.nextInt();

        edad = 2021 - año;
        System.out.println("Su nombre es " + nombre);
        System.out.println("Su edad es: " + edad);

    }
}
