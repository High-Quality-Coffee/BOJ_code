import sys
input = sys.stdin.readline

n=int(input())

ary=[]

start_index=0
last_index=n-1

#두 원소를 비교하면서 스왑
def swap(a,b,lst):
    if lst[a]>lst[b]:
        temp=lst[a]
        lst[a]=lst[b]
        lst[b]=temp


for i in range(n):
    # n개 만큰 수를 입력받기
    ary.append(int(input()))

value=0
result=True

for i in range(n):
    if n==1:
        result=False
        print(ary[0])
        break
    for j in range(n-i-1):
        swap(j,j+1,ary)

if result:
    for i in range(n):
        print(ary[i])




