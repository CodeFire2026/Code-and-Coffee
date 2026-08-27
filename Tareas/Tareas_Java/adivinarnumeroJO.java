import javax.swing.JOptionPane;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int numeroSecreto = aleatorio.nextInt(101);
        int numero;
        int intentos = 0;

        JOptionPane.showMessageDialog(null,
                "Adivina el número entre 0 y 100");

        do {
            numero = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese un número:")
            );

            intentos++;

            if (numero < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Es mayor");

            } else if (numero > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Es menor");

            } else {
                JOptionPane.showMessageDialog(null,
                        "¡Correcto!\n" +
                        "El número era: " + numeroSecreto +
                        "\nIntentos: " + intentos);
            }

        } while (numero != numeroSecreto);
    }
}