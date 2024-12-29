# program to fibinoci
num=int(input("enter the upper limit of the fibi"))
a,b=0,1
if(num<0):
    print("Enter the positive ")
elif(num==0):
    print(a)
else:
    count=1
    print(a)
    print(b)
    while(count<num):
      su=a+b;
      a=b
      b=su
      print(su)
      count=count+1
