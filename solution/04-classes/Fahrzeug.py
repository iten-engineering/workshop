
class Fahrzeug:
    def __init__(self, typ, farbe, baujahr):
        self.typ = typ
        self.farbe = farbe
        self.baujahr = baujahr

    def fahren(self):
        print(self.typ, "fährt...")

    def toString(self):
        return self.typ + " mit Farbe=" + self.farbe + ", Baujahr=" + str(self.baujahr)



class Fahrrad(Fahrzeug):
    def __init__(self, farbe, baujahr, marke):
        super().__init__("Fahrrad", farbe, baujahr)
        self.marke = marke

    def print(self):
        print(self.toString() + ", Marke=" + self.marke)


class PKW(Fahrzeug):
    def __init__(self, farbe, baujahr, sitze):
        super().__init__("PKW", farbe, baujahr)
        self.sitze = sitze

    def print(self):
        print(self.toString() + ", Sitzplätze=" + str(self.sitze))


if __name__ == "__main__":
    f = Fahrrad("silber", 2021, "Scott")
    f.print()
    f.fahren()
    p = PKW("rot", 2007, 4)
    p.print()
    p.fahren()

