import sys

n = int(sys.stdin.readline())
stack = []

for i in range(n):
    input = sys.stdin.readline().rstrip()

    if len(input) > 2:
        stack.append(int(input[2:]))
    elif input == '2':
        print(-1 if len(stack) == 0 else stack.pop())
    elif input == '3':
        print(len(stack))
    elif input == '4':
        print(1 if len(stack) == 0 else 0)
    elif input == '5':
        print(-1 if len(stack) == 0 else stack[-1])