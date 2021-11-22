
# Positional Arguments
def f(name, start, end):
    print(name, ": range =", start, "-", end)

test2 = ["Test 2", 1, 200]
test3 = ["Test 3", 1, 300]

f("Test 1", 1, 100)
f(*test2)               # Entpacken der Liste auf die drei Argumente
f(*test3)

# Keyword Arguments
def fk(name="Test", start=1, end=100):
    print(name, ": range =", start, "-", end)

test4 = {
    "name" : "Test 4",
    "start": 1,
    "end" : 400
}

print("Keyword Arguments")
fk()
fk(end=300)
fk(**test4)


# Variable Anzahl Elemente

def show(name, *args):
    print(name)
    for arg in args:
        print("-", arg)

show("Hello")
show("Hello", 1, 2, 3, "World")