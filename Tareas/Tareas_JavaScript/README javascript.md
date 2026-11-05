# Investigación sobre funciones descriptivas en JavaScript

### Grupo: Codee-and-Coffee

Integrantes: 
-Mateo dubrowszczyk 
-Santiago corales 
-Valentin bavaresco 
-Mateo poblete 
-noelia romero 
-juan ignacio Dominguez 
-bruno bustamante 
-Matias vergara 
-patricio vergara




Las funciones en JavaScript permiten organizar instrucciones para realizar diferentes tareas. Para identificarlas fácilmente, se recomienda utilizar nombres descriptivos en inglés, escritos con el estilo Camel Case. Este estilo consiste en escribir varias palabras juntas, comenzando con una letra minúscula y utilizando mayúsculas para separar las siguientes palabras.

Por ejemplo: "calculateTotalSum()" significa calcular la suma total.

Un buen nombre de función debe indicar qué hace, ser fácil de comprender, utilizar palabras adecuadas y permitir que otros desarrolladores entiendan su propósito.

1. Manipulación de datos

Estas funciones permiten modificar, validar, organizar o transformar información dentro de un programa.

1.1. calculateTotalPrice()

Significado: Calcular el precio total.

¿Para qué sirve? Permite calcular el costo total de una compra a partir del precio de un producto y la cantidad comprada.

Ejemplo:

function calculateTotalPrice(precio, cantidad) {
    return precio * cantidad;
}

console.log(calculateTotalPrice(1000, 3));
// Resultado: 3000

Cinco puntos importantes:

1. Es descriptiva porque indica claramente qué hace.
2. Utiliza "calculate", que significa calcular.
3. Especifica que trabaja con el precio total.
4. Su nombre está escrito en inglés natural.
5. Es fácil de comprender para otros desarrolladores.

1.2. formatUserInput()

Significado: Dar formato a la entrada del usuario.

¿Para qué sirve? Permite organizar o normalizar los datos que introduce un usuario, por ejemplo, eliminando espacios innecesarios.

Ejemplo:

function formatUserInput(texto) {
    return texto.trim();
}

console.log(formatUserInput("  Hola  "));
// Resultado: "Hola"

Cinco puntos importantes:

1. Indica que trabaja con datos introducidos por el usuario.
2. Utiliza "format", que significa dar formato.
3. Especifica qué información procesa.
4. Emplea palabras en inglés.
5. Su propósito es fácil de reconocer.

1.3. validateEmailAddress()

Significado: Validar una dirección de correo electrónico.

¿Para qué sirve? Permite comprobar si una dirección de correo cumple un formato básico esperado.

Ejemplo:

function validateEmailAddress(email) {
    return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
}

console.log(validateEmailAddress("usuario@gmail.com"));
// Resultado: true

Cinco puntos importantes:

1. Especifica que realiza una validación.
2. Utiliza "validate", que significa validar.
3. Indica que trabaja con direcciones de correo.
4. Está escrita en inglés.
5. Permite identificar fácilmente su función.

Esta comprobación revisa el formato básico, pero no garantiza que el correo exista.

1.4. convertToCamelCase()

Significado: Convertir al formato Camel Case.

¿Para qué sirve? Permite transformar un texto separado por espacios en una cadena con palabras unidas y mayúsculas internas.

Ejemplo:

function convertToCamelCase(texto) {
    return texto
        .toLowerCase()
        .replace(/[^a-zA-Z0-9 ]/g, "")
        .replace(/ (.)/g, (coincidencia, letra) => letra.toUpperCase());
}

console.log(convertToCamelCase("hola mundo"));
// Resultado: "holaMundo"

Cinco puntos importantes:

1. Indica que se realizará una conversión.
2. Utiliza "convert", que significa convertir.
3. Especifica el formato al que se transforman los datos.
4. Utiliza términos conocidos en programación.
5. Es comprensible para otros desarrolladores.

1.5. filterActiveUsers()

Significado: Filtrar usuarios activos.

¿Para qué sirve? Permite seleccionar los usuarios que cumplen la condición de estar activos.

Ejemplo:

function filterActiveUsers(usuarios) {
    return usuarios.filter(usuario => usuario.activo);
}

let usuarios = [
    { nombre: "Ana", activo: true },
    { nombre: "Luis", activo: false }
];

console.log(filterActiveUsers(usuarios));
// Resultado: [{ nombre: "Ana", activo: true }]

Cinco puntos importantes:

