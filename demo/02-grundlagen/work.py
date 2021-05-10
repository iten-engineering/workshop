
def m1():
    print("Methode A")

def m2():
    print("Methode B")
    raise Exception("Error in B")

def m3():
    print("Methode C")

try:
    m1()
    m2()
    m3()

except:
    print("Fehlerbehandlung")        


print("nächste Verarbeitung")    