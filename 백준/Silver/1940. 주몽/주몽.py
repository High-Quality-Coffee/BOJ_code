import sys
input = sys.stdin.readline

n = int(input())
m = int(input())
materials = list(map(int, input().split()))
materials.sort()

start_index = 0
end_index = n-1
sum = materials[0]+materials[n-1]
count = 0

while start_index < end_index:
    if(materials[start_index]+materials[end_index]<m):
        start_index += 1

    elif(materials[start_index]+materials[end_index]==m):
        count+=1
        start_index+=1
        end_index-=1

    elif(materials[start_index]+materials[end_index]>m):
        end_index-=1


print(count)





