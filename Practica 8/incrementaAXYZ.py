class A:
    def __init__(self, x, z):
        self.x = x
        self.z = z
    def incrementaXZ(self):
        self.x = self.x + 1
        self.z = self.z + 1
        print("x= ",self.x)
        print("z= ",self.z)
    def incrementaZ(self):
        self.z = self.z + 1
        print("z= ",self.z)

class B:
    def __init__(self, y, z):
        self.y = y
        self.z = z
    def incrementaYZ(self):
        self.y = self.y + 1
        self.z = self.z + 1
        print("y= ",self.y)
        print("z= ",self.z)
    def incrementaZ(self):
        self.z = self.z + 1
        print("z= ",self.z)

class D(A,B):
    def __init__(self, x, y, z):
         A.__init__(self, x, z)
         B.__init__(self, y, z)
    def incrementaXYZ(self):
        self.incrementaXZ()
        self.incrementaYZ()

ejemplo1 = D(1,2,3)
ejemplo1.incrementaXYZ()
