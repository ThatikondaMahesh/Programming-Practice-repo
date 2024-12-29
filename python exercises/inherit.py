# program to demo on the inheritance sinle inheritance
'''print('SINGLE INHERITANCE')
class Base:
    r=45
    name='MAHA'
    def disp(self):
        print('the function in BASE ',self.r,self.name)
class Derived(Base):
    def dis(self):
        print('Derived class function',self.r,self.name)
m=Derived()
m.dis()
m.disp()'''

'''print('hierarical INHERITANCE')
class Base:
    r=45
    name='MAHA'
    def dis(self):
        print('the function in BASE class',self.r,self.name)
class Derived1(Base):
    r=34
    name='DEV'
    def disp(self):
        print('Derd1 class function',self.r,self.name)
class Derived2(Base):
    def display(self):
        print('Derived2 class function',self.r,self.name)
m=Derived1()
m.disp()
m.dis()
n=Derived2()
n.display()
n.dis()
k=Base()
k.dis()'''

'''print('MULTIPLE INHERITANCE')
class Base2:
    r=45
    name='MAHA'
    def dis(self):
        print('the function in BASE2 class',self.r,self.name)
class Base1():
    r=34
    name='DEV'
    def disp(self):
        print('base1 class function',self.r,self.name)
class Derived2(Base2,Base1):
    def display(self):
        print('Derived2 class function',self.r,self.name)

n=Derived2()
n.display()
n.dis()
n.disp()'''

'''print('multilevel inheritance')
class grandp:
    r=45
    name='MAHA'
    def dis(self):
        print('the function in grandp class',self.r,self.name)
class p(grandp):
    r=34
    name='DEV'
    def disp(self):
        print('p class function',self.r,self.name)
class child(p):
    def display(self):
        print('child class function',self.r,self.name)

n=child()
n.display()
n.dis()
n.disp()'''

'''print('Constructors in inheritance')
class super:
    def __init__(self,r,name):
        self.r=r
        self.name=name
        print('Super class constructor')
    def display(self):
        print(f'superfunction class fun;{self.r} and the name is {self.name}')
class derived(super):
    def __init__(self,r,name):
        print('Derived class constructor')
        super.__init__(self,r,name)
    def display(self):
        print(f'derived class fun;{self.r} and the name is {self.name}')
        super.display(self)
m=derived(27,'mahadev')
m.display()'''