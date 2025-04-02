
from collections import deque

n,m = map(int, input().split())
q= deque()
depth = 1

# 상,하,좌,우 기준
dx = [-1,1,0,0]
dy = [0,0,-1,1]

ary = [ [0]*(m+1) for _ in range(n+1) ]
visited = [ [False]*(m+1) for _ in range(n+1) ]

for i in range(1,n+1):
    numbers = list(input())
    for j in range(1,m+1):
        ary[i][j] = int(numbers[j-1])


def bfs(a,b):
    global depth
    q.append((a,b))
    visited[a][b] = True
    while q:
        x,y = q.popleft()

        for i in range(4):
            if x+dx[i] >= 1 and y+dy[i] >= 1 and x+dx[i] <= n and y+dy[i] <= m:
                if ary[x+dx[i]][y+dy[i]]== 1 and not visited[x+dx[i]][y+dy[i]]:
                    q.append((x+dx[i], y+dy[i]))
                    visited[x+dx[i]][y+dy[i]] = True
                    ary[x + dx[i]][y + dy[i]] = ary[x][y]+1

bfs(1,1)
print(ary[n][m])


