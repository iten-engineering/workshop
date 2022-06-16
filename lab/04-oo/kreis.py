import math

class Kreis:

    def __init__(self, radius):
        self.radius = radius
    
    def umfang(self):
        return 2 * self.radius * math.pi

    def flaeche(self):
        return self.radius * self.radius * math.pi

    def print(self):
        print("Kreis mit Radius", self.radius)
        print("- Umfang = ", self.umfang())
        print("- Fläche =", self.flaeche())


radien = [2,3,7,15]
for radius in radien:
    k = Kreis(radius)
    k.print()


