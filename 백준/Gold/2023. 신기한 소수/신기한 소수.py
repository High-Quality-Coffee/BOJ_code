import sys
input = sys.stdin.readline

n = int(input())

ary = [ [] for _ in range(10) ]

# 소수인지 체크하는 로직
def isPrime(number):
    i=2
    while i*i<=number:
        if(number%i==0): return False
        i+=1
    return True

odd = [1,3,5,7,9]

def dfs(num):

    if len(str(num)) == n:
        print(num)

    for i in odd:
        if isPrime(num*10+i):
            dfs(num*10+i)

dfs(2)
dfs(3)
dfs(5)
dfs(7)
