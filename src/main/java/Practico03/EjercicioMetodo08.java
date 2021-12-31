package Practico03;

import java.util.Scanner;

public class EjercicioMetodo08 {
    public static void main(String args[]) {
        int y = 0;
        int x = 0;
        int z = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese altura del parelogramo: ");
        y = input.nextInt();
        System.out.println("Ingrese ancho del parelogramo: ");
        x = input.nextInt();
        z = areaParalelogramo(y,x);
        System.out.println("El area del paralelogramo es: " + z);

    }

    public static int areaParalelogramo(int alto, int ancho) {
        int area = alto * ancho;
        return area;
    }
}
