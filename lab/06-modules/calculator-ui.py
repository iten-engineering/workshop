from calculator import add, sub, mul, div

data = input("Calculate: ")
x, op, y = data.split()

map = {"+": add, "-":sub, "/":div, "*":mul, "plus": add}
f = map.get(op)

if f is None:
    print("Unknown operator")
elif op == "/" and float(y) == 0:
    print("Division by zero")
else:
    print(f(float(x),float(y)))