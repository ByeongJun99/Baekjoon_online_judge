import sys

n = int(sys.stdin.readline())
d = {'ChongChong'}

for i in range(n):
    a, b = sys.stdin.readline().split()
    
    if a in d:
        d.add(b)
    if b in d:
        d.add(a)
            
print(len(d))