import unittest
from math_util import MathUtil

class MathUtilTest(unittest.TestCase):

    def test_max(self):
        expected = 20
        actual = MathUtil.max(5, 12, 20)
        self.assertEqual(expected, actual)

    def test_max_2(self):
        self.assertEqual(49, MathUtil.max(49,3,14))

    def test_min(self):
        self.assertEqual(5, MathUtil.min(5,12,20))
        self.assertEqual(3, MathUtil.min(49,3,14))

if __name__ == '__main__':
    unittest.main()