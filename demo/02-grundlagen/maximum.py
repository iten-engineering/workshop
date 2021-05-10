
def max(a, b, c=None):
    if c == None:
        return a if a > b else b
    if a > b and a > c:
        return a
    if b > c:
        return b
    return c        

print(max(10,2))
print(max(1,2,3))
print(max(1,3,2))
print(max(3,2,1))