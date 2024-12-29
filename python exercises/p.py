
def fun(n):
 prime=True
 for i in range(2,n):
    if(n%i==0):
        prime=False
        break
 if prime:
    print('number is prime ')
 else:
     print('number is not  prime ')

 


#n=int(input('enter the nmber '))
#fun(n)
