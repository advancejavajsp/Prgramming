n=147
n1=n
sum=0
while n>0:
    digit=n%10
    fact=1

    for i in range(1,digit+1):
        fact=fact*i

    sum=sum+fact

    n=n//10

if n1==sum:
    print("Strong Number")
else:
    print("not Strong")