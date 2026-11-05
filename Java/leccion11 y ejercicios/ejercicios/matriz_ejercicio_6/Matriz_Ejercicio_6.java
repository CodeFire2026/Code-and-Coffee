package matriz_ejercicio_6;

import java.util.Scanner;

public class Matriz_Ejercicio_6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] A = new int[5][9];
        int[][] B = new int[9][5];

        System.out.println("Ingrese los elementos de la matriz A:");

        // Cargar la primera matriz
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 9; j++) {

                System.out.print("Ingrese un numero: ");
                A[i][j] = teclado.nextInt();
            }
        }

        // Transponer la matriz A en B
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 9; j++) {

                B[j][i] = A[i][j];
            }
        }

        System.out.println("Matriz A:");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 9; j++) {

                System.out.print(A[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println("Matriz B transpuesta:");

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print(B[i][j] + "\t");
            }

            System.out.println();
        }

        teclado.close();
    }
}