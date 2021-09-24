import pandas as pd
import numpy as np
import matplotlib.pyplot as plt 

path = r"D:/dev/workspace/iten-engineering/workshop/lab/05-file/swissvotes/"
file = "DATASET XLSX 22-08-2021.xlsx"

df = pd.read_excel(path + file, sheet_name='DATA')
# print(df.head(5))

df_ehe = df.loc[ df['anr'] == 647 ]
print(df_ehe)

df_votes = df_ehe[['nrja',	'nrnein', 'srja', 'srnein']]
print(df_votes)

names = df_votes.columns.values.tolist()
votes = df_votes.values.tolist()[0]

print(names)
print(votes)

y_pos = np.arange(len(names))
plt.bar(y_pos, votes, align='center', alpha=0.5)
plt.xticks(y_pos, names)
plt.ylabel('Votes')
plt.title('Ehe für alle')
plt.show()
