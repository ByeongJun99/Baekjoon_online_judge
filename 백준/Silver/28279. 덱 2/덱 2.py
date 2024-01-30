import sys
from collections import deque

n = int(sys.stdin.readline())
deq = deque([])

for i in range(n):
    inp = sys.stdin.readline().split()
    if inp[0] == '1':
        deq.appendleft(inp[1])
    elif inp[0] == '2':
        deq.append(inp[1])
    elif inp[0] == '3':
        print(-1 if len(deq) == 0 else deq.popleft())
    elif inp[0] == '4':
        print(-1 if len(deq) == 0 else deq.pop())
    elif inp[0] == '5':
        print(len(deq))
    elif inp[0] == '6':
        print(1 if len(deq) == 0 else 0)
    elif inp[0] == '7':
        print(-1 if len(deq) == 0 else deq[0])
    elif inp[0] == '8':
        print(-1 if len(deq) == 0 else deq[-1])