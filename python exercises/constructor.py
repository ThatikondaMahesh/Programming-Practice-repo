# program to  demo onthe constructor
class Student:
    
    def __init__(self,rno,name):
        self.rno=rno
        self.name=name
        print('constructor inside function')
        print(f'the roll number is{self.rno} and nameis {self.name}')
    def display(self):
        print('display inside function')
        print(f'the roll number is{self.rno} and nameis {self.name}')
        
s=Student(23,'mahesh')
s1=Student('J3','maha')
s1.display
print(f'the roll number is{s} and nameis {s.name}')