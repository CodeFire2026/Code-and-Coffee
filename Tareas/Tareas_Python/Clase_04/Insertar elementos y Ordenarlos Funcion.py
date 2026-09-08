numeros = []

while True:
    numero = int(input("Introduce un número (0 para terminar): "))

    if numero == 0:
        break

    numeros.append(numero)

numeros.sort()

print("Números ordenados de menor a mayor:")
print(numeros)
