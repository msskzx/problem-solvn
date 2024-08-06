def solve(a, target, day):
    cur = 0
    for start, end in a:
        if start - cur >= target:
            print("YES")
            return
        cur = end
    print("YES" if day - cur >= target else "NO")

def main():
    t = int(input())
    for _ in range(t):
        n, target, day = map(int, input().split())
        a = []
        for _ in range(n):
           pair = list(map(int, input().split()))
           a.append(pair)
        solve(a, target, day)
    
if __name__ == "__main__":
    main()