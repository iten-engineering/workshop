
input = input("Note = ")

# Validierung Eingabe
note = None
try:
    note = int(input)
except:
    print("Falsche Eingabe, bitte geben sie eine Zahl ein.")
    exit(-1)

# Validierung Zahlenbereich 1..6
if note < 1 or note > 6:
    print("Falsche Eingabe, bitte geben Sie einen Wert von 1..6 ein.")
    exit(-2)


# Ausgabe
print(note)

if note >=4:
    print("Test bestanden")
else:
    print("Test leider nicht bestanden")    

if note == 6:
    print("sehr gut")
elif note == 5:
    print("gut")
elif note == 4:
    print("genugend")
else:
    print("ungenügend")
