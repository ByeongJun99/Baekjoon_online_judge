def primeNum(n):
    nums = [0, 0] + [1] * (2*n-1)
    for i in range(2, int((2*n)**0.5)+1):
        if nums[i] == 1:
            nums[2*i::i] = [0] * ((2*n-i)//i )
    return nums[n+1:].count(1)

while True:
    n = int(input())
    if n == 0:
        break
    else:
        print(primeNum(n))