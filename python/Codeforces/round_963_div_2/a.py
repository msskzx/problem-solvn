def solve(n, s):
    f = {'A': 0, 'B': 0, 'C': 0, 'D': 0}
    for c in s:
        if c != '?':
            f[c] += 1
    sm = 0
    for _, x in f.items():
        sm += min(x, n)
    print(sm)

def main():
    t = int(input())
    for _ in range(t):
        n = int(input())
        s = str(input())
        solve(n, s)
    
if __name__ == "__main__":
    main()