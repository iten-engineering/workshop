
class SecurityException(Exception):
    def __init__(self, errno, message):
        self.errno = errno
        self.message = message

    


class Security():

    def __init__(self):
        pass


    def login(user, password):
        pass
