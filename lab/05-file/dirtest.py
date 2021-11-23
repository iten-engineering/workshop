
fn1 = "./lab/05-file/te st/dirtest.txt"  # Filename with Blank
fn2 = r".\lab\05-file\te st\dirtest.txt"  # Filename with Blank

print("Test mit '/':")
with open(fn1, "r") as f:
    lines = f.read().splitlines()
print(lines)

print("Test mit 'r' und '\\':")
with open(fn2, "r") as f:
    lines = f.read().splitlines()
print(lines)