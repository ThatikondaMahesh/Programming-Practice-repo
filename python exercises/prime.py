
# prime numbers with in range
lower=int(input("enter any starting number"))
upper=int(input("enter any ending number"))
print("the prime numbers are ")
for i in range(lower, upper+1):
    if i>1:
        for j in range(2,i):
            if(i%j==0):
                break
        else:
            print(i)
          
