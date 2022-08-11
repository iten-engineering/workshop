import csv

in_file = "lab/05-file/books.txt"
out_file = "lab/05-file/books.csv"

with open(in_file, "r") as f:
    lines = f.read().splitlines()

books = []
book = []
for line in lines:
    if line.strip() == "":
        new_section = True
    else:
        new_section = False
    if not new_section:
        book.append(line)
    else:
        books.append(book)
        book = []    

with open(out_file, "w") as f:
    writer = csv.writer(f)
    writer.writerows(books)
