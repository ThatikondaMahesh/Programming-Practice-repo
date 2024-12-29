# program to demo class
class Student:
    rno=766
    print('hello class')
    name='Mahesh'
    def display(self):
        rno=67
        name='mahadev'
        print('we are in the display function')
        print('rolll is',self.rno)
        print('name is ',self.name)
s=Student()
s.display()
s1=Student()
s1.rno=18
s1.display()