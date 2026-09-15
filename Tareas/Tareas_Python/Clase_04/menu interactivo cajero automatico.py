#Ejercicio 8: menu interactivo cajero autimatico
#hacer un programa que simule un cajero automatico con un saldo inicial de 1000$
#tendra el siguiente menu de interacciones:
#1.ingresar el siguiente menu de opciones:
#2.retirar dinero de la cuenta
#3.mostrar dinero disponible
#4.salir

saldo = 1000
opcion = 0

while opcion != 4:
    print("--- CAJERO AUTOMÁTICO ---")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")

    opcion = int(input("Ingrese una opción: "))
    if opcion == 1:
        dinero = float(input("Ingrese el dinero a depositar: "))
        saldo += dinero
        print("Dinero depositado")
    elif opcion == 2:
        dinero = float(input("Ingrese el dinero a retirar: "))
        if dinero <= saldo:
            saldo -= dinero
            print("Dinero retirado")
        else:
            print("No tiene suficiente dinero")
    elif opcion == 3:
        print("Dinero disponible: $", saldo)
    elif opcion == 4:
        print("Gracias por utilizar el cajero")
    else:
        print("Opción incorrecta")
