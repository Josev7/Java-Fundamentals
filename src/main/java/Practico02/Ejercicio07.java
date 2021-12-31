package Practico02;

import java.util.Scanner;

public class Ejercicio07 {
    //INICIO
    public static void main(String args[]) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int suma = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = input.nextInt();
        System.out.println("Ingrese el último número: ");
        num4 = input.nextInt();

        suma = num1 + num2 + num3 + num4;

        if (suma < 0) {
            suma = suma * (-1);
            System.out.println("el valor absoluto de la suma es: " + suma);
        } else {
            System.out.println("el valor absoluto de la suma es: " + suma);
        }

    }
}