package test;

import domain.Empleado;
import domain.Cliente;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Santiago", 57000.0);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente ("Mateo");
        System.out.println("cliente1 = " + cliente1);
    }
}
