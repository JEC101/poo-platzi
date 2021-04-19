from payment import Payment

class Paypal(Payment):
    userName = str
    password = str

    def __init__(self, id, userName, password):
        super.__init__(id)
        self.userName = userName
        self.password = password