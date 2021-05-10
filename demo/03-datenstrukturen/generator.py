

def cityGenerator():
    cities = ["Aarau", "Bern",  "Genf", "Lausanne", "Zürich"]
    for city in cities:
        yield city

cg = cityGenerator()
while (True):
    try:
        city = next(cg)
        print(city) 
    except StopIteration as e:
        break    

for city in cityGenerator():
   print(city)        
