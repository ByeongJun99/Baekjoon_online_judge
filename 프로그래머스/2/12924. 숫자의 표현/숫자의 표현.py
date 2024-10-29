def solution(n):
    answer = 1
    
    for i in range(1, n//2+1):
        sum = 0
        j = i - 1
        while sum < n:
            j += 1
            sum += j
        
        if sum == n:
            answer += 1
    
    return answer