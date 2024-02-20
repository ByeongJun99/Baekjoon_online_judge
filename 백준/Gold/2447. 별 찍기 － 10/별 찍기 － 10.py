import sys
sys.setrecursionlimit(10**6)

def draw_star(n):
    if n == 1:
        return ['*']
    
    stars = draw_star(n//3)
    li = []

    for i in stars:
        li.append(i*3)
    for i in stars:
        li.append(i + ' '*(n//3) + i)
    for i in stars:
        li.append(i*3)

    return li
    
n = int(sys.stdin.readline().strip())
print('\n'.join(draw_star(n)))