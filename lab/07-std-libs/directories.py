import os

def dir_walker(path, level):
    contents = os.listdir(path)
    dirs  = []
    files = []
    for content in contents:
        is_dir = os.path.isdir(path + content)        
        if is_dir:
            dirs.append(content)
        else:
            files.append(content)
    intend = " " * (level * 2)
    for file in files:
        print(intend + file)
    for dir in dirs:
        print(intend + dir)
        dir_walker(path + dir + "/", level + 1)    


if __name__ == "__main__":
    start_path = "D:/dev/workspace/iten-engineering/workshop/lab/"
    dir_walker(start_path, 0)    