
print("Geben Sie bitte einen Integer ein oder 'x' zum beenden der Eingage:")

numbers = []

while True:
    try:
        value = input("Wert =")
        if (value == "x"):
            break
        number = int(value)
        numbers.append(number)    
    except:
        print("Ungültiger Wert:", value, "Geben Sie bitte eine Zahl ein")

print("Eingegebe Werte")
print(numbers)