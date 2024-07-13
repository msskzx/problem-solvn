"""
https://codeforces.com/contest/1987/problem/A
"""

def solve(n, k):
    print((n - 1) * k + 1)
        
def main():
    t = int(input())
    for _ in range(t):
        n, k = map(int, input().split())
        solve(n,k)
    
if __name__ == "__main__":
    main()