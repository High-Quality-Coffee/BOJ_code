import sys
input = sys.stdin.readline

# 배열 크기 및 질의 개수 입력
n, m = map(int, input().split())

# 2차원 배열 입력
arr = [list(map(int, input().split())) for _ in range(n)]

# 합 배열 (Prefix Sum) 초기화
sum_arr = [[0] * (n + 1) for _ in range(n + 1)]

# 합 배열 계산

for i in range(1, n + 1):
    for j in range(1, n + 1):
        sum_arr[i][j] = arr[i-1][j-1] + sum_arr[i-1][j] + sum_arr[i][j-1] - sum_arr[i-1][j-1]

# 질의 처리
for _ in range(m):
    x1, y1, x2, y2 = map(int, input().split())
    result = (sum_arr[x2][y2] 
              - sum_arr[x1-1][y2] 
              - sum_arr[x2][y1-1] 
              + sum_arr[x1-1][y1-1])
    print(result)
