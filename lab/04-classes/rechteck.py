
class Rechteck:

    def __init__(self, laenge, breite):
        self.laenge = laenge
        self.breite = breite

    def umfang(self):
        return 2 * (self.breite + self.laenge)

    def flaeche(self):
        return self.laenge * self.breite

    def print(self):
        print("Rechteck mit Länge:", self.laenge, "und Breite:", self.breite)
        print("- Umfang =", self.umfang())
        print("- Fläche =", self.flaeche())


if __name__ == '__main__':
    r = Rechteck(3,7)
    r.print()
