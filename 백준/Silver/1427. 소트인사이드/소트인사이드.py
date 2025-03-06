import sys
input = sys.stdin.readline

n=int(input())

ary = list(map(int,str(n)))

index=0
max_index=0

for i in range(len(ary)-1):
    max=ary[index]
    for j in range(i,len(ary)):
        if max<ary[j]:
            max=ary[j]
            max_index=j
    if(max==ary[index]):
        index+=1
        continue
    temp=ary[index]
    ary[index]=max
    ary[max_index]=temp
    index+=1

for i in ary:
    print(i,end="")