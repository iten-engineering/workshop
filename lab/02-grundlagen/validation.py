
print("Geben sie einen Integer Wert ein oder 'x' um die Eingabe zu beenden.")
numbers = []

while(True):
    try:
        value = input("Wert = ")
        if value == 'x':
            break
        n = int(value)
        numbers.append(n)
    except:
        print("Ungültige Eingabe [" + value + "]. Bitte geben Sie einen Integer ein.")

print("Eingegebene Werte:")
print(numbers)