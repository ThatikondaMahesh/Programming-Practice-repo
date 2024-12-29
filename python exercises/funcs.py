# program to funcs
def prime(num):
    prim=True
    for  i in range(2,num):
        if(num%i==0):
            prim=False
if prim:
    print(f'the number is {num} prime')
else:
    print(f'the number is {num} not  prime')           
        
a=int(input('Ennter the prime num tobe check'))
prime(a) 
