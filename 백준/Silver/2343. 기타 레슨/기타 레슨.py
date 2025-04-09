import sys
input = sys.stdin.readline

n,m = map(int,input().split())

ary = list(map(int,input().split()))

start = max(ary)
end = sum(ary)
total = 0
count = 0

while start <= end:
    mid = (start + end)//2
    total = 0
    count = 0

    for i in ary:

        if total+i>mid:
             count+=1
             total=0
        total += i

    if total!=0:
        count+=1
    if count <= m:
        end = mid - 1
    elif count > m:
        start = mid + 1

print(start)

