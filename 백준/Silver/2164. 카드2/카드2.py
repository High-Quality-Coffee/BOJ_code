from collections import deque
import sys
input = sys.stdin.readline


#카드개수 n을 받는다
n = int(input())

#숫자를 담을 큐 생성
MyQueue = deque()

#카드는 위에서 부터 1 ~ 맨 아래는 n
for i in range(1,n+1):
    MyQueue.append(i)

#카드가 1개 남을때 까지 반복
while len(MyQueue) > 1:
    # 처음 카드는 버리고,
    MyQueue.popleft()
    # 두번째 카드는 카드 덱 맨 밑으로 보낸다
    MyQueue.append(MyQueue.popleft())

# 마지막 남은 카드 1장 출력
print(MyQueue[0])
