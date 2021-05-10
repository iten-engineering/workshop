
def show(date, d, m, y):
    print("Date: ", date)
    print("  day   = ", d)
    print("  month = ", m)
    print("  year  = ", y)

dates = ["17.04.1966", "1.3.07", "15.8.2021"]

for date in dates:
    tokens = date.split(".")
    show(date, tokens[0], tokens[1], tokens[2])

for date in dates:
    idx1 = date.index(".")
    idx2 = date.index(".", idx1 + 1)
    d = date[0:idx1]
    m = date[idx1+1:idx2]
    y = date[idx2+1:]
    show(date, d, m, y)
