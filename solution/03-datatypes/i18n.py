
i18n = {
    "de" : "Guten morgen",
    "fr" : "Bon jour",
    "it" : "Buongiorno",
    "en" : "Good morning"
}

name = input("Name    = ")
key  = input("Sprache = ")

key = key if key in i18n.keys() else "en"

greeting = i18n[key]
print(greeting, name)