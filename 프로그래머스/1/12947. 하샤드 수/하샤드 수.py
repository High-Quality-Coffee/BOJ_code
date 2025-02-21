def solution(x):
    ary = list(map(int, str(x)))
    total=sum(ary)
    
    if(x%total==0):
        return True
    return False
    