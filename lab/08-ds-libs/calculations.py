import numpy as np

# Calculations
a = np.array([20,30,40,50])
b = np.array([10,15,10,75])
c = np.array([17,12,-3,52])

x = a - b
y = x + c

print("x:",x)
print("y:",y)

# 6er Series
r6 = np.array(range(6, 66, 6))
print("r6  :", r6)
print("min :", np.min(r6))
print("max :", np.max(r6))
print("mean:", np.mean(r6))
print("std :", np.std(r6))

# Lotto
lotto = set()

while len(lotto) < 6:
    n = np.random.randint(1,46)
    lotto.add(n)

print("Gewinnzahlen")
print(lotto)