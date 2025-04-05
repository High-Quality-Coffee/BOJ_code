from collections import deque

import sys
input = sys.stdin.readline

n=int(input())
visited = [False] * (n+1)
w_ary = [0]*(n+1)

ary = [ [] for _ in range(n+1) ]

connect_node = 0
weight = 0

for i in range(1, n+1):
    input_ary = list(map(int, input().split()))

    node = input_ary[0]
    for index in range(1, len(input_ary)):
        # 해당 index 의 value가 -1이면 반복문 종료
        if input_ary[index] == -1:
            break

        # 인덱스가 짝수가 아니면 현재 노드와 연결된 노드값
        if index%2!=0:
            connect_node = input_ary[index]
        # 인덱스가 짝수면 간선값 -> 가중치 값
        else:
            weight = input_ary[index]

        if connect_node != 0 and weight != 0:
            ary[node].append((connect_node, weight))
            connect_node = 0
            weight = 0


def bfs(v):
    q = deque()
    q.append(v)
    visited[v] = True

    while q:
        popleft = q.popleft()

        for kv in ary[popleft]:
            if not visited[kv[0]]:
                q.append(kv[0])
                visited[kv[0]] = True
                w_ary[kv[0]] = kv[1] + w_ary[popleft]

    return w_ary.index(max(w_ary))


long_node = bfs(1)
visited = [False] * (n+1)
w_ary = [0]*(n+1)
bfs(long_node)
print(max(w_ary))

