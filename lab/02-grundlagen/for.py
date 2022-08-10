
from tkinter import N


lotto = [1,4,32,45,21,12,7]

for n in lotto:
    print(n)

n = 7
for i in range(n):          # 0..n-1
    print(i)

for i in range(1,n+1):      # 1..n
    print(i)

list = ["first", "second"]
for i,v in enumerate(list):    
    print(i, v)    

def double(a,b):
    return a*2, b*2

x, y = double(5,10)
print(x, y)    
