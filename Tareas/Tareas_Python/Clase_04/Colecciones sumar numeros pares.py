# Ejercicio de colecciones 1-> ejercicio 4 Sumar numeros pares dentro de un rango
#por ejemplo: suma de numeros pares del 2 al 30
# suma: 240
numeros = list(range(2,31))
suma = 0
for numero in numeros:
    if numero % 2 == 0:
        suma+= numero
print("La suma de los números pares es: ", suma)
