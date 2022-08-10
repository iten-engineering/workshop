
def test(name=None, x=5, y=12):
    result = x + y
    return {
        "name": name, 
        "x": x,
        "y": y,
        "result": result
    } 


res = test(name="Test 1", x=10, y=20)
print(res)

t2 = {"name": "Test 2", "x": 1, "y": 99}
res = test(**t2)
print(res)

t3 = {"name": "Test 3", "x": 9, "y": 66}
res = test(**t3)
print(res)


