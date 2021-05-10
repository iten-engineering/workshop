numbers = list ( range(1,21) )
print(numbers)

evenNumbers = []

def even(number):
    return True if (number % 2) == 0 else False

def odd(number):
    return not even(number)

oddNumbers = list( filter(odd, numbers) )
print(oddNumbers)

for n in numbers:
    if even(n):
        evenNumbers.append(n)
print(evenNumbers)