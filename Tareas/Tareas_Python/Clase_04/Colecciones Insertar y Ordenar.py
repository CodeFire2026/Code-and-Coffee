lista = []
salir = False

while not salir:
    numero = int(input("Ingrese un numero: "))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)
lista.sort() #La lista esta ordenada con esta funcion
print(f'\n Lista ordenada: \n {lista}')