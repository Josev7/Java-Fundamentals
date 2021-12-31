package Practico04;

import java.util.Scanner;

public class EjerciciosArreglos08 {
    public static void main(String [] args) {
        int [] horasTrabajadas = new int[5];
        int total = 0;

        for (int i = 0; i < horasTrabajadas.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese horas trabajadas el día " + i);
            horasTrabajadas[i] = input.nextInt();
        }
        for (int j = 0; j < horasTrabajadas.length; j++) {
            total = total + horasTrabajadas[j];
        }
        System.out.println("La cantidad de horas que trabajo es: " + total);
    }
}
