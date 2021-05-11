from kreis import Kreis

class Zylinder(Kreis):
    
    def __init__(self, radius, hoehe):
        super().__init__(radius)
        self.hoehe = hoehe

    def volumen(self):
        return self.getFlaeche() * self.hoehe 

    def print(self):
        print("Zylinder mit Radius", self.radius, " und Höhe", self.hoehe)    
        print("- Volumen = ", self.volumen())


k = Kreis(5)
k.print()

z = Zylinder(5, 10)
z.print()