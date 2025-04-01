from collections import deque
import sys
input = sys.stdin.readline

n,m,v = map(int,input().split())

ary = [ [] for _ in range(n+1) ]
q = deque()

d_visited = [False] * (n+1)
b_visited = [False] * (n+1)


for i in range(m):
    s,e = map(int,input().split())
    ary[s].append(e)
    ary[e].append(s)

for i in range(n+1):
    ary[i].sort()

def bfs(v):
    q.append(v)
    b_visited[v] = True

    while q:
        node = q.popleft()
        print(node, end=' ')
        for i in ary[node]:
            if not b_visited[i]:
                q.append(i)
                b_visited[i] = True



def dfs(v):
    d_visited[v] = True

    print(v , end=' ')

    for i in ary[v]:
        if not d_visited[i]:
            dfs(i)


dfs(v)
print()
bfs(v)

