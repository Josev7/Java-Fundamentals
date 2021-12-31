package Practico03;

import java.util.Optional;
import java.util.Scanner;

public class EjercicioMetodo12 {
    public static void main(String args[]) {
    int total = 0;
    int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero para calcular si factorial: ");
        n = input.nextInt();
        total = factorial(n);
        System.out.println("El factorial de " + n + " es: " + total);

    }
    public static int factorial(int n) {
        int acu = 1;
        while (n > 0) {
            acu = acu * n;
            n--;
        }
        return acu;
    }
}
