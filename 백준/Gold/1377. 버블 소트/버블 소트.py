import sys
input = sys.stdin.readline

n=int(input())

ary=[]

# 정렬 전 인덱스까지 이차원 배열로 저장
for i in range(n):
    ary.append((int(input()),i))
    
#ary가 정렬되기 전 원소들의 상태를 저장하기 위해 배열 복사
# O(nlogn) 시간복잡도 : sort()
copy_ary = sorted(ary)

max = 0

for i in range(n):
    if max < copy_ary[i][1]-i:
        max = copy_ary[i][1]-i

print(max+1)