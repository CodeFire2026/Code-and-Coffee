/*Ejercicio 7: pedir numeros hasta que se introduzca uno negativo y calcular 
la media*/
package EjerciciosJava;

import javax.swing.JOptionPane;

public class Ejercicio07JO {
    public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int suma = 0;
        while (numero >= 0){
            JOptionPane.showMessageDialog(null,"El numero " +numero+ " es POSITIVO");
            suma = suma + numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        if (conteo > 0){
            double media = (double)suma/conteo;
            System.out.println("La media es: " +media);
        JOptionPane.showMessageDialog(null,"La media es: "+ media);
        }
    }
}
