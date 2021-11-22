
print("Geben sie einen Integer ein oder 'x' zum beenden:")

numbers = []

while(True):
    # Wert einlesen
    value = input("value = ")
    # Abbruch Kriterium prüfen
    if value == "x":
        break
    # Verarbeitung
    try:
        number = int(value)
        numbers.append(number)
    except:
        print("Ungültige Nummer:", value)

print("Eingegebene Werte:")
print(numbers)