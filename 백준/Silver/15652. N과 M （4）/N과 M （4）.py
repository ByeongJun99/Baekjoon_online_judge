import sys
import itertools

n, m = map(int, sys.stdin.readline().split())
nums = [i for i in range(1, n+1)]

arr = list(itertools.combinations_with_replacement(nums, m))

for i in arr:
    for j in i:
        print(j, end=' ')
    print()