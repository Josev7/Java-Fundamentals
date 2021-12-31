package Practico04;


public class EjerciciosArreglos10 {
    public static void main(String [] args) {
        int [] array100 = new int[100];
        int suma = 0;
        int promedio = 0;

        for (int i = 0; i < array100.length; i++) {
            array100[i] = i + 1;
        }

        for (int j = 0; j < array100.length; j++) {
            suma = suma + array100[j];
        }

        promedio = suma/array100.length;
        System.out.println("La suma del array es: " + suma + " y el promedio es: " + promedio);
    }
}
