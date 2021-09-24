
class Fahrzeug:
    def __init__(self, typ, farbe, baujahr):
        self.typ = typ
        self.farbe = farbe
        self.baujahr = baujahr

    def fahren(self):
        print(self.typ, "fährt...")

    def print(self):
        print( self.to_string() )

    def to_string(self):
        return self.typ + ": farbe = " + self.farbe + ", baujahr = " + self.baujahr

class Fahrrad(Fahrzeug):
    def __init__(self, farbe, baujahr, marke):
        super().__init__("Fahrrad", farbe, baujahr)
        self.marke = marke

    def print(self):
        print(self.to_string() + ", marke = " + self.marke)


class PKW(Fahrzeug):
    def __init__(self, farbe, baujahr, sitze):
        super().__init__("PKW", farbe, baujahr)
        self.sitze = sitze

    def print(self):
        print(self.to_string() + ", sitze = " + str(self.sitze))


if __name__ == "__main__":
    fahrzeuge = [
        Fahrrad("blau", "2015", "Scott"),
        Fahrrad("rot", "2012", "Thömues"),
        PKW("grün", "2021", "5")
    ]

    for f in fahrzeuge:
        f.print()
        f.fahren()
