

def maximum(numbers):
    max_value = None
    for num in numbers:
        if (max_value is None or num > max_value):
            max_value = num
    return max_value


numbers = [55, 4, 92, -1]
max_value = maximum(numbers)
print('Maximum value:', max_value)

print('Maximum value:', maximum([1,2,3]))


