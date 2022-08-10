
def apply(x, y, func):
    res = func(x,y)
    return res

def add(x, y):
    return x + y   

div = lambda a, b: a / b

print( apply(1,2, add) )
print( apply(1,2, lambda a, b: a+b) )
print( apply(1,2, lambda a, b: a*b) )
print( apply(1,2, div) )