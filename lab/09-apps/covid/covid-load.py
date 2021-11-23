import json
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd

file = "./lab/09-apps/covid/data/COVID19Cases_geoRegion.json"

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
plt.xticks(np.arange(0, len(x)+1, 100))
plt.savefig("covid-verlauf.png")
plt.show()
