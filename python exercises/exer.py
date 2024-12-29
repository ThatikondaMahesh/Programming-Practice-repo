# program to hide money
row1=[1,1,1]
row2=[1,1,1]
row3=[1,1,1]
print(f'{row1}\n{row2}\n{row3}')
matrix=[row1,row2,row3]
selv=input("enter the value you want hide mon")
row_renter=selv[0]

column_enter=selv[1]
rown=matrix[(int(row_renter)-1)]
rown[(int(column_enter)-1)]='x'
print(f'{row1}\n{row2}\n{row3}')
