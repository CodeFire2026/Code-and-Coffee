package arreglos_ejercicio_14;

import java.util.Scanner;

public class arreglos_ejercicio_14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        System.out.println("Ingrese 10 numeros ordenados para A:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero: ");
            A[i] = teclado.nextInt();
        }

        System.out.println("Ingrese 10 numeros ordenados para B:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero: ");
            B[i] = teclado.nextInt();
        }

        int i = 0;
        int j = 0;
        int k = 0;

        // Fusionar los dos arreglos
        while (i < 10 && j < 10) {

            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }

            k++;
        }

        // Copiar los elementos restantes de A
        while (i < 10) {
            C[k] = A[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes de B
        while (j < 10) {
            C[k] = B[j];
            j++;
            k++;
        }

        System.out.println("Arreglo fusionado y ordenado:");

        for (int x = 0; x < 20; x++) {
            System.out.println(C[x]);
        }

        teclado.close();
    }
}