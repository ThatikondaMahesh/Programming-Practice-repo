# progrm to demo on the for else
#a=[10,20,30,40,50,60,]
#for i in a:
##   if i%2==0:
       # break
#else:
#    print('success fully list completed')
print('finding the max height')
height=input('enter the heights')
l_heights=height.split(' ')
count=0
for i in l_heights:
 count=count+1
for i in range(count):
    l_heights[i]=int(l_heights[i])
    su=0
    m=l_heights[0]
for i in range(count):
    if m<l_heights[i]:
        m=l_heights[i]
print(f'the avarage height is {m} \nthank you')