
numbers = [1,2,3,7,20,99]
x = 7

result = x in numbers
print(result)

articles = {
    7: "Bildschirm",
    9: "Tastatur"
}

print( articles[7])
print( articles[9])

seq = [1,2,3]

if len(seq) == 3: 
    print("sequence is empty")
    print("Ausgabe")

a = 5
b = 3

if a > b:
    x1 = 10
else:
    x1 = 1

x2 = 10 if a > b else 1    

print(x1, x2)
