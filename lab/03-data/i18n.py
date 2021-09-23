
i18n = {
    "de" : "Guten morgen",
    "fr" : "Bon jour",
    "it" : "Buongiorno",
    "en" : "Good morning"
}

name = input("Geben Sie bitte Ihren Namen ein:")
key  = input("Wälen sie die Sprache [de, fr, it, en]:")

key = key if key in i18n.keys() else "en"

greeting = i18n[key] # Alternative: i18n.get(key)
print(greeting)
print(name)