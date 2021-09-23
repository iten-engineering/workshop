
numbers = list(range(1,21))
print(numbers)

# filter with loop
even_numbers = []

def even(number):
    return True if (number % 2) == 0 else False

for number in numbers:
    if even(number):
        even_numbers.append(number)

print(even_numbers)        

# filter with filter
odd_numbers = list(filter(lambda number: number % 2 == 1, numbers))
print(odd_numbers)