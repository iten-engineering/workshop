from Kreis import Kreis

class Zylinder(Kreis):
    
    def __init__(self, radius, hoehe):
        super().__init__(radius)
        self.hoehe = hoehe

    def volumen(self):
        return self.flaeche() * self.hoehe

    def show(self):
        print("Zylinder mit Radius", self.radius, "und Höhe", self.hoehe)        
        print("- Volumen     =", self.volumen())
        print(super().show())

if __name__ == '__main__':
    # k = Kreis(3)
    # k.show()
    z = Zylinder(3,5)
    z.show()
