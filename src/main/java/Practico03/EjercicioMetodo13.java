package Practico03;

import java.util.Scanner;

public class EjercicioMetodo13 {
    public static void main(String args[]) {
        int numero = 0;
        int valor = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número: ");
        numero = input.nextInt();
        valor= valorAbsoluto(numero);
        System.out.println("Su valor absoluto es: " + valor);

    }

    public static int valorAbsoluto(int n) {
        if (n < 0) {
            return n * -1;
        } else {
            return n;
        }

    }
}
