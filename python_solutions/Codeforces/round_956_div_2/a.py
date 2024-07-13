"""
https://codeforces.com/contest/1992/problem/A
"""

def solve(n):
    for x in range(1, n + 1):
        print(x, end=' ' if x < n else '\n')
        
def main():
    t = int(input())
    for _ in range(t):
        n = int(input())
        solve(n)
    
if __name__ == "__main__":
    main()