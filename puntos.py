class puntos(object):
    def __init__(self,identificador,x,y):
        self.identificador = identificador
        self.x = x
        self.y = y
	self.disponible = False
    def getX(self):
        return self.x
    def getY(self):
        return self.y
    def setX(self,x):
        self.x = x
    def setY(self,y):
        self.y = y
    def on(self):
	self.disponible = True
    def off(self):
	self.disponible = False
    def __iqual__(self,poin):
	return self.getX()==poin.getX() and self.getY()==poin.getY()
