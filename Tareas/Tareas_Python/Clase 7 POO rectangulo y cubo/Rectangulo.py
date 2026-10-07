"""
    Crear una clase llamada rectangulo, debe tener 2 atributos: altura y base
    el nombre del metodo sera calcular area utilizando la formula:
    area = base * altura. pero la base y la altura deben ser ingresados por
    el usuario y los objetos deben ser tres.
"""
class Rectangulo:

    def __init__(self, altura, base):
        self.altura = altura
        self.base = base
    def calcular_area(self):
        return self.altura * self.base

base1 = float(input("Ingrese la base del rectangulo 1: "))
altura1 = float(input("Ingrese la altura del rectangulo 1: "))
rectangulo1 = Rectangulo(altura1, base1)

base2 = float(input("Ingrese la base del rectangulo 2: "))
altura2 = float(input("Ingrese la altura del rectangulo 2: "))
rectangulo2 = Rectangulo(altura2, base2)

base3 = float(input("Ingrese la base del rectangulo 3: "))
altura3 = float(input("Ingrese la altura del rectangulo 3: "))
rectangulo3 = Rectangulo(altura3, base3)

print("Area del rectangulo 1: ", rectangulo1.calcular_area())
print("area del rectangulo 2: ", rectangulo2.calcular_area())
print("area del rectangulo 3: ", rectangulo3.calcular_area())




