import math

def solution(n):
    ary = list(map(int, str(n)))    
    ary.sort(reverse=True)
    length = len(ary)-1
    answer = 0
    
    for i in ary:
        answer+=i*(math.pow(10,length))
        length-=1        
    
    return answer