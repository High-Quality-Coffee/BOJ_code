def solution(s):
    
    if(s[0]=='-' or s[0]=='+'):
        new_str = s[1:len(s)]   
        new_str=int(new_str)
        if(s[0]=='-'):
            new_str*=-1
            return new_str
        return new_str
    
    s=int(s)
    return s
    
    
    