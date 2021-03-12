import math

class Kreis:
    def __init__(self, radius):
        self.radius = radius

    def show(self):
        print("Kreis mit Radius: ", self.radius)
        print("- Umfang = ", self.umfang())
        print("- Fläche = ", self.flaeche())

    def umfang(self):
        return 2 * math.pi * self.radius    

    def flaeche(self):
        return math.pi * pow(self.radius,2)

    def __del__(self):
       # print("Delete Kreis mit Radius", self.radius)    
       pass


if __name__ == "__main__":
    text = "End of course"

    kreis1 = Kreis(5)
    kreis1.show()
    del kreis1

    kreis2 = Kreis(3.5)
    kreis2.show()

