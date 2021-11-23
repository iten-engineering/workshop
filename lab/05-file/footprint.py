import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

file_name = "./lab/05-file/footprint.csv"
df = pd.read_csv(file_name)

print("Ausgabe Data Frame:")
# print(df)

print("Ausgabe Spalte Country:")
# print(df['Country'])

# Filter Switzerland
df_ch = df.loc[ df['Country'] == 'Switzerland' ]
print(df_ch)

x = df_ch.columns.values.tolist()[1:]
# print(x)

y = df_ch.values.tolist()[0][1:]
# print(y)

plt.figure()
plt.title("Global Footprint Switzerland")
plt.ylabel("Number of Earth")
plt.plot(x, y)
plt.xticks(np.arange(0, len(x), 5) )
plt.show()
