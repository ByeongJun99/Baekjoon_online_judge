def solution(s):
    answer = ''
    
    for c in s.split(' '):
        c = c.lower()
        if c.isalpha():
            cList = list(c)
            cList[0] = cList[0].upper()
            c = "".join(cList)
        answer += c
        answer += ' '
    
    return answer[:-1]