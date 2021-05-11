
import unittest
from mathutil import MathUtil

class MathUtilTest(unittest.TestCase):

    def test_min(self):
        expected = 5
        actual = MathUtil.min(5, 12, 20)
        self.assertEqual(expected, actual)

    def test_min2(self):
        self.assertEqual(3, MathUtil.min(49, 3, 14))

    def test_max(self):
        self.assertEqual(49, MathUtil.max(49, 3, 14))

    def test_max2(self):
        self.assertEqual(300, MathUtil.max(49, 300, 14))


if __name__ == "__main__":
    unittest.main()