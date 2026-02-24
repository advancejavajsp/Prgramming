def add(n1,n2):
    return n1+n2

def sub(n1,n2):
    return n1-n2

def mul(n1,n2):
    return n1*n2

def div(n1,n2):
    return n1/n2

def mod(n1,n2):
    return n1%n2




c='+'
n1=10
n2=20
res=0
match(c):
    case '+':
      res=  add(n1,n2)
    case '-':
      res=  sub(n1,n2)
    case '*':
      res=  mul(n1,n2)
    case '/':
      res=  div(n1,n2)
    case '%':
      res=  mod(n1,n2)  
    case _:
        print("invalid")


print("result ",res)

