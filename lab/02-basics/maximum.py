
def maximum(v1, v2, v3=None):
    if v3 == None:
        return v1 if v1 > v2 else v2
    if v1 > v2 and v1 > v3:
        return v1
    if v2 > v3:
        return v2
    return v3    


def maximum2(one, two, *args):
    return max(one,two,*args)

print("max(1,2) = ", maximum(1,2))
print("max(2,1) = ", maximum(2,1))
print("max(2,1) = ", maximum(2,1))
print("max(9,-15,-12) =", maximum(9,-15,-12))
print("max(9, 15,-12) = ", maximum(9,15,-12))
print("max(9,-15, 12) = ", maximum(9,-15,12))

print(maximum(1,2,3))
print(maximum2(1,2,3))
print(maximum2(1,2))
