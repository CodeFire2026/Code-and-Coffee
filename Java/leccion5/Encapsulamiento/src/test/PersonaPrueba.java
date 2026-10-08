
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona ("Osvaldo" , 57.000, false);
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        //modificar a traves de los metodos
        
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio";//ya no se puede utilizar
        //System.out.println("Nombre es:"+persona1.nombre);//error
        System.out.println("persona1 con su nombre modificado: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());
        
        //Tarea:Crear otro objeto de tipo persona, asignar valores de manera inicial
        //y imprimir, lurgo modificar sus valores y volver a imprimir
        
        Persona persona2 = new Persona("Maria", 80.000, true);
        System.out.println("persona2 su nombre es: " + persona2.getNombre());
        System.out.println("persona2 su sueldo es: " + persona2.getSueldo());
        System.out.println("persona2 su booleano es: " + persona2.isEliminado());
        
        persona2.setNombre("Claudia");
        persona2.setSueldo(95.000);
        persona2.setEliminado(false);
        
        System.out.println("persona2 con su nombre modificado: " + persona2.getNombre()); 
        System.out.println("persona2 con su sueldo modificado: " + persona2.getSueldo());
        System.out.println("persona2 con su booleano modificado: " + persona2.isEliminado());

        System.out.println("persona1 = " + persona1);
    }
}
