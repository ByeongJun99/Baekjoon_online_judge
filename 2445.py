n = int(input())

for i in range(1, n+1):
    for a in range(i):
        print('*', end = '')
    
    for b in range(2 * (n - i)):
        print(' ', end = '')

    for c in range(i):
        print('*', end = '')
    
    print()

for i in range(n-1, 0, -1):
    for a in range(i):
        print('*', end = '')
    
    for b in range(2 * (n - i)):
        print(' ', end = '')

    for c in range(i):
        print('*', end = '')
    
    print()
