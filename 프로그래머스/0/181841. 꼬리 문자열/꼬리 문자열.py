def solution(str_list, ex):
    answer = ''
    
    for string in str_list:
        if ex in string:
            continue;
        answer += string
    return answer