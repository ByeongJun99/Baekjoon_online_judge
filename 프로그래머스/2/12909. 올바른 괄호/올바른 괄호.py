def solution(s):
    answer = True
    
    list1 = []
    list2 = []
    
    for c in s:
        if c == '(':
            list1.append('(')
        elif c == ')':
            list2.append(')')
            
        if len(list2) > len(list1):
            return False
    
    if len(list1) > len(list2):
        return False

    return answer