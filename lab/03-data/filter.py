

numbers = list(range(1,21))
print(numbers)

def even(number):
    return True if number % 2 == 0 else False

even_numbers = list(filter(even, numbers))
print(even_numbers)

uneven_numbers = list(filter(lambda n: n % 2 == 1, numbers))
print(uneven_numbers)
