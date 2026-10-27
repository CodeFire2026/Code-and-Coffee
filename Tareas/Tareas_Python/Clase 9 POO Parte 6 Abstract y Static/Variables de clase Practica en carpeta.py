class miclase:
    variable_clase = ("esta es una variable de clase")

    def __init__(self, variable_instancia):
        self.variable_instancia = variable_instancia


print(miclase.variable_clase)
miClase1 = miclase("esta es una variable de instancia")
print(miClase1.variable_instancia)
print(miClase1.variable_clase)
miClase2 = miclase("esta es otra prueba de variable de instancia")
print(miClase2.variable_instancia)
print(miClase2.variable_clase)