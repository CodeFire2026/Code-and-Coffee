"""
crear la clase cubo con los atributos, ancho, alto y profundidad con un metodo
calcular_volumen que tendra la formula:
volumen = ancho * altura * profundidad
que el usuario ingrese los valores.
"""
class Cubo:

    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad

ancho = float(input("Ingrese el ancho: "))
alto = float(input("Ingrese el alto: "))
profundidad = float(input("Ingrese la profundidad: "))

cubo = Cubo(ancho, alto, profundidad)

print("El volumen del cubo es:",cubo.calcular_volumen())
