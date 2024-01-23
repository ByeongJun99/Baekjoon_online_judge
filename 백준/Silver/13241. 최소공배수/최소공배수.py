import sys

a, b = map(int, sys.stdin.readline().split())

res = a * b

while b > 0:
    a, b = b, a%b
    
print(res//a)