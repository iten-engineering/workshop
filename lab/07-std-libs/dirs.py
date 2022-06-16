import os

def dir_walker(path, level):
    content = os.listdir(path)
    files = [name for name in content if os.path.isfile(path + name)]
    dirs  = [name for name in content if os.path.isdir(path + name)]
    intend = " " * (level * 2)
    for file in files:
        print(intend + file)
    for dir in dirs:
        print(intend + dir)
        dir_walker(path + dir + "/", level + 1)

start_path = "D:/dev/workspace/iten-engineering/workshop/lab/"
dir_walker(start_path, 0)