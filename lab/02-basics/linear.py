
f = lambda x: x * 0.5 + 1

def f2(x):
    y = x * 0.5 + 1
    return y

for x in [-3,-2,-1,0,1,2,3]:
    print("x:", x, "y:", f2(x))