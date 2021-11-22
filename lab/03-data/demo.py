
words = "cheese, spam, egg, spam, bacon, spam"
sorted_words = sorted(words.split(", "))
sorted_words = ", ".join(sorted_words)
print(sorted_words)


unicode = '\U000000e4'          	# ä (Python 3, wird direkt als Unicode interpretiert)
print(unicode)

unicode2 = u'\U000000e4'
print(unicode2)