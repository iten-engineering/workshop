

def split(test):
    day, month, year = test.split(".")
    print("Date:", test)
    print("  day =", day)
    print("month =", month)
    print(" year =", year)

tests = ["17.04.1966", "1.3.07", "12.2.85"]

for test in tests:
    split(test)
