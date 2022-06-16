
class Person:

    # Static variable
    counter = 0

    # Constructor
    def __init__(self, firstname, lastname):
        # Instance variables
        self.firstname = firstname
        self.lastname = lastname
        Person.counter = Person.counter + 1
        print("create person:", self.firstname, self.lastname, ", total:", Person.counter)

    # Destructor
    def __del__(self):
        Person.counter = Person.counter -1
        print("delete person:", self.firstname, self.lastname, ", total:", Person.counter)

    # Static methode
    @staticmethod
    def printcount():
        print("Total person instances:", Person.counter)

    # Instance methode
    def printname(self):
        print(self.firstname, self.lastname)


class Student(Person):

    # Constructor
    def __init__(self, firstname, lastname, studentId):
       super().__init__(firstname, lastname)
       self.studentId = studentId

    def printname(self):
        print(self.firstname, self.lastname, self.studentId)


# -----------------------------------------------------------------------------
# main
# -----------------------------------------------------------------------------

Person.printcount()

p = Person("Pipi", "Langstrumpf")
p.printname()

s = Student("Peter", "Pan", 12)
s.printname()

print("Personen:")
persons = [p, s, Person("Anna", "Meier"), Student("Greta", "Müller", 99)]
for person in persons:
    person.printname()

# del p1
# value = input("Press enter to continue")

