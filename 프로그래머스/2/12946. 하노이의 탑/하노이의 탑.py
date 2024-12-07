def solution(n):
    answer = []
    
    hanoi(n, 1,3,answer)
    return answer

def hanoi(n, start , end , answer):
    if(n==1):
        answer.append([start, end])
        return
        
    empty = 6-start-end
    hanoi(n-1, start, empty, answer)
    hanoi(1, start, end, answer)
    hanoi(n-1, empty, end, answer)
    
    
    
    