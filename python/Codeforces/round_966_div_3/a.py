def solve(x):
    if x > 100:
        a = str(x)[:2]
        b = str(x)[2:]
        if a == '10' and b[0] != '0' and int(b) > 1:
            print("YES")
            return
    print("NO")


def main():
    t = int(input())
    for _ in range(t):
        x = int(input())
        solve(x)
    
if __name__ == "__main__":
    main()