
class MathUtil:

    @staticmethod
    def min(a, b, c):
        if (a < b and a < c):
            return a
        elif b < c:
            return b
        return c

    @staticmethod
    def max(a, b, c):
        if (a > b and a > c):
            return a
        elif b > c:
            return b
        return c

if __name__ == "__main__":
    print ("Maximum von 1,2,3:", MathUtil.max(1,2,3))
    print ("Minimum von 1,2,3:", MathUtil.min(1,2,3))
