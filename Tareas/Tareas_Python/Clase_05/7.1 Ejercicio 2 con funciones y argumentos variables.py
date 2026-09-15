def multiplicar(*numeros):
    multipicacion = 1

    for numero in numeros:
        multipicacion *= numero

    return multipicacion

print(multiplicar(1,2,3,4,5))
