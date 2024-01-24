import sys
from math import gcd

n = int(sys.stdin.readline())

arr = []
dist = []

for i in range(n):
    arr.append(int(sys.stdin.readline()))
    if i != 0:
        dist.append(arr[i] - arr[i-1])

max_gcd = dist[0]
for i in range(n-2):
    max_gcd = gcd(dist[i+1] - dist[i], max_gcd)

cnt = ((arr[n-1] - arr[0]) // max_gcd - 1) - n + 2
print(cnt)