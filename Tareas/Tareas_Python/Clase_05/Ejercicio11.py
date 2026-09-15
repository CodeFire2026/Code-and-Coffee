# Ejercicio 11: Agenda telefónica

agenda = {}

while True:
    print("AGENDA TELEFÓNICA")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")

    opcion = input("Ingrese una opción: ")

    if opcion == "1":
        nombre = input("Ingrese el nombre : ")
        telefono = input("Ingrese el teléfono: ")

        agenda[nombre] = telefono
        print("Contacto guardado")

    elif opcion == "2":
        nombre = input("Que contacto quiere borrar : ")

        if nombre in agenda:
            del agenda[nombre]
            print("Contacto borrado")

    elif opcion == "3":
        if len(agenda) == 0:
            print("No hay contactos")
        else:
            print("CONTACTOS")
            for nombre, telefono in agenda.items():
                print(nombre, ":", telefono)

    elif opcion == "4":
        print("Salir")
        break

    else:
        print("Opción incorrecta.")