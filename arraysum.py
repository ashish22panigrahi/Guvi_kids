n,k=input().split()
l=[]
sum=0
for i in range(0,int(n)):
    l.append(int(input()))
for i in range(0,int(k)):
    sum+=l[i]
print(sum)
