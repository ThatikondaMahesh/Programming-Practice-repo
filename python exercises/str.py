# progrsm to string operations
s='Ramalingamma'
s1='yadaiah'
print(s+s1)
print(s*10)
# slicing operations
print(s[0])
print(s[0:5:1])
print(s[0:12:2])
print(s[:5:])
print(s[1::])
print(s[::-1])
print(s[::1])
print(s[::])
print(s[-4::])


print('methods and the functions')
print(s.capitalize())
p=s.center(24,'*')
print(p)

print(s.ljust(24,'*'))
print(s.rjust(24,'*'))
print(s.count('m'))
print(s.count('a'))
print(s.startswith('R'))
print(s.endswith('a'))
print(s.find('k'))
print(s.find('m'))
print(s.rfind('m'))
print(s.index('g'))
print(s.isalnum())
print(s.isalpha())
print(s.isdigit())
print(s.lower())
print(s.upper())
print(s.isspace())
print(len(s))
print(max(s))
print(min(s))
print(s.strip())
print(s.join('amma'))
print(s.title())
print(s)
