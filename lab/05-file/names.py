import os

print("Current working dir:")
print(os.getcwd())

in_file = "lab/05-file/names.txt"
out_file= "lab/05-file/names-sorted.txt"

with open(in_file, "r") as f:
    lines = f.read().splitlines()

# Alternativ
# try:
#     f = open(in_file, "r")
#     lines = f.read().splitlines()
# finally:
#     f.close()

lines.sort()

# Alternativ
# lines = sorted(lines)

with open(out_file, "w") as f:
    for line in lines:
        f.write(line)
        f.write("\n")
