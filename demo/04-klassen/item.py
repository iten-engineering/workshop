
class Item:
    
    def __init__(self, number):
        self.number = number
        print("Create item:", self.number)

def main():
    item = Item(7)

main()

