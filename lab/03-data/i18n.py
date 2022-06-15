

greetings = {
    "de": "Guten morgen",
    "fr": "Bon jour",
    "it": "Buongiorno",
    "en": "Good morning",
}

name = input("Geben Sie einen Namen ein:")
key = input("Wählen Sie eine Sprache [de, fr, it, en]:")

key = key if key in greetings.keys() else "en"

greeting = greetings[key]
print(greeting)
print(name)