def imprimir_descendente(num):
    if num <= 0:
        return

    print(num)
    imprimir_descendente(num - 1)

numero = int(input("Ingrese un numero: "))
imprimir_descendente(numero)