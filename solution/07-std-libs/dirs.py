import os


def dir_walker


path = "D:/dev/iten-engineering/workshop/lab/09-apps/bookservice/"
content = os.listdir(path)

print(content)

print(path)
for c in content:
    p = path + c
    isDir  = os.path.isdir(p)
    isFile = os.path.isfile(p)
    print(c, ":", isDir, isFile)
    

