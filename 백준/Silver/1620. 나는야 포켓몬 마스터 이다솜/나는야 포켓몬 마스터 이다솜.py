import sys

n, m = map(int, sys.stdin.readline().split())

num = {}
name = {}

for i in range(n):
    a = sys.stdin.readline().strip()    # key 값
    num[i] = a
    name[a] = i
    
for i in range(m):
    b = sys.stdin.readline().strip()    # value 값
    if b.isalpha():
        pass    # 포켓몬 번호를 출력
        print(name[b]+1)
    elif b.isdigit():
        pass    # 포켓몬 번호에 해당하는 문자를 출력
        print(num[int(b)-1])