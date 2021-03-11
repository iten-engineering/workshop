
names = ["Peter", "Jane", "Fred"]
ages  = [31, 35, 4]

for t in zip(names, ages):
    print(t[1])

for name, age in zip(names, ages):
    print("{} ist {} Jahre alt".format(name, age))

