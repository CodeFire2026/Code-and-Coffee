from Color import Color

class FiguraGeometrica:

    def __init__(self, alto: float, ancho: float):
        self.alto = alto
        self.ancho = ancho

    def get_alto(self) -> float:
        return self.alto

    def set_alto(self, alto: float) -> None:
        self.alto = alto

    def get_ancho(self) -> float:
        return self.ancho

    def set_ancho(self, ancho: float) -> None:
        self.ancho = ancho

    def __str__(self) -> str:
        return f"FiguraGeometrica(alto={self.alto}, ancho={self.ancho})"