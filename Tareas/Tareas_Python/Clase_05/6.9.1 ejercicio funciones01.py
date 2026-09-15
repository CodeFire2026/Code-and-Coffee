def sumar(*numeros):
    suma = 0

    for numero in numeros:
        suma += numero

    return suma

print(sumar(5, 10, 20))