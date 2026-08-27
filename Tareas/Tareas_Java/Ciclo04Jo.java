


    package ciclo04.jo;

import javax.swing.JOptionPane;

public class Ciclo04Jo {

    public static void main(String[] args) {

        int numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un número:")
        );

        int contador = 0;

        while (numero >= 0) {

            contador++;

            numero = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese otro número:")
            );
        }

        JOptionPane.showMessageDialog(
                null,
                "Los números ingresados son: " + contador
        );

        JOptionPane.showMessageDialog(
                null,
                "El programa se ha terminado al ingresar un número negativo."
        );
    }
}