// Array or Arreglos Creation
// let cars = new Array("Ferrari","Renault","BMW"); This is and old way to create an array
const cars = ["Ferrari","Renault","BMW"]; // This is the new way to create an array
console.log(cars)

// We go through an array elements
console.log(cars[0]); // It shows the first element of the array
console.log(cars[2]);

for(let i = 0; i < cars.length; i++){
    console.log(i +" : "+cars[i]);
}

// We modify the array elements
cars[1] = "Lamborghini";
console.log(cars[1]);

// We aggregate new values to the array. Main method.
cars.push("Audi"); // It adds a new element to the end of the array. It´s the main way to add elements to an array
console.log(cars);

// Other ways of adding elements to the array. Second method.
cars[cars.length] = "Citroen"; // It does the same as push function, but it´s the second way to add elements to an array
console.log(cars);

// Third method of adding elements to an array. IT´S NOT RECOMMENDED because it may use too much memory, losing efficiency.
cars[6] = "Renault";
console.log(cars);

// How to ask if it´s an array or an arreglo.
console.log(Array.isArray(cars)); // It shows a boolean value.

console.log(cars instanceof Array); // We ask if the variable cars is an instance of the Array class.