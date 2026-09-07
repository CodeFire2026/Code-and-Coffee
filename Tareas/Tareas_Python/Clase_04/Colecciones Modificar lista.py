lista = []

for i in range (1,11):
    lista.append(i)

valor = int(input("Ingrese un valor para multiplicar: "))

for i in range(len(lista)):
    lista[i] = lista[i] * valor

print(lista)