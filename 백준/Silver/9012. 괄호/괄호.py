import sys

t = int(sys.stdin.readline())

for i in range(t):
    stack = []
    input = sys.stdin.readline()
    for j in input:
        if j == '(':
            stack.append('(')
        elif j == ')':
            if stack:
                stack.pop()
            else:
                print('NO')
                break
        else:
            print('YES' if len(stack) == 0 else 'NO')