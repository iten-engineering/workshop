
def add(a, b):
    return a + b

ladd = lambda a, b: a+b

print(add(1,2))
print(ladd(1,2))


def apply(values, f):
    return f(values)

values = [1, 2, 3]
f1 = lambda values: sum(values)
f2 = lambda values: sum(values) / len(values)

print("f1 (sum):", apply(values, f1))
print("f1 (sum):", apply(values, sum))
print("f2 (avg):", apply(values, f2))

