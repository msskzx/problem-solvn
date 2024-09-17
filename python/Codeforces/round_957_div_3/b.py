"""
https://codeforces.com/contest/1992/problem/B
"""

def solve(a):
    mx = a[0]
    c = 0
    for x in a:
        if x == 1:
            c += 1
        else:
            c += x - 1 + x
            mx = max(mx, x)
    print(c - (2 * mx - 1))

def main():
    t = int(input())
    for _ in range(t):
        _, _ = map(int, input().split())
        a = list(map(int, input().split()))
        solve(a)
    
if __name__ == "__main__":
    main()