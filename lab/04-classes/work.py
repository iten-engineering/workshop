import math

class Kreis:
    def __init__(self, radius):
        self.radius = radius

    def get_umfang(self):
        umfang= 2* math.pi*self.radius
        return umfang
    
    def get_flaeche(self):
        flaeche = math.pi*self.radius**2
        return flaeche

    def show(self):
        print("Kreis mit Radius", self.radius)
        print ("Umfang =", self.get_umfang())
        print ("Fläche =", self.get_flaeche())
    

k = Kreis(3)
k.show()

print(k)