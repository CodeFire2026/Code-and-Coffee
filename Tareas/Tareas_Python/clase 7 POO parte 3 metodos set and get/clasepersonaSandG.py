class Persona:

    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}")

    @property #decorador
    def nombre(self): #metodo getter
        print("estamos utilizando el metodo get")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre): #metodo setter
        print("estamos utilizando el metodo set")
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

persona1 = Persona('Ariel', 'Betancud', 41)
print(persona1.nombre) #Llamamos al metodo getter
persona1.nombre = 'Juan Pedro' #Llamamos el metodo setter
print(persona1.nombre) #otra vez el metodo getter
print(persona1.mostrar_detalles())#llamamos el metodo mostrar detalles

persona2 = Persona('Noelia', 'Romero', 25)
print(persona2.nombre)
persona2.nombre = 'Marisa'
persona2.apellido = 'Gonzales'
persona2.edad = 18
print(persona2.mostrar_detalles())

persona3 = Persona('Mauricio', 'Baena', 29)
print(persona3.nombre)
persona3.nombre = 'Pablo'
persona3.apellido = 'Manzano'
persona3.edad = 27
print(persona3.mostrar_detalles())

persona4 = Persona('Gianella', 'Ceballos', 37)
print(persona4.nombre)
persona4.nombre = 'Mariana'
persona4.apellido = 'Perez'
persona4.edad = 15
print(persona4.mostrar_detalles())

