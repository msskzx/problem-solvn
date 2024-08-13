def solve(a):
    f = [0] * (len(a) + 1)
    f[a[0]] = a[0]
    for x in a[1:]:
        if ((x + 1 < len(a) + 1 and f[x + 1] > 0)
        or (x - 1 >= 0 and f[x - 1] > 0)):
          f[x] = x
        else:
          print("NO")
          return
    print("YES")
            

def main():
    t = int(input())
    for _ in range(t):
        _ = int(input())
        a = list(map(int, input().split()))
        solve(a)
    
if __name__ == "__main__":
    main()