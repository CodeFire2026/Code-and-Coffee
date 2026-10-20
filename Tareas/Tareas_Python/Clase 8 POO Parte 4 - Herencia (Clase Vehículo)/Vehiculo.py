class Vehiculo:
    def __init__(self,color,ruedas):
        self.color = color
        self.ruedas = ruedas
    def __str__(self):
        return f"Vehículo: [Color: {self.color}, Ruedas: {self.ruedas}]"

class Auto(Vehiculo):
    def __init__(self, color,ruedas,velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad
    def __str__(self):
        return f"Auto: [Velocidad: {self.velocidad} km/hr] {super().__str__()}"

class Bicicleta(Vehiculo):
    def __init__(self,color,ruedas,tipo):
        super().__init__(color,ruedas)
        self.tipo = tipo
    def __str__(self):
        return f"Bicicleta: [Tipo: {self.tipo}] {super().__str__()}"

vehiculo1 = Vehiculo ("Amarillo", 4)
auto1 = Auto ("Gris",4,120)
bicicleta1 = Bicicleta ("Roja",2,"De montaña")

print(vehiculo1)
print(auto1)
print(bicicleta1)