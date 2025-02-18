import sys
input = sys.stdin.readline

# 입력 받기
dna_length, dna_substr = map(int, input().split())
dna_str = input().strip()
dna_check = list(map(int, input().split()))

# A, C, G, T 개수를 저장하는 배열
current_count = [0] * 4
start_index = 0
count = 0

# DNA 문자 인덱스 변환 함수
def dna_index(char):
    if char == 'A': return 0
    if char == 'C': return 1
    if char == 'G': return 2
    if char == 'T': return 3

# ✅ 첫 윈도우 초기 설정 (처음 `dna_substr` 길이만큼 카운트)
for i in range(dna_substr):
    current_count[dna_index(dna_str[i])] += 1

# ✅ 조건을 만족하는지 확인하는 함수
def is_valid():
    for i in range(4):
        if current_count[i] < dna_check[i]:
            return False
    return True

# ✅ 첫 윈도우 검사
if is_valid():
    count += 1

# ✅ 슬라이딩 윈도우 적용
for end_index in range(dna_substr, dna_length):
    start_index = end_index - dna_substr  # 윈도우 시작점
    
    # 왼쪽 문자 제거
    current_count[dna_index(dna_str[start_index])] -= 1
    
    # 오른쪽 문자 추가
    current_count[dna_index(dna_str[end_index])] += 1
    
    # 현재 윈도우가 조건을 만족하는지 검사
    if is_valid():
        count += 1

# 결과 출력
print(count)