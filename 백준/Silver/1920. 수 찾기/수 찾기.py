import sys
input = sys.stdin.readline

# 입력 처리
n = int(input().strip())  # 개행문자 제거
n_ary = list(map(int, input().strip().split()))
m = int(input().strip())
m_ary = list(map(int, input().strip().split()))

n_ary.sort()

def binary_search(target_data, s, e):
    # 종료 조건: 범위가 유효하지 않으면 0 출력
    if s > e:
        print(0)
        return
    
    mid = (s + e) // 2  # 중앙값 계산 (오버플로우 방지 가능성 고려)

    if n_ary[mid] == target_data:
        print(1)
        return
    elif n_ary[mid] > target_data:
        binary_search(target_data, s, mid - 1)
    else:  # n_ary[mid] < target_data
        binary_search(target_data, mid + 1, e)

# 각 m_ary 값에 대해 이진 탐색 수행
for i in m_ary:
    binary_search(i, 0, len(n_ary) - 1)