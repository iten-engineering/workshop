
import numpy as np

a = np.array( [20,30,40,50] )
b = np.array( [10,15,10,75] )
c = np.array( [17,12,-3,52] )

x = a - b
y = x + c
print(y)

r6 = np.array( range(6,66,6) )
print(r6)

print( np.min(r6) )
print( np.max(r6) )
print( np.mean(r6) )
print( np.std(r6) )

lotto = set()
while len(lotto) < 6:
    n = np.random.randint(1,46)
    lotto.add(n)

print(lotto)