def solution(x):
    str_x = str(x)
    sum = 0
    
    for i in str_x:
        sum += int(i)
        
    if x % sum == 0:
        answer = True
    else:
        answer = False
    return answer