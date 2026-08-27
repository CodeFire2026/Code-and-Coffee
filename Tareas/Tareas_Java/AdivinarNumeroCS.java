import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroSecreto = aleatorio.nextInt(101);
        int numero;
        int intentos = 0;

        System.out.println("Adivina el número entre 0 y 100");

        do {
            System.out.print("Ingrese un número: ");
            numero = entrada.nextInt();
            intentos++;

            if (numero < numeroSecreto) {
                System.out.println("Es mayor");
            } else if (numero > numeroSecreto) {
                System.out.println("Es menor");
            } else {
                System.out.println("¡Correcto!");
                System.out.println("El número era: " + numeroSecreto);
                System.out.println("Cantidad de intentos: " + intentos);
            }

        } while (numero != numeroSecreto);

        entrada.close();
    }
}