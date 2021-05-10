
i18n = {
    "de" : "Guten morgen",
    "fr" : "Bon jour",
    "it" : "Buongiorno",
    "en" : "Goot morning"
}

name = input("Geben Sie bitte Ihren Namen ein: ")
key  = input("Sprache auswählen [de,fr,it,en]: ")

key = key if key in i18n.keys() else "en"

greeting = i18n[key]
print(greeting)
print(name)