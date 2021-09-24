import json

file = "./data/COVID19Cases_geoRegion.json"

with open(file) as f:
    records = json.load(f)

print(records)    