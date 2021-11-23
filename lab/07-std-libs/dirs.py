import os

def dir_walker(path, level):
    entries = os.listdir(path)
    dirs = []
    files = []
    indent = " " * (level * 2)
    for e in entries:    
        if os.path.isdir(path + e):
            dirs.append(e)
        if os.path.isfile(path + e):
            files.append(e)
    for file in files:
        print(indent + file)
    for dir in dirs:
        print(indent + dir)
        new_path = path + dir + "/"
        dir_walker(new_path, level + 1)

path = "d:/dev/workspace/iten-engineering/workshop/"
dir_walker(path, 0)




