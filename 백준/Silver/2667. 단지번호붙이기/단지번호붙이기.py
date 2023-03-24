n = int(input())

graph = []

for i in range(n):
  graph.append(list(map(int, input())))


#특정노드 방문 후 모든 노드  방문
def dfs(x, y, count, i):
  #주어진 범위를 벗어나는 경우에는 즉시 종료
  if (x <= -1 or x >= n or y <= -1 or y >= n):  #or, and 사용가능????
    return False

  if (graph[x][y] == 1):
    graph[x][y] = 0
    count[i] += 1
    dfs(x - 1, y, count, i)
    dfs(x, y - 1, count, i)
    dfs(x + 1, y, count, i)
    dfs(x, y + 1, count, i)
    return True
  return False


result = 0
count = [0] * 400
index = 0
for i in range(n):
  for j in range(n):
    if (dfs(i, j, count, index) == True):
      result += 1
      index += 1

print(result)
count.sort(reverse=True)  #문제를 똑바로 읽자.

for i in range(index):
  print(count[index - i - 1])
