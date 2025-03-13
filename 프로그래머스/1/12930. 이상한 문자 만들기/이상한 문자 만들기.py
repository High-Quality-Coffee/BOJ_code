def solution(s):
    ary = s.split(" ")
    
    new_ary=[]
     
    for i in ary:
        new_word=""
        
        for j in range(len(i)):
            if j%2==0:
                new_word+=i[j].upper()
            else:
                new_word+=i[j].lower()
                
        new_ary.append(new_word)
        
    return ' '.join(new_ary)