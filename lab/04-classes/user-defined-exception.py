
class SecurityException(Exception):
    def __init__(self, errno, message):
        self.errno = errno
        self.message = message

 
class Security():
    def __init__(self):
        self.users = ["Greta", "Sam", "Mike"]
        self.passwords = {
            "Greta": "secret", 
            "Sam"  : "verysecret",
            "Mike" : "topsecret"
        }

    def validate(self, user, password):
        if user not in self.users:
            raise SecurityException(1,"Invalid User")
        if password != self.passwords[user]:
            raise SecurityException(2, "Invalid Password")

testdata = {
    "Greta": "secret", 
    "Sam"  : "verysecret",
    "Mike" : "topsecret",
    "Hacker" : "hidden"
}

for user, password in testdata:
    print(user, password)