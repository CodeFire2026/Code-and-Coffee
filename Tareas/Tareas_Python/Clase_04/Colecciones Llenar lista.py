lista = []

for i in range(1, 51):
    lista.append(i)

for numero in lista:
    if numero < 50:
        print(numero, end="-")
    else:
        print(numero)