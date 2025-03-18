import sys
input  = sys.stdin.readline

n=int(input())
ary=[0]*n
tmp=[0]*n

for i in range(n):
    ary[i]=int(input())


def mergesort(s,e):
    if e-s==0:
        return

    m=int((s+e)/2)

    mergesort(s,m)
    mergesort(m+1,e)

    for i in range(s,e+1):
        tmp[i]=ary[i]

    k=s
    index1 = s
    index2 = m+1

    while index1<=m and index2<=e:
        if tmp[index1]<tmp[index2]:
            ary[k]=tmp[index1]
            k+=1
            index1+=1
        else:
            ary[k]=tmp[index2]
            k+=1
            index2+=1

    while index1<=m:
        ary[k]=tmp[index1]
        k+=1
        index1+=1
    while index2<=e:
        ary[k]=tmp[index2]
        k+=1
        index2+=1

mergesort(0,n-1)

for i in ary:
    print(i)


