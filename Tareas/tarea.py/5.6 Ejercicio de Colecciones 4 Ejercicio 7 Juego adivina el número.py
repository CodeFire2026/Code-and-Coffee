import random

secreto = random.randint(1, 100)
usuario = 0
intentos = 0

while usuario != secreto:
    usuario = int(input("Adivina (1-100): "))
    if usuario < secreto: print("Más alto")
    if usuario > secreto: print("Más bajo")
    intentos += 1

print(f"¡Ganaste! Te tomó {intentos} intentos.")

