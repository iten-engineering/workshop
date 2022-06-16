from calculator import add, sub, mul, div

data = input("Calculate: ")

x, op, y = data.split()
# print(x, op, y)

map = {"+":add, "&":add, "-":sub, "*":mul, "/":div}
f = map.get(op)

if f is None:
    print("Operator not supported")
elif op == "/" and y == "0":
    print("Divison by zero")
else:
    print( f(float(x), float(y)) )
