import os

def dirWalker(path, level):
    contents = os.listdir(path)
    dirs = []
    files = []
    for c in contents:
        p = path + "\\" + c
        if (os.path.isdir(p)):
            dirs.append(c)
        if (os.path.isfile(p)):
            files.append(c)
    intend = " " * (level * 4)        
    for file in files:
        print(intend + file)
    for dir in dirs:
        print(intend + dir, ":")
        p = path + "\\" + dir
        dirWalker(p, level + 1)

start_path = "D:\dev\iten-engineering\workshop\demo"
dirWalker(start_path, 0)