package Practico02;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String args[]) {
        int nota = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("CALIFICACION DEL 0 AL 100.");
        System.out.println("Ingrese la nota del alumno: ");
        nota = input.nextInt();

        if (nota >=0 && nota <= 59) {
            System.out.println("El alumno está eliminado");
        }
        if (nota >= 60 && nota <= 79) {
            System.out.println("El alumno esta aprobado");
        }
        if (nota >= 80 && nota <= 100) {
            System.out.println("El alumno está aprobado con nota excelente!");
        }
        if (nota < 0 || nota > 100) {
            System.out.println("La nota que ingresó está fuera de rango");
        }

        }

    }

