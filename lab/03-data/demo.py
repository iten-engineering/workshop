

def results():
    return 5, 42

res = results()
print(type(res))
print(res[0], res[1])

x, y = results()
print(x, y)


text = " Hello   World".strip()
print("[" + text + "]")

print("Find:")
text = "xxThis and that"
idx = text.lower().find("th")
print(idx)       		
