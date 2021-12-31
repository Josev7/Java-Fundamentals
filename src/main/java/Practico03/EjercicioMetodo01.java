package Practico03;

import java.util.Scanner;

public class EjercicioMetodo01 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int numero = input.nextInt();
        int doble = calcularDoble(numero);
        System.out.println("El doble de " + numero + " es " + doble);
        esMayorA20(doble);
        multiplicar(5,2);
        saludoFinal();
        cualEsMayor(doble, 30);
        }

    public static int calcularDoble(int num) {
        return num * 2;
    }

    public static void esMayorA20(int num) {
        if (num >= 20) {
            System.out.println("El numero " + num + " es mayor a 20");
        } else {
            System.out.println("El numero " +  num + " No es mayor a 20");
        }
    }

    public static void saludoFinal() {
        System.out.println("El programa ha finalizado...");
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static void cualEsMayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.println("El numero mayor es: " + numero1);
        } else  {
            System.out.println("El numero mayor es: " + numero2);
        }
    }
}
