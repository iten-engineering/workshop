import pandas as pd

path = r"D:/dev/workspace/iten-engineering/workshop/lab/05-file/swissvotes/"
file = "DATASET XLSX 22-08-2021.xlsx"

df = pd.read_excel(path + file, sheet_name='DATA')
# print(df.head(5))

df_ehe = df.loc[ df['anr'] == '647' ]
print(df_ehe)

df_votes = df_ehe[['nrja',	'nrnein','sr-pos','srja']]
print("---")
print(df_votes)


