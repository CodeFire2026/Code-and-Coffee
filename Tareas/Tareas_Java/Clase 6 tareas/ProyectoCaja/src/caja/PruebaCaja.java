/*
Proyecto caja:
Ejercicio 1: Crear un proyecto según las especificaciones 
mostradas a continuacón
La formula es: volumen = ancho * alto* profundidad
*/
package caja;

public class PruebaCaja {

    public static void main(String[] args) {

        Caja caja = new Caja();

        caja.ancho = 10;
        caja.alto = 5;
        caja.profundidad = 4;

        double volumen = caja.calcularVolumen();

        System.out.println("El volumen de la caja es: " + volumen);
    }
}