
def show(date, day, month, year):
    print("Date:", date)
    print("  day   = ", day)
    print("  month = ", month)
    print("  year  = ", year)

dates = ["17.04.1966", "1.3.07", "15.08.2021"]    

# Lösung mit Split
for date in dates:
    tokens = date.split(".")
    show(date, tokens[0], tokens[1], tokens[2])

# Lösung mit Index uns Slice
for date in dates:
    idx1 = date.index(".")
    idx2 = date.index(".", idx1+1)
    day   = date[0:idx1]
    month = date[idx1+1:idx2]
    year  = date[idx2+1:]
    show(date, day, month, year)