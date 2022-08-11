
from person import Person, Customer

print("--- invoke person-demo.py ---")


p1 = Person("Lara", "Croft")
p2 = Customer("Mike", "Müller", 4711)

p1.print()
p2.print()

persons = [p1, p2, Customer("Max", "Frisch", 88)]
for p in persons:
    p.print()

