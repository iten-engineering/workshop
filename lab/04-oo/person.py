

class Person:

    def __init__(self, firstname, lastname):
        self.firstname = firstname
        self.lastname = lastname

    def print(self):
        print(self.firstname, self.lastname) 


class Customer(Person):

    def __init__(self, firstname, lastname, custno):
        super().__init__(firstname, lastname)
        self.custno = custno

    def print(self):
        print(self.firstname, self.lastname, self.custno) 


if __name__ == '__main__':
    print("--- invoke person.py ---")

    p1 = Person("Lara", "Croft")
    p2 = Customer("Mike", "Müller", 4711)

    p1.print()
    p2.print()

    print("__name__ = ",__name__)
