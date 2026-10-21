/*
Uso de la palabra Final:
Esta palabra tiene diferentes significados dependiendo de donde se aplique:

-Variables: evita cambiar el valor que almacena la variable.

-Métodos: evita que se modifique la definición o el comportamiento de un método
desde una subclase (hija).

-Clases: evita que se creen clases hijas.

Otras características es que, normalmente, cuando trabajamos con variables, se
combina con el modificador de acceso estático para convertir una variable en una
constante, es decir que no se puede modificar su valor, el ejemplo de esto es la
clase Math en la cual todos sus atributos son de tipo static y final, es por
esto que la variable pi* se conoce como una constante
*/

package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 47873854;
        System.out.println("miDni = " + miDni);
        //miDni = 48923054; NO se puede modificar
        
        //Persona.CONSTANTE_AQUI = 9; NO se puede modificar
        System.out.println("Mi atributo constante es: " + Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); NO se puede asignar una nueva referencia
        persona1.setNombre("Santiago Corales");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Iara");
        System.out.println("persona1 nombre: " + persona1.getNombre());
    }
    
}
