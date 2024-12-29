#program to logical operators
a=12
b=34
c=54
print(a>b and a>c)



# program ot nested if 
a=int(input('enter the 1 num'))
b=int (input('enter the 2 number '))
c=int (input('enter the 3 number'))
if(a>b):
    if(a>c):
        print(a,'is the bigger number ')
    else:
        print(c,'is the bigger number ')
else:
    if(b>c):
        print(b,'is the bigger number' )
    else:
        print(c,'is the bigger number ')
print('THANK YOU ')       



print('demo on the if else stmts')
if(a>b):
    print(a,'the number is bigger ')
elif(b>c):
    print(b,'the number is bigger ')
elif(c>a):
    print(c,'is the bigger number ')
else:
        print('enter a valid number')

print('complex')
a=2+3I
print(a.real)