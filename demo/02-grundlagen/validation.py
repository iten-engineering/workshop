
numbers = []

while (True):
    value = input("Value = ")
    print(value)
    if value == "x":
        break
    try:
        number = int(value)
        if number > 50:
            raise Exception("Zahl zu gross")    
        numbers.append(number)
    except Exception as e:
        print(str(e))    

print("Eingegebene Werte:")
print(numbers)