
print("Geben Sie bitte einen Integer ein oder 'x' um die Eingabe zu beenden:")
values = []

while True:
    try:
        value = input("value = ")
        if value == "x":
            break
        int_value = int(value)
        values.append(int_value)
    except:
        print("Ungültiger wert:", value, "Geben sie bitte einen Integer ein!")

print("Eingegebene Werte:")
print(values)    