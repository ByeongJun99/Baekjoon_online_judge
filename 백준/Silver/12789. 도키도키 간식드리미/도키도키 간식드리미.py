import sys

n = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))

tmp = []
t = 1

while arr:
    if arr[0] == t:
        arr.pop(0)
        t += 1
    else:
        tmp.append(arr.pop(0))

    while tmp:
        if tmp[-1] == t:
            tmp.pop()
            t += 1
        else:
            break

print('Nice' if not tmp else 'Sad')