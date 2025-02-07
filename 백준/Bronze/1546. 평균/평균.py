numOfSubjects = int(input())
gradeOfSubjects = list(map(int, input().split()))

maxGrade = max(gradeOfSubjects)
sum = 0 

for i in gradeOfSubjects:
    sum = sum + i/maxGrade*100

print(sum/numOfSubjects)
