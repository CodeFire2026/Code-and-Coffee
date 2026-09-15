# Ejercicio de Colecciones 2 -> (Ejercicio 2) Operaciones de conjuntos con listas


lista1 = ["boca", "riber", "racing", "independiente", "san lorenzo"]
lista2 = ["boca", "riber", "rosario central", "talleres", "san lorenzo"]

# Equipos que aparecen en ambas listas
lista3 = list(set(lista1) & set(lista2))

# Equipos de la primera lista que no están en la segunda
lista4 = list(set(lista1) - set(lista2))

# Equipos de la segunda lista que no están en la primera
lista5 = list(set(lista2) - set(lista1))

# Equipos que aparecen en ambas listas
lista6 = list(set(lista1) & set(lista2))

print("Equipos en ambas listas:", lista3)
print("Primera lista pero no segunda:", lista4)
print("Segunda lista pero no primera:", lista5)
print("Equipos en ambas listas:", lista6)