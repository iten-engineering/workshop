
import unittest
from mathutil import MathUtil

class MathUtilTest(unittest.TestCase):

    def test_min(self):
        expected = 1
        actual = MathUtil.min(1,2,3)
        self.assertEqual(expected, actual)    
        self.assertEqual(77, MathUtil.min(100, 77, 120))

    def test_max(self):
        self.assertEqual(3, MathUtil.max(2,3,1))
        self.assertEqual(33, MathUtil.max(2,3,33))
        self.assertEqual(-4, MathUtil.max(-22,-4,-10))


if __name__ == "__main__":
    unittest.main()        