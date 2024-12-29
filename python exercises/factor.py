#program to find factor
a=int(input("enter the a number "))
if a<0:
    print("factorial is not pssible")
elif a==0:
    print("not possible")
else:
    
 for i in range(1,a+1):
   if(a%i==0):
	 print(i)
		
# factors of a given number
num=int(input("enter any number"))
def fact(num):
    print("the factor of given number are")
    for i in range(1,num+1):
        if(num%i==0):
            print(i)
fact(num)

