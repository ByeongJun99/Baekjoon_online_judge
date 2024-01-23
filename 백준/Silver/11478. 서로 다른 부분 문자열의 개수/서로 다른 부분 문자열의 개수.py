import sys

s = sys.stdin.readline()
arr = set()

for i in range(len(s)):
    for j in range(len(s)):
        arr.add(s[i:j])
        
arr.discard('')
        
print(len(arr))