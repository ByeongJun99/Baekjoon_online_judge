s = int(input())
t = int(input())

sum = 0
for i in range(t):
    a, b = map(int, input().split())
    sum += a*b

if (s == sum):
    print("Yes")
else:
    print("No")