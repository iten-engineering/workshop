
def max(x, y, z=None):
    if z==None:
        return x if x > y else y
    if x > y and x > z:
        return x
    elif y > z:
        return y
    return z        

def max2(*args):
    if len(args) == 0:
        return None
    max = args[1]
    for arg in args:
        if arg > max:
            max = arg
    return max


print(max(1,2))    
print(max(1,2,3))    
print(max(1,-2,-3))    

print(max2())    
print(max2(1,2))    
print(max2(1,2,3))    
print(max2(1,-2,-3,99,88))    