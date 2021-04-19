from payment import Payment

class Card(Payment):
    number = int
    date = str
    name = str
    cvv = int

    def __init__(self, id, number, expireDate, name, code):
        super.__init__(id)
        self.number = number
        self.expireDate = expireDate
        self.name = name
        self.code = code
