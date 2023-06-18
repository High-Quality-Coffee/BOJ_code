from collections import deque

#dfs
def dfs(graph,v,Dvisited):
  Dvisited[v]=True
  print(v,end=' ')
  
  for i in graph[v]:
    if(Dvisited[i]==False):
      dfs(graph,i,Dvisited)

#bfs 
def bfs(graph,start,Bvisited):
  queue=deque([start])
  Bvisited[start]=True
  
  while queue:
    v=queue.popleft()
    print(v,end=' ')

    for i in graph[v]:
      if(Bvisited[i]==False):
        queue.append(i)
        Bvisited[i]=True
  

#입력받은 값을 공백을 기준으로 분리
n,m,v=input().split()
n,m,v=int(n),int(m),int(v)

graph=[[] for i in range(n+1)]

arr=[[0]*2 for i in range(n)]
  
for i in range(m):
   #arr[i][j],arr[i][j+1]=input().split()
   #arr[i][j],arr[i][j+1]=int(arr[i][j]),int(arr[i][j+1])
    a,b=input().split()
    a,b=int(a),int(b)
  
    if(graph[a].count(b)==0):
      graph[a].append(b)
    if(graph[b].count(a)==0):
      graph[b].append(a)
  

for i in range(1,n+1):
  graph[i].sort()

Dvisited=[False]*(n+1)
Bvisited=[False]*(n+1)

dfs(graph,v,Dvisited)
print()
bfs(graph,v,Bvisited)


