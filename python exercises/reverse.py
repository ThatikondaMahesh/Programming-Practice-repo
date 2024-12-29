# program to demo on the reverse
a=int(input("enter avalue to be reversed"))
rev=0
while a!=0:
   num=a%10
   rev=rev*10+num
   a=a//10
   
print("the reversed number is",rev)