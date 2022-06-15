
def maximum( x, y, z=None):
    list = [x,y]
    if z is not None:
        list.append(z)
    return max(list)

def maximum2( x, y, z=None):
    if z is None:
        return x if x>y else y
    if x > y and x > z:
        return x
    if y > z:
        return y
    return z

print(maximum(1,2))
print(maximum(2,1))
print(maximum(9,-15,z=-12))

print(maximum2(1,2))
print(maximum2(2,1))
print(maximum2(9,-15,z=-12))
                