import sys

n = int(sys.stdin.readline())
card = list(map(int, sys.stdin.readline().split()))

m = int(sys.stdin.readline())
chk = list(map(int, sys.stdin.readline().split()))

dict = {}

for i in range(len(card)):
    dict[card[i]] = 0
    
for j in chk:
    if j in dict:
        print('1', end=' ')
    else:
        print('0', end=' ')