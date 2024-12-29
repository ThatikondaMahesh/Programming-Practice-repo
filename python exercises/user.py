class voting(Exception):
    pass
age=int(input('entert '))
try:
    if(age<18):
        raise voting
    print('you are eligible')
except voting:
    print('excepion raised  low age')
    
    