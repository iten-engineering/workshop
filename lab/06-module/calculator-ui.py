from calculator import add, sub, mul, div

map = {
    "+": add,
    "&": add,
    "-": sub,
    "*": mul,
    "/": div
}

while(True):
    data = input("Calculate: ")

    if data == "exit":
        exit(0)

    tokens = data.split()
    x, op, y = tokens

    f = map.get(op)     

    if f == None:
        print("Unknown operator")
    elif f == div and y == "0":
        print("Division by 0 not allowed")
    else:    
        res = f( float(x), float(y) )
        print(res)
