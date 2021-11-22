import pandas as pd

df = pd.read_excel('lab/05-file/umsatz.xlsx') 
print(df)

for row in df.iterrows():
    # print(row)
    print(row['Monat'], row['Umsatz'])