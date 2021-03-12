
class MathUtil:

    @staticmethod
    def min(a, b, c):
        if (a < b and a < c):
            return a
        elif (b < c):
            return b    
        return c

    @staticmethod 
    def max(a, b, c):
        if (a > b and a > c):
            return a
        elif (b > c):
            return b    
        return c


if __name__ == '__main__':
    print ("Min von 5, 12, 20 =", MathUtil.min(5, 12, 20))
    print ("Max von 5, 12, 20 =", MathUtil.max(5, 12, 20))    