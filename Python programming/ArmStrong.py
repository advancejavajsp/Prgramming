n=153
n1=n
n2=n
count=0
sum=0

while n>0:
     count+=1
     n//=10


while n1>0:
     digit=n1%10
     pow=1

     for i in (1,count+1):
          pow=pow*digit
     
     print(pow)
     sum=sum+pow
     n1//=10

if n2==sum:
     print("arm strong number")
else:
     print("not arm strong")