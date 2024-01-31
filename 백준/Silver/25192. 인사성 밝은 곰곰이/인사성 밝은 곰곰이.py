import sys

n = int(sys.stdin.readline())

s = set()
cnt = 0

for i in range(n):
    inp = sys.stdin.readline().strip()

    if inp == 'ENTER':
        cnt += len(s)
        s.clear()
    else:
        s.add(inp)
cnt += len(s)
print(cnt)