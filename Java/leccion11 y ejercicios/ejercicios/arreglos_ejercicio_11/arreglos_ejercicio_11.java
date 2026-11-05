package arreglos_ejercicio_11;

import java.util.Scanner;

public class arreglos_ejercicio_11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Ingrese 5 numeros ordenados de menor a mayor:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Numero: ");
            numeros[i] = teclado.nextInt();
        }

        System.out.print("Ingrese el numero N: ");
        int N = teclado.nextInt();

        int posicion = 0;

        while (posicion < 5 && numeros[posicion] <= N) {
            posicion++;
        }

        for (int i = 5; i > posicion; i--) {
            numeros[i] = numeros[i - 1];
        }

        numeros[posicion] = N;

        System.out.println("Arreglo ordenado:");

        for (int i = 0; i < 6; i++) {
            System.out.println(numeros[i]);
        }

        teclado.close();
    }
}