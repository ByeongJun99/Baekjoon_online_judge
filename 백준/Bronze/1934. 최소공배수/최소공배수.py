import sys

t = int(sys.stdin.readline())

for i in range(t):
    a, b = map(int, sys.stdin.readline().split())
    res = a * b
    
    while b > 0:
        a, b = b, a%b
    
    print(res // a)