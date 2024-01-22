import sys
from collections import Counter

n = int(sys.stdin.readline().rstrip())
arr_n = list(map(int, sys.stdin.readline().split()))

m = int(sys.stdin.readline().rstrip())
arr_m = list(map(int, sys.stdin.readline().split()))

count = Counter(arr_n)

for i in arr_m:
    if i in count:
        print(count[i], end=' ')
    else:
        print(0, end=' ')