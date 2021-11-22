# -------------------------------------------------------------------------------------------------
# Excel Beispiel mit Pandas und Matplotlib
#
# Referenzen:
# - https://www.journaldev.com/33306/pandas-read_excel-reading-excel-file-in-python
# - https://pythonspot.com/matplotlib-bar-chart/ 
# -------------------------------------------------------------------------------------------------

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

df = pd.read_excel('lab/05-file/umsatz.xlsx') 
print(df)

monat = df['Monat'].tolist()
umsatz= df['Umsatz'].tolist()

print(monat)
print(umsatz)

xpos = np.arange(len(monat))
plt.bar(xpos, umsatz, align='center', alpha=0.5)
plt.xticks(xpos, monat)

plt.title('Umsätze Januar bis Dezember')
plt.xlabel('Monat')
plt.ylabel('Umsatz')

plt.show()