# program to demo onencapss
class student:
    __roll=45
    def setA(self,x):
        self.__roll=self.__roll+x
        print(f'we are inthe dis function {self.__roll}')
    def getA(self):
        return self.__roll
s=student()
s.setA(78)
print(s.getA())
# the advantage of the encapsulation is data hiding
