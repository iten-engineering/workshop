articles = {
    11: {'name': 'Bildschirm Belinea X3', 'price': 499.5},
    12: {'name': 'PC Tastatur Swiss German', 'price': 35.0},
    13: {'name': 'Logitec Maus', 'price': 17.25},
    14: {'name': 'USB Hub', 'price': 25.7},
    15: {'name': 'Lautsprecher X66-12', 'price': 87.9} 
}

print("All articles:")
for nr in articles:
    print(articles[nr])

print("Article with lowest price")
article = None
for nr in articles:
    if article == None:
        article = articles[nr]
        continue
    if articles[nr]['price'] < article['price']:
        article = articles[nr]
print(article)

print("Article price with discount")
for nr in articles:
    a = articles[nr]
    a['price'] = a['price'] * 0.8
    print(articles[nr])
    print("{:.4}".format(a['price']))
