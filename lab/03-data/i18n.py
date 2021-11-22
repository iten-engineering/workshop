
i18n = {
    "de" : "Guten morgen",
    "fr" : "Bon jour",
    "it" : "Buongiorno",
    "en" : "Good morning"
}

name = input("Geben Sie bitte ihren Namen ein: ")
lang = input("Wählen Sie eine Sprache [de, fr, it, en]: ")

lang = lang if lang in i18n.keys() else "en"
greeting = i18n[lang]

print(greeting)
print(name)