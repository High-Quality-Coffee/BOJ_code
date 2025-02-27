def solution(phone_number):
    
    front_number=len(phone_number)-4
    front = '*'*front_number
    back_number = phone_number[front_number:]
    
    return front+back_number
    