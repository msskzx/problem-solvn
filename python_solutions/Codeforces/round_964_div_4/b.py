def solve(a, b, x, y):
    games = [
        [a, x, b, y],
        [a, y, b, x],
        [b, x, a, y],
        [b, y, a, x]
    ]
    c = 0
    for game in games:
        p11, p21, p12, p22 = game
        if ((p11 > p21 and p12 == p22)
            or (p11 > p21 and p12 > p22)
            or (p11 == p21 and p12 > p22)):
                c += 1
    print(c)

def main():
    t = int(input())
    for _ in range(t):
        a = list(map(int, input().split()))
        solve(*a)
    
if __name__ == "__main__":
    main()