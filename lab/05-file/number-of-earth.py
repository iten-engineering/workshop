import pandas as pd 
import numpy as np 
import matplotlib.pyplot as plt 

file = "number-of-earth-all.csv"
df = pd.read_csv(file)
# print(df.head(5))

df_ch = df.loc[df['Country'] == "Switzerland"]
# print(df_ch.head(5))

x = df_ch.columns.values.tolist()[1:]
print ("x:", x)

y = df_ch.values.tolist()[0][1:]
print("y:", y)

plt.figure()
plt.title("Global Footprint Switzerland", fontsize=32)
plt.ylabel("Number of Earth", fontsize=12)
plt.plot(x, y)
plt.xticks(np.arange(0, len(x), 5))
plt.show()
