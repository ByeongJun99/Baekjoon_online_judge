import sys
import math

m, n = map(int, sys.stdin.readline().split())

def isPrime(n):
    if n == 0 or n == 1:
        return False
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            return False
    return True

for i in range(m, n+1):
    if isPrime(i):
        print(i)