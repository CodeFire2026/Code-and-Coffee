let x = 10; // variable de tipo primitiva
console.log (x.length)
console.log('Tipos Primitivos')
//objeto
let persona = {
    nombre : "Carlos",
    apellido : "Gil",
    email : "cgil@gmail.com",
    edad : 30,
    nombreCompleto: function(){ //Metodo o funcion en javascript
        return this.nombre+" "+this.apellido;
    }
}

console.log (persona.nombre);
console.log (persona.apellido);
console.log (persona.email);
console.log (persona.edad);
console.log (persona);
console.log(persona.nombreCompleto());

let persona2 = new Object(); // Debe crear un objeto nuevo en memoria
persona2.nombre = "Juan";
persona2.direccion = "Salada 14";
persona2.telefono = "5492618282821";
console.log (persona2.telefono);
console.log('Creamos un nuevo objeto')
console.log(persona["apellido"]); // Accedemos como si fuera un arreglo

//for in y accedemos al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('cambiamos y eliminamos un error')
persona.apellida = 'Betancud'; // Cambiamos dinamicamente un nvalor del objeto
delete persona.apellida; // Eliminamos el error
console.log(persona);

// Distinta forma de imprimir un objeto
// Numero 1: La mas sencilla: Concatenar cada valor de cada propiedada
console.log('Distinta forma de imprimir un objeto: Forma 1');
console.log(persona.nombre+', '+persona.apellido)

// Numero 2: A travez del ciclo for in
console.log('Distinta forma de imprimir un objeto: Forma 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

// Numero 3: La funcion de Object.Values()
console.log('Distinta forma de imprimir un objeto: Forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);

//Numero 4: utilizaremos el metodo JSON.stringify
console.log('Distinta forma de imprimir un objeto: Forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString)