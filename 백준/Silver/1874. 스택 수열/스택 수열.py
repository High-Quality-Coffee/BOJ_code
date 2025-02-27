n = int(input()) # 수열의 길이
ary = list() #수열

stack=list()
result_stack = list() # +,- 리스트
index=0

value = 1
result=True

for i in range(n):
    num=int(input())
    ary.append(num)


for i in range(n):

    if value<=ary[i]:
        while value <= ary[i]:
            stack.append(value)
            result_stack.append('+')
            value += 1

        stack.pop()
        result_stack.append('-')

    else:
        v=stack.pop()
        if v>ary[i]:
            print('NO')
            result=False
            break
        else:
            result_stack.append('-')

if result:
    for i in result_stack:
        print(i)


