import json
import matplotlib.pyplot as plt
import numpy as np

file = "./demo/covid/data/COVID19Cases_geoRegion.json"

with open(file) as infile:
    records = json.load(infile)

x = []
y = []
for rec in records:
    if rec["geoRegion"] != "CH":
        continue
    x.append(rec["datum"])    
    y.append(rec["entries"])

# print(x)
# print(y)

plt.figure()
plt.plot(x, y)
plt.xticks( np.arange(0, len(x)+1, 40) )
plt.show()