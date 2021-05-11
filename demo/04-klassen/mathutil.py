
class MathUtil:

    @staticmethod
    def min(a, b, c):
        if a < b and a < c:
            return a
        if b < c:
            return b
        return c    

    @staticmethod
    def max(a, b, c):
        if a > b and a > c:
            return a
        if b > c:
            return b
        return c   


