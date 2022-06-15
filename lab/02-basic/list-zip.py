
names = ["Peter", "Jane", "Fred"]
ages = [31, 35, 4]

for name, age in zip(names, ages):
    print(name, age)

i = 0
while i < len(names):
    print(names[i], ages[i])
    i += 1
