import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

path = "lab/05-file/"
file = "umsatz.xlsx"

df = pd.read_excel(path + file)
monat = df['Monat'].to_list()
umsatz= df['Umsatz'].to_list()

xpos = np.arange(len(monat))
plt.bar(xpos, umsatz, align='center')
plt.xticks(xpos, monat)

plt.title("Umsätze Januar bis Dezember")
plt.xlabel("Monat")
plt.ylabel("Umsatz")

plt.show()
