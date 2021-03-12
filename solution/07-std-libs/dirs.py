import os

def dirWalker(path, level):
    contents = os.listdir(path)
    dirs  = [el for el in contents if os.path.isdir(path + el)]
    files = []
    for content in contents:
        p = path + content
        isFile = os.path.isfile(p)
        if isFile:
            files.append(content)    
    intend = " " * (level * 2)
    for file in files:
        print(intend + file)
    for d in dirs:
        print(intend + d)
        dirWalker(path + d + "/", level + 1)
    
# start
path = "D:/dev/iten-engineering/workshop/lab/09-apps/"
dirWalker(path, 0)    

