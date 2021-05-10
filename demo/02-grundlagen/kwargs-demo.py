

def validate(value, min, max):
    if value >= min and value <=max:
        print("Gültige Zahl:", value)
    else:
        print("Unültige Zahl:", value)


nrRange = {
    "min": 1,
    "max": 45,
}

validate(5, 1, 45)
validate(15, nrRange["min"], nrRange["max"])
validate(47, **nrRange)
validate(12, **nrRange)

