num = int(input("Enter a number: ")) 
def fact(n):  
   if (n == 1 or n==0):  
       return 1  
   else:  
       return n*fact(n-1)  
if num < 0:  
   print("Sorry, factorial does not exist for negative numbers")  
elif num == 0:  
   print("The factorialof 0 is 1")  
else:  
   print("The factorial of",num,"is",fact(num))
