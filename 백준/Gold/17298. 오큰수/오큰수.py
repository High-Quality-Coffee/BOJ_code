import sys
input = sys.stdin.readline

ary_size = int(input())
ary=list(map(int,input().split()))

ary_nge = [0]*ary_size
ary_max = list()
ary_new = list()

for i in range(ary_size):

    while ary_new and ary[ary_new[-1]] < ary[i]:
        ary_nge[ary_new.pop()] = ary[i]

    ary_new.append(i)

while ary_new:
    ary_nge[ary_new.pop()] = -1

for i in ary_nge:
    print(i, end=' ')

