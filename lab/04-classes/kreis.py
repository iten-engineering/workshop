import math

class Kreis:

    def __init__(self, radius):
        """Der Konstuktor wird aufgerufen um eine Kreisinstanz zu erstellen"""
        self.radius = radius

    def umfang(self):
        return 2 * self.radius * math.pi

    def flaeche(self):
        return pow(self.radius,2) * math.pi

    def print(self):
        print("Kreis mit Radius", self.radius)
        print("- Umfang = ", self.umfang())
        print("- Fläche = ", self.flaeche())


radien = [3.5, -4, 1.8, 9]
for r in radien:
    k = Kreis(r)
    k.radius
    k.print()
