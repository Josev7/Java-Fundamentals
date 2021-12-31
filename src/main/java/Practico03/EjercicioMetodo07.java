package Practico03;

import java.util.Scanner;

public class EjercicioMetodo07 {
    public static void main(String args[]) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("La suma se hára del 1 hasta el n, ingrese el numero n: ");
        n = input.nextInt();
        sumaHasta(n);
    }

    public static void sumaHasta(int num) {
        int suma = 0;
        int i = 1;
        while (i <= num) {
            suma = suma + i;
            i++;
        }
        System.out.println("La suma desde el 1 al numero ingresado es: " + suma);
    }
}
