import math


class Kreis:
    def __init__(self, radius):
        self.radius = radius

    def getUmfang(self):
        return 2 * math.pi * self.radius    

    def getFlaeche(self):
        return math.pi * pow(self.radius, 2)

    def print(self):
        print("Kreis mit Radius:", self.radius)
        print("- Umfang  = ", self.getUmfang())
        print("- Flaeche = ", self.getFlaeche())

    def setKreis(self, kreis):
        self.kreis = kreis

radien = [2,3,7.5,15]
kreise = []
for radius in radien:
    k = Kreis(radius)
    kreise.append(k)

for k in kreise:
    k.print()

k1 = Kreis(1)
k1 = Kreis(77)


