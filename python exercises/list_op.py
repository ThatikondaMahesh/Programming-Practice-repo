# progrM To list bsic opersations
l=[10,20,50,30,40,50]
L=['mahesh',766,True,9.5]
print(l+L)
print(L*2)
print(l[0:4:1])
print(l[::])
print(l[0:5:2])
print(l[:4:])
print(l[-4:-1:1])
print(l[::-1])
l[0]=30
print(l)
print(l.remove(50))
print(l)
print(l.pop())
del l[1:3]
print(l)
del L

print('basic list functions')
print(len(l))
print(30 in l)
print(30 not in l)
print(max(l))
print(min(l))
print(sum(l))
print(all(l))
print(any(l))
k=list('mahadev')
print(k)

print(sorted(k))
print('list methods ')
l=[10,20,30,40,50,60]
l.append(50)
print(l)
print(l.extend([60,70,80]))
print(l.insert(3,300))
print(l.count(30))
print(l.index(300))
print(l.reverse())
print(l.sort())