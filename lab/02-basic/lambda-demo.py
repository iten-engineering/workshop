
def inc(x):
    return x + 1

dec = lambda x: x - 1

def apply(numbers, func):   
    for i in range(len(numbers)):
        numbers[i] = func(numbers[i])

numbers = [10,20,30,40]
print(numbers)

apply(numbers, inc)
print(numbers)

apply(numbers, lambda x: x -1)
print(numbers)


