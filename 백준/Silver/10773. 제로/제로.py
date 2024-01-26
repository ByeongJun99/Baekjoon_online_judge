import sys

k = int(sys.stdin.readline())
stack = []

for i in range(k):
    n = int(sys.stdin.readline())

    stack.append(n) if n !=0 else stack.pop()

cnt = 0
for i in stack:
    cnt += i

print(cnt)