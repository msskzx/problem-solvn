from collections import Counter

def solve(a):
    res = 0
    counter = Counter(a)
    mx = 0
    for i, c in counter.items():
        res += c
        mx = max(mx, c)
    print(res - mx)


def main():
    t = int(input())
    for _ in range(t):
        _ = int(input())
        a = list(map(int, input().split()))
        solve(a)
    
if __name__ == "__main__":
    main()