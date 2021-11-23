import math

class Kreis:

    def __init__(self, radius):
        self.radius = radius

    def umfang(self):
        return 2 * self.radius * math.pi

    def flaeche(self):
        return math.pi * pow(self.radius, 2)

    def print(self):
        print("Kreis mit Radius: ", self.radius)
        print("- Umfang =", self.umfang())
        print("- Fläche =", self.flaeche())



if __name__ == '__main__':
    radien = [2, 4]
    kreise = []
    for radius in radien:
        kreis = Kreis(radius)
        kreise.append(kreis)
    for kreis in kreise:
        kreis.print()
        kreis.radius
