import sys

n, m = map(int, sys.stdin.readline().split())

arr_n = set()
arr_m = set()

for _ in range(n):
    arr_n.add(sys.stdin.readline().strip())

for _ in range(m):
    arr_m.add(sys.stdin.readline().strip())

# 겹치는 행의 번호를 출력
common_rows = sorted(arr_n.intersection(arr_m))
print(len(common_rows))
for row in common_rows:
    print(row)