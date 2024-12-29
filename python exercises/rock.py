import random
user=int(input('enter the user number '))
com=random.randint(0,2)
if(user==com):
    print("draw match")   
elif(user==0 and com==2):
    print(" you win the match")
elif(user ==2 and com ==0):
    print('you lose the match')
elif(user<com ):
    print('you lose the match')
elif(user>com ):
    print('you win  the match')
else:
    print('you entered the wrong num you lost the match')