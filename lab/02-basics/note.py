
input = input("Note = ")

# Validierung ungültige Eingabe
note = None
try:
    note = int(input)
except:
    print("Falsche Aufruf, bitte übergeben sie eine Ganzzahl!")
    exit(-1)

# Validierung Wertebereich
if note < 1 or note > 6:
    print("Falsche Aufruf, bitte übergeben sie eine Ganzahl 1-6")
    exit(-2)

# Bestanden ja/nein
if note >= 4:
    print("Der Test ist bestanden")
else:
    print("Der Test ist nicht bestanden")

# Details
if note == 6:
    print("Note 6: sehr gut")
elif note == 5:
    print("Note 5: gut")
elif note == 4:
    print("Note 4: genügend")
else:
    print("Note ungenügend")


# Variante mit Variable
if note >= 4:
    res = "Der Test ist bestanden: "
else:
    res = "Der Test ist nicht bestanden: "

# Details
if note == 6:
    res = res + "Note 6: sehr gut"
elif note == 5:
    res = res + "Note 5: gut"
elif note == 4:
    res = res + "Note 4: genügend"
else:
    res = res + "Note ungenügend"

print(res)
