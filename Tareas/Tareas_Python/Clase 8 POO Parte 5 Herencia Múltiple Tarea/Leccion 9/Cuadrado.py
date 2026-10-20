from Color import Color
from FiguraGeometrica import FiguraGeometrica

class Cuadrado(FiguraGeometrica, Color):
    def __init__(self, lado: float, color: str):
        # super.__init__(lado)
        FiguraGeometrica.__init__(self, alto=lado,ancho=lado)
        Color.__init__(self, color)

    def calcular_area(self) ->float:
        return self.get_alto() * self.get_ancho()

    def __str__(self) -> str:
        return f"Cuadrado: [{FiguraGeometrica.__str__(self)}, {Color.__str__(self)}, Area: {self.calcular_area()}]"
