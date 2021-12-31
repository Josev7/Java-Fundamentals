package Practico04;

public class EjerciciosArreglos09 {
    public static void main(String [] args) {
        boolean [] arregloBooleano = new boolean[9];
        arregloBooleano[0] = true;
        arregloBooleano[1] = true;
        arregloBooleano[2] = true;
        arregloBooleano[3] = true;
        arregloBooleano[4] = true;
        arregloBooleano[5] = true;
        arregloBooleano[6] = false;
        arregloBooleano[7] = false;
        arregloBooleano[8] = true;
        for (int i = 0; i < arregloBooleano.length; i++) {
            System.out.println("El elemento booleano en la posicion " + i + " es: " + arregloBooleano[i]);
        }

    }
}
