
class Node:
    def __init__(self, value, parent=None):
        self.parent = parent    # type Node
        self.value = value      # type str
        self.childs = []        # list of type Node

    def is_root(self):
        return self.parent is None

    def is_leaf(self):
        return len(self.childs) == 0

    def add_child(self, value):
        child = Node(value, self)
        self.childs.append(child)
        return child    

class Testdata:

    @staticmethod
    def build_hello_world():
        root = Node("H")
        
        e = root.add_child("E")
        e.add_child("L")
        e.add_child("L")
        e.add_child("O")   

        w = root.add_child("W")
        w.add_child("O")
        w.add_child("R").add_child("L")

        root.add_child("D")
        return root


root = Testdata.build_hello_world()

def visit(node):
    print(node.value)
    for child in node.childs:
        visit(child)

print("Ausgabe:")
visit(root)




