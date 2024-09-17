"""
https://codeforces.com/contest/1992/problem/A
"""

def solve(a):
    c = 5
    a.sort()
    while c > 0:
        a[0] += 1
        c -= 1
        a.sort()
    print(a[0] * a[1] * a[2])

def main():
    t = int(input())
    for _ in range(t):
        a = list(map(int, input().split()))
        solve(a)
    
if __name__ == "__main__":
    main()