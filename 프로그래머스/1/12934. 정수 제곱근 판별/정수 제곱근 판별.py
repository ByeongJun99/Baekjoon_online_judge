def solution(n):
    answer = -1
    
    for i in range(1, n//2+2):
        if i*i == n:
            return (i+1) ** 2
            
    return answer