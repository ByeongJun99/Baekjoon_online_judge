import sys

n = int(sys.stdin.readline())
arr = dict()

for i in range(n):
    a, b = map(str, sys.stdin.readline().split())
    if b == 'enter':
        arr[a] = b
    elif b == 'leave':
        del arr[a]
        
arr = sorted(arr.keys(), reverse=True)
        
for i in arr:
    print(i)