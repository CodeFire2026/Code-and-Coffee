package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        // Productos y orden creados en clase
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        // Tarea: crear 10 productos mas
        Producto producto3 = new Producto("Remera", 7500.00);
        Producto producto4 = new Producto("Buzo", 18000.00);
        Producto producto5 = new Producto("Zapatillas", 42000.00);
        Producto producto6 = new Producto("Gorra", 6500.00);
        Producto producto7 = new Producto("Medias", 3500.00);
        Producto producto8 = new Producto("Short", 8500.00);
        Producto producto9 = new Producto("Camisa", 14500.00);
        Producto producto10 = new Producto("Cinturon", 5500.00);
        Producto producto11 = new Producto("Mochila", 25000.00);
        Producto producto12 = new Producto("Bufanda", 4800.00);

        // Tarea: crear 2 ordenes mas
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.mostrarOrden();

        Orden orden3 = new Orden();
        orden3.agregarProducto(producto8);
        orden3.agregarProducto(producto9);
        orden3.agregarProducto(producto10);
        orden3.agregarProducto(producto11);
        orden3.agregarProducto(producto12);
        orden3.mostrarOrden();
    }
}
