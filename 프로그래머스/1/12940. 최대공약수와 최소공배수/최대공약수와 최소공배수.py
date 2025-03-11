import math

def solution(n, m):

    answer = []
    
    answer.append(math.gcd(n,m))
    lcm = (n * m) // math.gcd(n,m)
    answer.append(lcm)

    return answer