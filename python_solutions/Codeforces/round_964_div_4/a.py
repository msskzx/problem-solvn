def solve(x):
    a = x // 10
    b = x % 10
    print(a + b)

def main():
    t = int(input())
    for _ in range(t):
        x = int(input())
        solve(x)
    
if __name__ == "__main__":
    main()