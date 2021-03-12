from Kreis import Kreis


class Zylinder(Kreis):
    def __init__(self, radius, hoehe):
        super().__init__(radius)
        self.h