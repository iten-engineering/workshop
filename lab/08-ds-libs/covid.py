import json

file = "lab/08-ds-libs/COVID19Cases_geoRegion.json"

with open(file) as f:
    records = json.load(f)

for rec in records:
    print(rec['geoRegion'], rec['datum'], rec['entries'])
