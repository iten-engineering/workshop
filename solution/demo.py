

def multiplier(n):
    return lambda a : a * n

double = multiplier(22)
print(double(4))