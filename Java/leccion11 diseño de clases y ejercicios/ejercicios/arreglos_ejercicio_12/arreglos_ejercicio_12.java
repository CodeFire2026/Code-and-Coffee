package arreglos_ejercicio_12;

import java.util.Scanner;

public class arreglos_ejercicio_12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = teclado.nextInt();
        }

        System.out.print("Ingrese la posicion a eliminar (0-9): ");
        int posicion = teclado.nextInt();

        if (posicion >= 0 && posicion <= 9) {

            for (int i = posicion; i < 9; i++) {
                numeros[i] = numeros[i + 1];
            }

            System.out.println("Arreglo despues de eliminar:");

            for (int i = 0; i < 9; i++) {
                System.out.println(numeros[i]);
            }

        } else {
            System.out.println("Posicion no valida.");
        }

        teclado.close();
    }
}