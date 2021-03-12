import unittest
from MathUtil import MathUtil

class MathUtilTest(unittest.TestCase):

    def test_max(self):
        # Test 1
        expected = 20
        actual = MathUtil.max(5, 12, 20)
        self.assertEqual(expected, actual)
        # Test 2 
        self.assertEqual(49, MathUtil.max(3,14,49))

    def test_min(self):
        # Test 1
        expected = 5
        actual = MathUtil.min(5, 12, 20)
        self.assertEqual(expected, actual)
        # Test 2 
        self.assertEqual(3, MathUtil.min(3,14,49))

if __name__ == '__main__':
    unittest.main()

