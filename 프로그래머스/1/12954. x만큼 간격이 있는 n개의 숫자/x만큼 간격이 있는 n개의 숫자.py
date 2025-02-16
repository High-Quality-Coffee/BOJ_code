def solution(x, n):
    answer = []
    improval = x
    for i in range(n):
        answer.append(x)
        x+=improval
        

    return answer