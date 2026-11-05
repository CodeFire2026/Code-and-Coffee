let persona1 = {
    nombre : "Carlos",
    apellido : "Gil",
    email : "cgil@gmail.com",
    edad : 28,
    idioma : 'ES',
    get lang(){
        return this.idioma.toUpperCase(); // Convierte las minusculas a mayusculas
    },
    set lang(Lang){
        this.idioma = Lang.toUpperCase();
    },
    nombreCompleto: function(){ //Metodo o funcion en javascript
        return this.nombre + " " + this.apellido;
    },
    get nombreEdad(){ // Este es el metodo get
        return this.nombre +', Edad: '+this.edad;
    }
}

console.log ('Comenzamos a utilizar el metodo get');
console.log(persona1.nombreEdad);

console.log('Comenzamos con el metodo get y set para idiomas');
persona1.lang = 'en';
console.log(persona1.lang);

function Persona3(nombre, apellido, email){ //Constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function (){
        return this.nombre+' '+this.apellido;
    }
}
let padre = new Persona3('Leo', 'Lopez','lopezl@gmail.com');
padre.nombre = 'Luis'; // modificamos el nombre
padre.telefono = '5492618282821' // Una propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto()); // Utilizamos la funcion
let madre = new Persona3('Laura', 'Contrera', 'contreral@gmail.com');
console.log(madre);
console.log(madre.telefono) // La propiedad no esta definida
console.log(madre.nombreCompleto());

//Diferentes formas de crear objetos
// Caso Objeto 1
let miObjeto1 = new Object(); // Esta es una opcion formal
// Caso Objeto 2
let miObjeto2 = {} //Esta opcion es breve y recomendada

//Caso String 1
let miCadena1 = new String('Hola'); //Sintaxis formal
//Caso String 2
let miCadena2 = 'Holas'; // Esta es la sintaxis simplñificada y recomendada

// Caso con numeros 1
let miNumero1 = new Number(505); // Es formal no recomendable
// Caso con numeros 2
let miNumero2 = 1; // Sintaxis recomendada

// Caso Boolean 1
let miBoolean1 = new Boolean(false); // Formal
// Caso Boleean 2
let miBoolean2 = false; // Sintaxis recomendada

// Caso arreglos 1
let miArreglo1 = new Array(); // Formal
// Caso arreglos 2
let miArreglo2 = []; // Sintaxis recomendada

// Caso Function 1
let miFuncion1 = new function(){}; // Despues de new todo es considerado un objeto
// Caso Function 2
let miFuncion2 = function(){}; // Notacion simplificada y recomendada

// Uso de prototype
Persona3.prototype.telefono = '5492615654328';
console.log(padre);
console.log(madre.telefono);

// Uso de call
let persona4 = {
    nombre : 'Juan',
    apellido : 'Perez',
    nombreCompleto2: function(titulo,telefono){
        return titulo+' '+this.nombre +' '+this.apellido+' '+telefono;
        //return this.nombre+' '+this.apellido;
    }
}

let persona5 ={
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic', '5492618654923'));
console.log(persona4.nombreCompleto2.call(persona5,'Ing','5492618787564'));

//Metodo Apply
let arreglo = ['Ing', '5492618654239'];
console.log(persona4.nombreCompleto2.apply(persona5,arreglo));