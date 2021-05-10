
values = [7.5, 'Hello', 42, None, 'World', 1.25, 69, 12]

intValues = []
floatValues = []
strValues = []

for value in values:
    if isinstance(value, int):
        intValues.append(value) 
    elif isinstance(value, float):
        floatValues.append(value)
    elif isinstance(value, str):
        strValues.append(value)

print(intValues)
print(floatValues)
print(strValues)
