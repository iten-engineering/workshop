
values  = [7.5, 'Hello', 42, None, 'World', 1.25, 69, 12]

int_values = []
float_values = []
str_values = []

for v in values:
    if (type(v) == int):              # Prüfung Type auf Integer
        int_values.append(v)
    elif (type(v) == float):
        float_values.append(v)
    elif (type(v) == str):
        str_values.append(v)

print("values: ", values)
print("- int_values   =", int_values)
print("- float_values =", float_values)
print("- str_values   =", str_values)

