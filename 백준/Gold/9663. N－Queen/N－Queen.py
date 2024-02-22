import sys

n = int(sys.stdin.readline())
row = [0] * n
cnt = 0

def prommising(a):
    for i in range(a):
        if (row[a] == row[i]) or (abs(row[a] - row[i]) == abs(a - i)):
            return False
    return True

def queen(a):
    global cnt
    if a == n:
        cnt += 1
        return
    else:
        for i in range(n):
            row[a] = i
            if prommising(a):
                queen(a+1)

queen(0)
print(cnt)