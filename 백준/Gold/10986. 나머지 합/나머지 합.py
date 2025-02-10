import sys
input = sys.stdin.readline

n, m = map(int, input().split())
ary = list(map(int, input().split()))
s_ary =[0]
sum = 0
total = 0
remainder =[0]*m


for i in ary:
    sum += i
    s_ary.append(sum%m)
    if(sum%m == 0):
        total += 1
    remainder[sum%m] += 1


for i in range(m):
    total += remainder[i]*(remainder[i]-1)//2

print(total)


