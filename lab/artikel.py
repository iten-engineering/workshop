
articles = {
    11: {
        'name': 'Bildschirm Belinea X3', 
        'price': 499.5
        },
    12: {'name': 'PC Tastatur Swiss German', 'price': 35.0},
    13: {'name': 'Logitec Maus', 'price': 17.25},
    14: {'name': 'USB Hub', 'price': 25.7},
    15: {'name': 'Lautsprecher X66-12', 'price': 87.9}
}

print("List all articles:")
for nr in articles:
    print(nr, ":", articles[nr])

print("Show article with lowes price")
article = None          # Alternative: article = articles[11]
for nr in articles:
    if article is None:
        article = articles[nr]
        continue
    print("Artikel gespeichert :", article)    
    print("Artikel Schlaufe    :", articles[nr])
    if articles[nr]["price"] < article["price"]:
        article = articles[nr]
print(article)

print("Give 20% discount")
for nr in articles:
    current_price = articles[nr]["price"]
    new_price = current_price * 0.8
    articles[nr]["price"] = new_price

for nr in articles:
    print(nr, ":", articles[nr])
