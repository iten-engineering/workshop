

path = "lab/05-file/"
infile = "names.txt"
outfile = "names-sorted.txt"

with open(path + infile, "r") as f:
    lines = f.read().splitlines()
    

lines.sort()
print(lines)

with open(path + outfile, "w") as f:
    for line in lines:
        f.write(line)
        f.write('\n')

