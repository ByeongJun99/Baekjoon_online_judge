import sys

a, b = map(int, sys.stdin.readline().split())
c, d = map(int, sys.stdin.readline().split())

num1 = (a*d) + (b*c)   # 분자
num2 = b*d   # 분모
aa = num1
bb = num2

while num2 > 0: # 최대공약수 구하기
    num1, num2 = num2, num1%num2

print(aa//num1, bb//num1, end=' ')