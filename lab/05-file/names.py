
file_name = "./lab/05-file/names.txt"
file_name_out = "./lab/05-file/names-sorted.txt"

with open(file_name, "r") as f:
    lines = f.read().splitlines()

lines.sort()
print(lines)    

with open(file_name_out, "w") as f:
    for line in lines:
        f.write(line)
        f.write("\n")

try:
    f = open(file_name_out, "r")
    print(f.read().splitlines())
finally:
    f.close()
