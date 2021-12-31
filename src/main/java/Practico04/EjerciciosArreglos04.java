package Practico04;

public class EjerciciosArreglos04 {
    public static void main(String [] args) {

        boolean [] asientosLibres = new boolean[10];
        for (int i = 0; i <asientosLibres.length; i++) {
            asientosLibres[i] = true;
            System.out.println("Asiento está libre? " + asientosLibres[i]);
        }
    }
}
