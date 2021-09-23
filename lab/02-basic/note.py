#  Wert einlesen
value = input("Geben sie eine Note [1-6] ein: ")

# Konvertierung Eingabe
try:
    note = int(value)
except:    
    print("Falsche Eingabe, Wert ist kein Integer")
    exit(-1)

# Validierung
if note < 1 or note > 6:
    print("Falsche Eingabe, der Wert muss zwischen 1..6 sein") 
    exit(-2)

# Ausgaben
if note >= 4:
    print("Der Test ist bestanden")
else:
    print("Der Test ist nicht bestanden")

if note == 6:
    print("Note 6: sehr gut")
elif note == 5:
    print("Note 5: gut")
elif note == 4:
    print("Note 4: genügend")
else:
    print("ungenügend")