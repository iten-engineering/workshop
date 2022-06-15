
f = lambda x: 0.5 * x + 1

for x in [-3,-2,-1,0,1,2,3]:
    y = f(x)
    print("x =", x, "y =", y)

print("Range:")
for x in range(-3,4):
    y = f(x)
    print("x =", x, "y =", y)
