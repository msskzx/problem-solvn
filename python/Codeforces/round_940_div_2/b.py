def bit_construct(n, k):
    if n == 1:
        print(k)
        return

    x = 1
    while (x << 1) < k:
        x <<= 1
        x += 1
    
    res = str(x) + " " + str(k - x)

    for i in range(2, n):
        res += " 0"
    
    print(res)
    

def main():
    t = int(input().strip())
    for _ in range(t):
        n, k = map(int, input().strip().split())
        bit_construct(n, k)
    
if __name__ == "__main__":
    main()