
numbers = []
while True:
    value = input("Value = ")
    if value == "x":
        break
    try:
        i = int(value)
        numbers.append(i)
    except:
        print("Ungültiger Wert:", value)

print("Eingegebene Werte:")
print(numbers)