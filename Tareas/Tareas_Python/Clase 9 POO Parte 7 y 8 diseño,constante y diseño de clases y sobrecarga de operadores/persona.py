class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other):  # Other significa = otro
        return f'{self.nombre} {other.nombre}'

    def __sub__(self, otro):
        return self.edad - otro.edad


persona1 = Persona('Mateo', 19)
persona2 = Persona('Martinez', 3)

# persona1.__add__(persona2) sintaxis interna y automática

print(persona1 + persona2)
print(persona1 - persona2)