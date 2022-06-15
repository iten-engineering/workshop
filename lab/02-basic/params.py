
def f1(number, count=10, divider=2):
    return number * count / divider

res = f1(5, divider=1)
print(res)

# Entpacken positonalen Argumenten
def f2(x,y,z):
    print(x,y,z)

params = [10,20,30]
f2(params[0], params[1], params[2])
f2(*params)


# Entpacken Keyword Argumenten
def f3(x=1,y=2,z=3):
    print(x,y,z)

d = {'x': 10, 'z':30, 'y':20}
f3(**d)


