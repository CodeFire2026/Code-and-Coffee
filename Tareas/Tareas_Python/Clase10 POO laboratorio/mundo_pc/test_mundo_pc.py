from mundo_pc.computadora import Computadora
from mundo_pc.monitor import Monitor
from mundo_pc.orden import Orden
from mundo_pc.raton import Raton
from mundo_pc.teclado import Teclado

teclado1 = Teclado('HP','USB')
monitor1 = Monitor('HP', '24 pulgadas')
raton1 = Raton('HP', 'USB')
computadora1 = Computadora('HP', monitor1, teclado1, raton1)


teclado2 = Teclado('Acer', 'Bluetooth')
monitor2 = Monitor('Acer', '27 pulgadas')
raton2 = Raton('Acer', 'Bluetooth')
computadora2 = Computadora('Acer', monitor2, teclado2, raton2)

teclado3 = Teclado('Lenovo', 'USB')
monitor3 = Monitor('Lenovo', '22 pulgadas')
raton3 = Raton('Lenovo', 'USB')
computadora3 = Computadora('Lenovo', monitor3, teclado3, raton3)


teclado4 = Teclado('Dell', 'Bluetooth')
monitor4 = Monitor('Dell', '24 pulgadas')
raton4 = Raton('Dell', 'Bluetooth')
computadora4 = Computadora('Dell', monitor4, teclado4, raton4)

teclado5 = Teclado('Logitech', 'USB')
monitor5 = Monitor('Samsung', '32 pulgadas')
raton5 = Raton('Logitech', 'Bluetooth')
computadora5 = Computadora('Samsung', monitor5, teclado5, raton5)

computadora6 = Computadora('Noblex', monitor2, teclado3, raton1)
computadora7 = Computadora('Gamer', monitor3, teclado1, raton2)


computadoras1 = {computadora1, computadora2, computadora7, computadora4}
orden1 = Orden(computadoras1)
orden1.agregar_computadora(computadora3)
print(orden1)


computadoras2 = {computadora3, computadora5, computadora6}
orden2 = Orden(computadoras2)
orden2.agregar_computadora(computadora2)
print(orden2)