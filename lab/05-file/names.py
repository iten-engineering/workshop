
path = r"D:\dev\workspace\iten-engineering\workshop\lab\05-file"
file = r"\names.txt"

with open(path + file, "r") as f:
    lines = f.read().splitlines()

lines.sort()

out_file = r"\names-sorted.txt"
with open(path + out_file, "w") as f:
    for line in lines:
        f.write(line)
        f.write("\n")

