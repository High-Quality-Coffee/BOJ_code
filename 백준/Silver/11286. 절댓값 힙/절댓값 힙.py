from queue import PriorityQueue
import sys
print = sys.stdout.write
input = sys.stdin.readline

# 개수
n = int(input())

# 우선 순위 큐 설정
p_queue = PriorityQueue()

# 개수 만큼 숫자 입력 받기
for i in range(n):
    req = int(input())

    if req==0:
        if p_queue.empty():
            print('0\n')

        else:
            temp=p_queue.get()
            print(str((temp[1])) + '\n')

    else:
        p_queue.put((abs(req),req))


