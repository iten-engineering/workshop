
def show(date, day, month, year):
    print("Date:", date)
    print("  day   =", day)
    print("  month =", month)
    print("  year  =", year)

dates = ["15.01.2007","3.5.99","14.8.2012"]

"""
for date in dates:
    tokens = date.split(sep=".")
    show(date, tokens[0],tokens[1],tokens[2])
"""

for date in dates:
    idx1 = date.index(".")
    idx2 = date.index(".", idx1+1)
    # split day...
    day = date[0:idx1]
    month = date[idx1+1:idx2]
    year  = date[idx2+1:]
    # show result
    show(date, day, month, year)





