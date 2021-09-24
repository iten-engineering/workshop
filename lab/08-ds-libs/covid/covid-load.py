import json
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd

file = "./data/COVID19Cases_geoRegion.json"

with open(file) as f:
    records = json.load(f)

x = []
y = []

for rec in records:
    if rec["geoRegion"] != "CH":
        continue
    # print(rec["datum"], rec["entries"])
    x.append(rec["datum"])
    y.append(rec["entries"])

plt.figure()
plt.plot(x, y)
plt.xticks(np.arange(0, len(x)+1, 80))
plt.savefig("covid-verlauf.png")
plt.show()


data = {'Product': ['Desktop Computer','Tablet','Printer','Laptop'],
        'Price': [850,200,150,1300]
        }

df = pd.DataFrame(data, columns= ['Product', 'Price'])
print(df)

df.to_csv ("export_dataframe.csv", index = False, header=True)