from calculator import add, sub, mul, div

data = input("Calculate: ")
x, op, y = data.split()

map = {"+": add, "-": sub, "*": mul, "/": div}
f = map.get(op)

if f is None:
    print("Unknown operator")
elif f == div and y == "0":
    print("Division by zero")
else:
    res = f(float(x), float(y))
    print(res)

