names = ["Peter", "Jane", "Fred"]
ages = [31, 35, 4]

for name, age in zip(names, ages):
    print (name, age)

for i in range(len(names)):
    name = names[i]
    age = ages[i]
    print(name, age)
