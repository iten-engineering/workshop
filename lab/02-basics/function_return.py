
# Konventionell (analog andere Programmiersprachen)
def calc(len, width):
    size = 2 * (len + width)
    area = len * width
    res = {
        "size": size,
        "area": area
    }
    return res

res = calc(10, 2)
print(res["size"])
print(res["area"])


# Python multiple retuns
def calc2(len, width):
    size = 2 * (len + width)
    area = len * width
    return size, area

size, area = calc2(7, 9)
print(size)
print(area)

# Zuweisung Listenelemente
eingaben = ["Januar", "500"]
monat, umsatz = eingaben
print(monat)
print(umsatz)