1. Describe una acción concreta.
2. Utiliza "filter", que significa filtrar.
3. Especifica que trabaja con usuarios activos.
4. Está escrita en inglés.
5. Su nombre facilita comprender el resultado esperado.

2. Eventos o interacción

Estas funciones permiten responder a acciones del usuario o actualizar elementos de una aplicación.

2.1. handleButtonClick()

Significado: Gestionar el clic de un botón.

¿Para qué sirve? Permite ejecutar instrucciones cuando se produce un clic en un botón.

Ejemplo:

function handleButtonClick() {
    console.log("Se hizo clic en el botón");
}

Cinco puntos importantes:

1. Indica que administra una acción.
2. Utiliza "handle", que significa gestionar o manejar.
3. Especifica que la acción es un clic.
4. Utiliza palabras en inglés.
5. Su nombre describe el evento que atiende.

2.2. onFormSubmit()

Significado: Cuando se envía un formulario.

¿Para qué sirve? Permite identificar o gestionar el envío de los datos de un formulario.

Ejemplo:

function onFormSubmit() {
    console.log("Formulario enviado");
}

Cinco puntos importantes:

1. Indica cuándo ocurre la acción.
2. Utiliza "form", que significa formulario.
3. Especifica que se trata de un envío.
4. Está escrita en inglés.
5. Es fácil de asociar con los formularios.

2.3. toggleDarkMode()

Significado: Alternar el modo oscuro.

¿Para qué sirve? Permite activar o desactivar el modo oscuro de una página o aplicación.

Ejemplo:

function toggleDarkMode() {
    document.body.classList.toggle("dark-mode");
}

Cinco puntos importantes:

1. Indica que cambia un estado.
2. Utiliza "toggle", que significa alternar.
3. Especifica que el cambio corresponde al modo oscuro.
4. Utiliza términos comunes en programación.
5. Permite comprender su propósito sin leer toda la función.

Este ejemplo requiere que exista una clase CSS llamada "dark-mode".

2.4. updateProgressBar()

Significado: Actualizar la barra de progreso.

¿Para qué sirve? Permite modificar la representación visual del avance de una tarea.

Ejemplo:

function updateProgressBar(porcentaje) {
    document.querySelector("#progreso").style.width =
        porcentaje + "%";
}

Cinco puntos importantes:

1. Describe una actualización.
2. Utiliza "update", que significa actualizar.
3. Identifica el elemento que se modificará.
4. Está escrita en inglés.
5. Es fácil de entender para otros programadores.

El ejemplo requiere un elemento HTML con el identificador "progreso".

2.5. initializeApp()

Significado: Inicializar la aplicación.

¿Para qué sirve? Permite ejecutar las instrucciones iniciales necesarias para preparar una aplicación.

Ejemplo:

function initializeApp() {
    console.log("Aplicación iniciada");
}

initializeApp();

Cinco puntos importantes:

1. Describe una tarea inicial.
2. Utiliza "initialize", que significa inicializar.
3. Especifica que prepara la aplicación.
4. Emplea términos habituales en programación.
5. Su nombre comunica claramente su propósito.

3. Operaciones CRUD

CRUD representa cuatro operaciones básicas para trabajar con información: crear, leer o consultar, actualizar y eliminar datos.

3.1. createNewUser()

Significado: Crear un nuevo usuario.

¿Para qué sirve? Permite crear un registro de usuario con los datos proporcionados.

Ejemplo:

function createNewUser(nombre, email) {
    return {
        nombre: nombre,
        email: email
    };
}

console.log(createNewUser("Ana", "ana@gmail.com"));

Cinco puntos importantes:

1. Describe una acción de creación.
2. Utiliza "create", que significa crear.
3. Especifica que se trata de un usuario nuevo.
4. Está escrita en inglés.
5. Facilita reconocer su propósito.

Este ejemplo crea un objeto, pero no lo guarda en una base de datos.

3.2. fetchUserData()

Significado: Obtener los datos del usuario.

¿Para qué sirve? Permite recuperar información de un usuario desde una fuente de datos.

Ejemplo:

function fetchUserData() {
    return { nombre: "Ana", edad: 20 };
}

console.log(fetchUserData());

Cinco puntos importantes:

1. Indica que se recuperará información.
2. Utiliza "fetch", que significa obtener o recuperar.
3. Especifica que trabaja con datos de usuarios.
4. Utiliza inglés.
5. Su nombre facilita comprender su función.

Este ejemplo devuelve datos de muestra; no consulta una base de datos real.

