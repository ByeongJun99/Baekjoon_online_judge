n = int(input())
stdnt = []
for i in range(n):
    stdnt.append(input().split())
for i in range(n):
    rnk = 1
    for j in range(n):
        if stdnt[i][0] < stdnt[j][0] and stdnt[i][1] < stdnt[j][1]:
            rnk += 1
    print(rnk, end=" ")
