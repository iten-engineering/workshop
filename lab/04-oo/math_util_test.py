
import unittest
from math_util import MathUtil


class MathUtilTest(unittest.TestCase):

    def test_max(self):
        expected = 3
        actual = MathUtil.max(1,2,3)
        self.assertEqual(expected, actual)

    def test_max2(self):
        self.assertEqual(5, MathUtil.max(-3,5,1))
        self.assertEqual(-3, MathUtil.max(-3,-5,-11))

    def test_min(self):
        self.assertEqual(1, MathUtil.min(3,5,1))
        self.assertEqual(-11, MathUtil.min(-3,-5,-11))

    def test_min_ex(self):
        try:
            MathUtil.min(3,None,1)
        except Exception:
            self.assertTrue(True)
        else:                        
            self.assertTrue(False)


if __name__ == "__main__":
    unittest.main()