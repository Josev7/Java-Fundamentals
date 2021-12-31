package Practico04;

public class EjerciciosArreglos01 {
    public static void main(String [] args) {
        int[] horas = new int[4];
        horas[1] = 12;
        horas[2] = 6;
        horas[3] = 8;
        System.out.println("Horas: ");

        for (int i = 0; i < horas.length; i++) {
            System.out.println("En la posición: " + i + " se encuentra el número:" + horas[i]);
        }

        //EJERCICIO 2
        boolean[] arregloBooleano = new boolean[9];
        arregloBooleano[8] = true;
        arregloBooleano[7] = true;

        for (int pos = 0; pos < arregloBooleano.length; pos++) {
            System.out.println("Los elementos del arreglo son: " + arregloBooleano[pos]);
        }

        //EJERCICIO 3

        int[] arregloDenumeros = new int[100];
        int suma = 0;
        for (int n = 0; n < arregloDenumeros.length; n++) {
            arregloDenumeros[n] = n + 1;
        }

        for (int posi = 0; posi < arregloDenumeros.length; posi++) {
            System.out.println("El arreglo en posición " + posi + " vale: " + arregloDenumeros[posi]);
        }

        for (int n = 0; n < arregloDenumeros.length; n++) {
            suma = suma + arregloDenumeros[n];
        }
        System.out.println("La suma total es: " + suma);

        //Promedio

        System.out.println("EL promedio es: " + suma/arregloDenumeros.length);
    }

}
