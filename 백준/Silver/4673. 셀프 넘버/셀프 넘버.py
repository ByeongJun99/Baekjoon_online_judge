a = []
for i in range(1, 9999):
    d = 0
    i_str = str(i)
    for j in range(len(i_str)):
        d += int(i_str[j])
    d += i
    a.append(d)
for i in range(1, 10001):
    if i not in a:
        print(i)