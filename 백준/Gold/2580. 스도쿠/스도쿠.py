import sys

def row(n, x):
    for i in range(9):
        if a[x][i] == n:
            return False
    return True


def column(n, y):
    for i in range(9):
        if a[i][y] == n:
            return False
    return True


def square(x, y, n):
    x = x // 3 * 3
    y = y // 3 * 3
    for i in range(3):
        for j in range(3):
            if a[x + i][y + j] == n:
                return False
    return True


def search(cnt):
    if cnt == len(zero):
        for i in range(9):
            print(*a[i])
        exit()
    x = zero[cnt][0]
    y = zero[cnt][1]
    for i in range(1, 10):
        if column(i, y) and square(x, y, i) and row(i, x):
            a[x][y] = i
            search(cnt + 1)
            a[x][y] = 0


a = [list(map(int, sys.stdin.readline().split()))for _ in range(9)]
zero = []
for i in range(9):
    for j in range(9):
        if a[i][j] == 0:
            zero.append([i, j])
search(0)