import sys
from collections import deque

n, k = map(int, sys.stdin.readline().split())
queue = deque([])
queue2 = deque([])

for i in range(n):
    queue.append(i+1)

res = "<"

for i in range(n):
    queue.rotate(-k+1)
    res += str(queue.popleft())
    if len(queue) > 0:
        res += ", "

res += ">"

print(res)