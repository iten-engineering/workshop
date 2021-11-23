
from kreis import Kreis
from rechteck import Rechteck


figuren = []

k = Kreis(22)
figuren.append(k)

r = Rechteck(3,6)
figuren.append(r)


for figur in figuren:
    figur.print()