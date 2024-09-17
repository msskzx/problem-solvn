"""
https://codeforces.com/contest/1986/problem/B
"""

def solve(n, m, a):
    for i in range(n):
        for j in range(m):
            mx = 0
            if i > 0:
                mx = max(mx, a[i - 1][j])
            if i < n - 1:
                mx = max(mx, a[i + 1][j])
            if j > 0:
                mx = max(mx, a[i][j - 1])
            if j < m - 1:
                mx = max(mx, a[i][j + 1])
            a[i][j] = min(a[i][j], mx)
            print(a[i][j], end=" " if j < m - 1 else "\n")

def main():
    t = int(input().strip())
    for _ in range(t):
        n, m = map(int, input().strip().split())
        matrix = []
        for _ in range(n):
            matrix.append(list(map(int, input().strip().split())))
        solve(n, m, matrix)
       
if __name__ == "__main__":
    main()