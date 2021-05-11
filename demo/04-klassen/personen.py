
class Person:
    def __init__(self, firstname, lastname):
        self.firstname = firstname
        self.lastname = lastname

    def name(self):
        return self.firstname + " " + self.lastname

    def print(self):
        print(self.name())        


class Student(Person):
    def __init__(self, firstname, lastname, id):
        super().__init__(firstname, lastname)  
        self.id = id

    def print(self):
        print( self.name(), self.id )

if __name__ == "__main__":
    persons = []
    persons.append( Person("Peter", "Pan") )
    persons.append( Student("Pipi", "Langstrumpf", 1) )

    for p in persons:
        p.print()


