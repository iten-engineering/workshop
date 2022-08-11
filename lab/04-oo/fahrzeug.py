
class Fahrzeug:
    def __init__(self, typ, farbe, baujahr):
        self.typ = typ
        self.farbe = farbe
        self.baujahr = baujahr

    def fahren(self):
        print(self.typ, "fährt")

    def __str__(self):
        return "{} mit Farbe {}, Baujahr {}".format(self.typ, self.farbe, self.baujahr)    


class Fahrrad(Fahrzeug):
    def __init__(self, farbe, baujahr, marke):
        super().__init__("Fahrrad", farbe, baujahr)
        self.marke = marke

    def __str__(self):
        return super().__str__() + ", Marke {}".format(self.marke)    


class Pkw(Fahrzeug):
    def __init__(self, farbe, baujahr, sitzplaetze):
        super().__init__("Pkw", farbe, baujahr)
        self.sitzplaetze = sitzplaetze

    def __str__(self):
        return super().__str__() + ", Sitzplätze {}".format(self.sitzplaetze)

if __name__ == "__main__":
    f = Fahrrad("rot", 2019, "Scott")
    p = Pkw("schwarz", 2022, 5)

    f.fahren()
    p.fahren()

    print(f)
    print(p)