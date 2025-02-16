import sys
input = sys.stdin.readline

n = int(input())

ary = list(map(int, input().split()))

ary.sort()

count = 0

for i in range(n):
    k = ary[i]
    start_index = 0
    end_index = n-1

    while start_index < end_index:
        if(ary[start_index] + ary[end_index] < k):
            start_index += 1

        elif(ary[start_index] + ary[end_index] > k):
            end_index -= 1

        else:
            if start_index != i and end_index != i:
                count += 1
                break
            elif start_index == i:
                start_index += 1
            elif end_index == i:
                end_index -= 1
                


print(count)