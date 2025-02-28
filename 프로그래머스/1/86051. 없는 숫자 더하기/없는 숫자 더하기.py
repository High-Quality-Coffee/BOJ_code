def solution(numbers):
    numbers.sort()
    s=0
    
    for i in range(1,10):
        if i in numbers:
            continue
        s+=i
    
    return s