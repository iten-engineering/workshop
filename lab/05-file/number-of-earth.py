import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

path = "lab/05-file/"
file = "number-of-earth-all.csv"

df = pd.read_csv(path + file)
# print(df.head(5))

df_ch = df.loc[ df['Country'] == 'Switzerland' ]
print(df_ch)

# drop column
# df_ch.drop('1964', inplace=True, axis=1)
# print(df_ch)

x = df_ch.columns.values.tolist()[1:]
y = df_ch.values.tolist()[0][1:]            # Erste Zeile, alle Spalten ab Index 1

plt.plot(x, y)
plt.xticks(np.arange(0, len(x), 5))

plt.title("Global Footprint Switzerland")
plt.ylabel("Number of Earth")

plt.show()