import sys
input = sys.stdin.readline

# 친구 수, 친구 관계 수 입력 받기
n,m=map(int,input().split())

# 친구 관계 넣을 배열 만들기
ary = [ [] for _ in range(n) ]
visited = [False] * n
arrive = False

# 친구 관계 배열에 넣기
for i in range(m):
    a,b=map(int,input().split())
    ary[a].append(b)
    ary[b].append(a)

def dfs(node, depth):
    global arrive

    if(depth==5):
        arrive = True
        return

    visited[node] = True

    for i in ary[node]:
        if not visited[i]:
            dfs(i,depth+1)

    # 새로운 탐색이나, depth가 5가 아닌 경우 방문했던 노드를 미방문 상태로 전환
    visited[node] = False

for i in range(n):
    dfs(i,1)
    if arrive:
        break

if arrive:
    print(1)
else:
    print(0)


