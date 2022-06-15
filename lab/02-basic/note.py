
# Validierung Eingabe
eingabe_ok = False
while not eingabe_ok:
    try:
        eingabe = input("Note =")
        note = int(eingabe)
        eingabe_ok = True
    except:
        print("Falsche Eingabe, bitte geben Sie eine Zahl ein.")

# Validierung Wertebereich
if note < 1 or note > 6:
    print("Ungültiger Wert:", note)
    exit(-2)

# Evaluation
if note >= 4:
    print("Test ist bestanden")
else:
    print("Test ist nicht bestanden")

if note == 6:
    print("Note 6: sehr gut")
elif note == 5:
    print("Note 5: gut")    
elif note == 4:
    print("Note 4: genügend")
else:
    print("Note", note, ": ungenügend")        
    print("Note {}: ungenügend".format(note))        

