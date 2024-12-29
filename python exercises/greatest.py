n1 = int(input('Enter the first value:'))
n2 = int(input('Enter the second value:'))
n3 = int(input('Enter the third value:'))

greatest_val = 0

if n1 > n2 and n1 > n3:
    greatest_val = n1
if n2 > n1 and n2 > n3:
    greatest_val = n2
if n3 > n1 and n3 > n2:
    greatest_val = n3

print(greatest_val, "is the largest of three values.")

