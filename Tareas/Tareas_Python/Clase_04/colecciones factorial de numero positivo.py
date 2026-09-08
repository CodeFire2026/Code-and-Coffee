# Ejercicio de colecciones 2-> ejercicio 5 Factorial de un numero positivo
numero = int(input("Digite un numero positivo: "))
factorial = 1
for i in range(1,numero+1):
    factorial = factorial * i
print("El factorial de", numero, "es: ", factorial)
