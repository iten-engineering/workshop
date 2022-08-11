import json

i18n_file = "lab/03-data/i18n-file.json"

with open(i18n_file) as f:
   i18n = json.load(f)

name = input("Geben Sie bitte Ihren Namen ein  : ")
key  = input("Sprachwahl ['de','fr','it','en'] : ")

key = key if key in i18n.keys() else "en"
greeting = i18n[key]

print(greeting)
print(name)
