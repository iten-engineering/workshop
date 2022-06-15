
age = 10
price = 50    

if age >= 60:
    price = price * 0.8
elif age >= 50:
    price = price * 0.85
elif age >= 40:    
    price = price * 0.90
elif age < 40 and age >= 18: # 18..39
    price = price * 0.95    

print(age, price)