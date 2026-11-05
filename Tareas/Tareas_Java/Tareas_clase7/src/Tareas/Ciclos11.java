package tareas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos11 {

    // Método que calcula el producto de los 10 primeros números impares
    public long calcularProducto() {
        long producto = 1;

        for (int i = 1; i <= 19; i += 2) {
            producto = producto * i;
        }

        return producto;
    }

    // Método para ejecutar el programa utilizando Scanner
    public void ejecutarScanner() {
        System.out.println("\n===== PRODUCTO DE IMPARES =====");
        System.out.println("Los 10 primeros números impares son:");

        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nEl producto es: " + calcularProducto());
    }

    // Método para ejecutar el programa utilizando JOptionPane
    public void ejecutarJOptionPane() {
        String impares = "";

        for (int i = 1; i <= 19; i += 2) {
            impares = impares + i + " ";
        }

        JOptionPane.showMessageDialog(
                null,
                "Los 10 primeros números impares son:\n"
                + impares
                + "\n\nEl producto es: "
                + calcularProducto()
        );
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1. Ejecutar con Scanner");
        System.out.println("2. Ejecutar con JOptionPane");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();

        Ciclos11 programa = new Ciclos11();

        switch (opcion) {
            case 1:
                programa.ejecutarScanner();
                break;

            case 2:
                programa.ejecutarJOptionPane();
                break;

            default:
                System.out.println("Opción inválida.");
        }


    }
}