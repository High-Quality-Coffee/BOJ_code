import sys
input = sys.stdin.readline

countOfNum, countOfSum = map(int, input().split())

ary = list(map(int, input().split()))

sumOfRange = [0]
sum = 0

for i in ary:
    sum += i
    sumOfRange.append(sum)

for i in range(countOfSum):
    one, two = map(int, input().split())
    print(sumOfRange[two] - sumOfRange[one-1])

