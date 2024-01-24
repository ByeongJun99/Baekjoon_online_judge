import sys
import math

def isPrime(n):
    if n == 0 or n == 1:
        return False
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            return False
    return True

t = int(sys.stdin.readline())
arr = []

for i in range(t):
    k = int(sys.stdin.readline())
    while True:
        if isPrime(k):
            print(k)
            break
        else:
            k += 1