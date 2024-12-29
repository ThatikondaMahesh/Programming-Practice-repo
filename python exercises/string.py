#program to string operations 
import re
s=input("enter the string ")
print("length of the String is",len(s))
print(s*10)
print("frist element is ",s[0])
print("frist three ele are",s[0:3])
print("Last  three ele are",s[-1:-15])
for i in range(1,15):
    print(s,"\n",end="")
print("\n")
print("the backward is ",s[::-1])
x=len(s)
if(x<=7):
    print("the sixth element is ",s[6])
else :
    print("not exist ")
print("string after the removing the f & l ele",s[1:-1])
print("the upper",s.upper())
print("the string after the replce",s.replace('a','e'))

