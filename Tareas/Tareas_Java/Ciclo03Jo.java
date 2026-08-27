package ciclo03.jo;

import javax.swing.JOptionPane;

public class Ciclo03Jo {

    public static void main(String[] args) {

        int numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un número:")
        );

        while (numero != 0) {

            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "El número " + numero + " es par"
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "El número " + numero + " es impar"
                );
            }

            numero = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese otro número:")
            );
        }

        JOptionPane.showMessageDialog(
                null,
                "El programa ha finalizado al poner el número: " + numero
        );
    }
}