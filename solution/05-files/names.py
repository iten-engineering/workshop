
path = "d:/dev/iten-engineering/workshop/solution/05-files/"
inFile = path + "names.txt"
outFile = path + "names-sorted.txt"

# read file
with open(inFile, "r", encoding="UTF-8") as f:
    lineStr = f.read()

lines = lineStr.splitlines()

# sort names
lines.sort()
print(lines)

# write file
with open(outFile, "w", encoding="UTF-16") as f:
    for line in lines:
        f.write(line)
        f.write("\n")
