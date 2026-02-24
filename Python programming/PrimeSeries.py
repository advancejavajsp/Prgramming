
start=1
end=10
count=0
for j in range(start,end):
    n=j
    

    for i in range(1,n+1,1):
     if n%i==0:
        count+=1
        

    if count==2:
     print(n)
    