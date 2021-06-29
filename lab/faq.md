
# Python FAQ

1. Installation offline
   - https://gist.github.com/prateek/525d14823c3df3ee9472
   - https://stackoverflow.com/questions/11091623/how-to-install-packages-offline

2. Increment/decrement alternative to ++/--
   - https://stackoverflow.com/questions/2632677/python-integer-incrementing-with
   - https://stackoverflow.com/questions/1485841/behaviour-of-increment-and-decrement-operators-in-python
   - http://www.norvig.com/python-iaq.html

3. Integer vs. long 
   - https://riptutorial.com/python/example/14305/long-vs--int
   - Python 3
     ```
     import sys
     print(sys.maxsize)
     ```
   - https://stackoverflow.com/questions/2104884/how-does-python-manage-int-and-long   
   - https://www.python.org/dev/peps/pep-0237/ 

4. Performance Lambda vs. Methode
   - There's no difference in calling a lambda versus a function. A lambda is just a function created with a single expression and no name.
   - https://stackoverflow.com/questions/26540885/lambda-is-slower-than-function-call-in-python-why

5. Return type of filter
   - In Python 3, filter, map, zip, etc return an object which is iterable, but not a list (like in Python 2)
   - https://stackoverflow.com/questions/12319025/calling-filter-returns-filter-object-at
   - https://stackoverflow.com/questions/33174276/why-does-foo-filter-return-a-filter-object-not-a-list 

6. Efficient data structures
   - Keine eindeutige Antwort
   - Kommt auf Use Case darauf an (lesen, schreiben, update, etc?)

7. String % vs. format vs. f
   - https://realpython.com/python-string-formatting/
   - https://stackoverflow.com/questions/5082452/string-formatting-vs-format-vs-f-string-literal
   - https://docs.python.org/3.6/reference/lexical_analysis.html#f-strings
