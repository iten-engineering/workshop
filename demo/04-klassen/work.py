import re

print(" ab c ".strip())

txt = " ab c " 
x = re.sub("\s", "-", txt)
print(x)