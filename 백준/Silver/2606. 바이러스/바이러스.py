#입력받은 값을 공백을 기준으로 분리
n=int(input())
edge=int(input())

graph=[[] for i in range(n+1)]
for i in range(edge):
    a,b=input().split()
    a,b=int(a),int(b)
  
    if(graph[a].count(b)==0):
      graph[a].append(b)
    if(graph[b].count(a)==0):
      graph[b].append(a)
  

for i in range(1,n+1):
  graph[i].sort()

visited=[False]*(n+1)

#int형으로 사용할 변수는 call by value로 넘어감
#따라서 list,dict,set을 사용하여 call by reference(call by assignment)로 넘긴다

count=[0] 

def dfs(graph,v,visited):
  visited[v]=True
  count[0]+=1
  for i in graph[v]:
    if(visited[i]==False):
      dfs(graph,i,visited)
  

dfs(graph,1,visited)
print(count[0]-1)
