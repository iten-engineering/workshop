
i18n = {
    "de" : "Guten morgen",
    "fr" : "Bon jour",
    "it" : "Buongiorno",
    "en" : "Goot morning"
}

name = input("Geben Sie bitte Ihren Namen ein: ")
# key  = input("Sprache auswählen [de,fr,it,en]: ")

validation = False
while validation == False:
    key  = input("Sprache auswählen [de,fr,it,en]: ")
    validation = True if key in i18n.keys() else False


greeting = i18n[key]
print(greeting)
print(name)