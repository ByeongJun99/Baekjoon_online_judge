import sys

def div(n):
    if n == 1:
        return '-'
    left = div(n//3)
    center = ' ' * (n//3)
    return left + center + left

while True:
    try:
        n = int(sys.stdin.readline())
        res = div(3 ** n)
        print(res)

    except:
        break