3.3. updateUserProfile()

Significado: Actualizar el perfil del usuario.

¿Para qué sirve? Permite modificar la información asociada al perfil de un usuario.

Ejemplo:

function updateUserProfile(usuario, nuevoNombre) {
    usuario.nombre = nuevoNombre;
    return usuario;
}

let usuario = { nombre: "Ana" };

console.log(updateUserProfile(usuario, "María"));

Cinco puntos importantes:

1. Describe una modificación.
2. Utiliza "update", que significa actualizar.
3. Especifica que se modifica un perfil de usuario.
4. Está escrita en inglés.
5. Es fácil de identificar por su nombre.

3.4. deleteUserAccount()

Significado: Eliminar la cuenta del usuario.

¿Para qué sirve? Representa la operación de eliminar una cuenta de usuario de un sistema.

Ejemplo:

function deleteUserAccount(usuario) {
    usuario.activo = false;
    return usuario;
}

let usuario = { nombre: "Ana", activo: true };

console.log(deleteUserAccount(usuario));

Cinco puntos importantes:

1. Indica una acción de eliminación.
2. Utiliza "delete", que significa eliminar.
3. Especifica que la acción corresponde a una cuenta.
4. Está escrita en inglés.
5. Permite entender rápidamente su objetivo.

Este ejemplo desactiva la cuenta en lugar de borrarla físicamente.

4. Utilidades

Las funciones de utilidad ayudan a realizar tareas generales que pueden utilizarse en diferentes partes de un programa.

4.1. generateRandomId()

Significado: Generar un identificador aleatorio.

¿Para qué sirve? Permite generar un valor que puede utilizarse como identificador de un elemento.

Ejemplo:

function generateRandomId() {
    return Math.random().toString(36).substring(2, 10);
}

console.log(generateRandomId());

Cinco puntos importantes:

1. Describe una generación de datos.
2. Utiliza "generate", que significa generar.
3. Especifica que el resultado será un identificador.
4. Está escrita en inglés.
5. Es fácil de comprender.

Este ejemplo no garantiza identificadores únicos ni es adecuado para usos de seguridad.

4.2. formatCurrency()

Significado: Dar formato a una cantidad de dinero.

¿Para qué sirve? Permite mostrar un número como un importe monetario con una moneda determinada.

Ejemplo:

function formatCurrency(cantidad) {
    return cantidad.toLocaleString("es-AR", {
        style: "currency",
        currency: "ARS"
    });
}

console.log(formatCurrency(1500));

Cinco puntos importantes:

1. Indica que se dará formato a un dato.
2. Utiliza "format", que significa dar formato.
3. Especifica que trabaja con importes monetarios.
4. Utiliza palabras en inglés.
5. Su propósito es claro para otros desarrolladores.

4.3. debounceSearch()

Significado: Retrasar la ejecución de una búsqueda hasta que el usuario deje de escribir durante un tiempo.

¿Para qué sirve? Ayuda a evitar que una búsqueda se ejecute innecesariamente cada vez que se presiona una tecla.

Ejemplo:

function debounceSearch(buscar, demora) {
    let temporizador;

    return function (...argumentos) {
        clearTimeout(temporizador);

        temporizador = setTimeout(() => {
            buscar(...argumentos);
        }, demora);
    };
}

Cinco puntos importantes:

1. Describe una optimización de las búsquedas.
2. Utiliza "debounce", un término técnico habitual.
3. Especifica la acción que se desea optimizar.
4. Combina términos utilizados en programación.
5. Permite identificar su objetivo.

La función devuelve otra función que retrasa la ejecución hasta que transcurre el tiempo indicado sin nuevas llamadas.

4.4. sanitizeInput()

Significado: Limpiar o sanear la entrada de datos.

¿Para qué sirve? Permite normalizar datos de entrada y retirar caracteres o contenido no deseado según las reglas de una aplicación.

Ejemplo:

function sanitizeInput(texto) {
    return texto.trim();
}

console.log(sanitizeInput("  Hola  "));
// Resultado: "Hola"

Cinco puntos importantes:

1. Indica que se procesarán datos de entrada.
2. Utiliza "sanitize", que significa sanear o limpiar.
3. Especifica qué tipo de información procesa.
4. Está escrita en inglés.
5. Su nombre facilita comprender su finalidad.

Este ejemplo solo elimina espacios al principio y al final. Para prevenir ataques, es necesario aplicar medidas de seguridad apropiadas al contexto.
