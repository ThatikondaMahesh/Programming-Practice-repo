#program to print
rows=int(input())
cols=int(input())
for i in range(1,rows+1):
    for j in range(cols-i+1):
        print(' ',end=' ')
    for k in range(1,i+1):
        print(i,end=' ')
    print()