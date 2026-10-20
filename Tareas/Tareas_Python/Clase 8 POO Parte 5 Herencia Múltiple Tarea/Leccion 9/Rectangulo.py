# rectangulo.py
from Color import Color
from FiguraGeometrica import FiguraGeometrica

class Rectangulo(FiguraGeometrica, Color):

    def __init__(self, alto: float, ancho: float, color: str):
        FiguraGeometrica.__init__(self, alto, ancho)
        Color.__init__(self, color)

    def area(self) -> float:
        return self.get_alto() * self.get_ancho()

    def __str__(self) -> str:
        # Combinamos los string de la figura geométrica y del color
        return f"Rectangulo: [{FiguraGeometrica.__str__(self)}, {Color.__str__(self)}, Area: {self.area()}]"