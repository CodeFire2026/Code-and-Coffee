cadena = input("Ingrese una cadena: ")

lista = []

for caracter in cadena:
    if caracter not in lista:
        lista.append(caracter)

print(lista)