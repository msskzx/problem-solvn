def two_friends(a):
    for i, x in enumerate(a):
        if i + 1 == a[a[i] - 1]:
            return 2
    
    return 3

def main():
    t = int(input())
    res = []
    for _ in range(t):
        _ = int(input())
        a = list(map(int, input().split()))
        res.append(two_friends(a))
    
    for x in res:
        print(x)

if __name__ == "__main__":
    main()