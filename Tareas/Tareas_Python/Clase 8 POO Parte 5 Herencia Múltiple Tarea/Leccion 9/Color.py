class Color:
    def __init__(self, color: str):
        self.color = color

    def get_color(self) -> str:
        return self.color

    def set_color(self, color: str) -> None:
        self.color = color

    def __str__(self) -> str:
        return f"Color({self.color})"
