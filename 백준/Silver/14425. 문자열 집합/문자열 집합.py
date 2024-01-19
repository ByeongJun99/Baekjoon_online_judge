import sys
input = sys.stdin.readline

n, m = map(int, input().split())

s = []
cnt = 0

for i in range(n):
    s.append(input())
    
for i in range(m):
    t = input()
    if t in s:
        cnt += 1
        
print(cnt)