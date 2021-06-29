
class Node:
    def __init__(self, value, parent = None):
        self.value = value
        self.parent = parent
        self.childs = []

    def is_root(self):
        return self.parent == None

    def is_leaf(self):
        return len(self.childs) == 0

    def add_child(self, value):
        child = Node(value, self)
        self.childs.append(child)
        return child

class Testdata:

    @staticmethod
    def build_helloworld():
        root = Node('H')
        
        e = root.add_child('E')
        e.add_child('L')
        e.add_child('L')
        e.add_child('O')
        
        w = root.add_child('W')
        w.add_child('O')
        w.add_child('R').add_child('L')

        root.add_child('D')

        return root

class Recursion:
    def run(self, root):
        self._visit(root)

    def _visit(self, node):
        print(node.value, end="")
        for child in node.childs:
            self._visit(child)

class Traverse:
    def run(self, root):
        self._traverse(root)
        
    def _traverse(self, node):
        stack = []
        stack.append(node)
        while len(stack) > 0:
            elem = stack.pop()
            print(elem.value, end="")
            for child in reversed(elem.childs):
                stack.append(child)

hello = Testdata.build_helloworld()

r = Recursion()
r.run(hello)
print("")

t = Traverse()
t.run(hello)