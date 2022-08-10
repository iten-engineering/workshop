
value = input("Note = ")

try:
    note = int(value)
except Exception as e:
    print("Falsche Eingabe, Wert muss eine Zahl sein")
    print("Fehler:", e)
    exit(-1)

if note < 1 or note > 6:
    print("Falscher Wert, Zahl im Bereich 1..6 sein.")
    exit(-2)

if note >=4:
    print("Test bestanden")
else:
    print("Test nicht bestanden")

if note == 6:
    print("Note 6: sehr gut")  
elif note == 5:
    print("Note 5: gut")  
elif note == 4:
    print("Note 4: genügend")  
else:
    print("Note ungenügend")

