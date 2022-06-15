
# for x in range(0,11,2):
#    print(x)


x = 33
lotto = [7,15,9,33,39,42,9]
for i,n in enumerate(lotto):
    if n == x:
        continue
    print(i, n)


print("Len = ", len(lotto))   
print(lotto[0]) 
print(lotto[6]) 
