package tareas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos12 {

    // Método que calcula el factorial de un número
    public long calcularFactorial(int numero) {
        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    // Método para ejecutar el programa utilizando Scanner
    public void ejecutarScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.println("El factorial de " + numero + " es: "
                + calcularFactorial(numero));
    }

    // Método para ejecutar el programa utilizando JOptionPane
    public void ejecutarJOptionPane() {
        String entrada = JOptionPane.showInputDialog(
                null,
                "Ingrese un número:"
        );

        int numero = Integer.parseInt(entrada);

        long factorial = calcularFactorial(numero);

        JOptionPane.showMessageDialog(
                null,
                "El factorial de " + numero + " es: " + factorial
        );
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1. Ejecutar con Scanner");
        System.out.println("2. Ejecutar con JOptionPane");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();

        Ciclos12 programa = new Ciclos12();

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