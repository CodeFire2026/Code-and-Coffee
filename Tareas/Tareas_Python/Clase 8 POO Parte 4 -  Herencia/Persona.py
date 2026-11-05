class Persona:
    def __init__(self, nombre, edad):
        self.__nombre = nombre
        self.__edad = edad

    def get_nombre(self):
        return self.__nombre
    def set_nombre(self,nombre):
        self.__nombre = nombre
    def get_edad(self):
        return self.__edad
    def set_edad(self,edad):
        self.__edad = edad

    def __str__(self): #Override = Sobreescribir
        return f"Persona: [Nombre: {self.__nombre}, Edad: {self.__edad}]"


class Empleado(Persona): #Esta clase es hija de la clase persona
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self.__sueldo = sueldo

    def get_sueldo(self):
        return self.__sueldo
    def set_sueldo(self,sueldo):
        self.__sueldo = sueldo

    def __str__(self):
        return f"Empleado: [Sueldo: {self.__sueldo}] {super().__str__()}"

empleado1 = Empleado("Santiago",19, 750000)
empleado2 = Empleado("Mateo",19, 800000)

print(empleado1.get_nombre())
print(empleado1.get_edad())
print(empleado1.get_sueldo())
print("----------")
print(empleado2.get_nombre())
print(empleado2.get_edad())
print(empleado2.get_sueldo())