import sys
sys.setrecursionlimit(10000)
input=sys.stdin.readline

n,m= map(int,input().split())

ary = [ [] for _ in range(n+1) ]
visited = [False for _ in range(n+1)]

def dfs(u):
    visited[u] = True
    for node in ary[u]:
        if not visited[node]:
            dfs(node)


for i in range(m):
    u,v = map(int,input().split())
    ary[u].append(v)
    ary[v].append(u)

count=0

for i in range(1,n+1):
    if not visited[i]:
        count+=1
        dfs(i)

print(count)
