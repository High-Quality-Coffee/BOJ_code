import sys
input = sys.stdin.readline

n = int(input())

ary = list(map(int,input().split()))

# 실제 값의 인덱스
insert_point = -1
temp = 0
# 처음 인덱스 위치
for i in range(1,n):
    # 인덱스의 삽입 범위
    for j in range(0,i):
        if ary[j] > ary[i]:
            insert_point = j
            temp=ary[i]
            break

    if(insert_point == -1 and temp==0):
        continue
    # 뒤로 숫자 밀기
    for j in range(i,insert_point,-1):
        ary[j]=ary[j-1]

    ary[insert_point]=temp
    insert_point=-1
    temp=0

# 합 배열 구하기

s=[0]*n
s[0]=ary[0]

for i in range(1,n):
    s[i]=s[i-1]+ary[i]

sum=0

for i in s:
    sum+=i

print(sum)
