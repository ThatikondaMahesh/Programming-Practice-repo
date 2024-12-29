#program to fin dthe leap year
year=int(input("enter the year "))
if year%400==0:
    print(f'given year is the{year} is aleap year')
elif(year%4==0 and year%100!=0):
     print(f'given year is the {year} is aleap year')
else:
     print(f'given year is the {year} is not leap year')