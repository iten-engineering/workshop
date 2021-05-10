
def m(x):
    y = 1 + 0.5 * x
    return y

f = lambda x: 1 + 0.5 * x

for x in [-2, -1, 0, 1, 2, 3]:
    y = f(x)
    print("y für x", x, " = ", y)