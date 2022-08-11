
import math

class Circle:

    def __init__(self, radius):
        self.radius = radius
    
    def perimeter(self):
        return 2 * self.radius * math.pi

    def area(self):
        return self.radius * self.radius * math.pi
    
    def print(self):
        print("Kreis mit Radius:", self.radius)
        print("- Umfang =", self.perimeter())
        print("- Fläche =", self.area())


if __name__ == "__main__":
    rlist = [1, 3, 5.5, 7.2]
    for r in rlist:
        circle = Circle(r)
        circle.print()