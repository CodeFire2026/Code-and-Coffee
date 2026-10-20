class Producto{
    static contadorProductos = 0;

    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto(){
        return this._idProducto;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get precio(){
        return this._precio;
    }

    set precio(precio){
        this._precio = precio;
    }

    toString(){
        return `ID: ${this.idProducto} | Nombre: ${this.nombre} | Precio: $${this.precio}`;
    }
}


class Orden{
    static contadorOrdenes = 0;
    static MAX_PRODUCTOS = 5;

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }

    agregarProducto(producto){
        if (this._contadorProductosAgregados < Orden.MAX_PRODUCTOS){
            this._productos.push(producto);
            this._contadorProductosAgregados++;
            console.log("Producto agregado a la orden.");
        }else{
            console.log("No se pueden agregar más de 5 productos.");
        }
    }

    calcularTotal(){
        let total = 0;

        for (let i = 0; i < this._contadorProductosAgregados; i++){
            total += this._productos[i].precio;
        }

        return total;
    }

    mostrarOrden(){
        console.log(`\nOrden N.º ${this._idOrden}`);
        console.log("Productos:");

        for (let i = 0; i < this._contadorProductosAgregados; i++){
            console.log(this._productos[i].toString());
        }

        console.log(`Total de la orden: $${this.calcularTotal()}`);
    }
}


const producto1 = new Producto("Teclado", 15000);
const producto2 = new Producto("Mouse", 8000);
const producto3 = new Producto("Monitor", 120000);
const producto4 = new Producto("Auriculares", 25000);
const producto5 = new Producto("Mousepad", 5000);

//Prueba de la clase Producto
console.log("===== PRUEBA DE PRODUCTOS =====");
console.log(producto1.toString());
console.log(producto2.toString());

//Agregar productos a la orden
console.log("\n===== PRUEBA DE ORDEN =====");

const orden1 = new Orden();

orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden1.agregarProducto(producto4);
orden1.agregarProducto(producto5);

// Mostrar productos y total
orden1.mostrarOrden();

//Comprobar el limite de productos
console.log("\n===== PRUEBA DEL LÍMITE =====");

const producto6 = new Producto("Parlante", 18000);
orden1.agregarProducto(producto6);
