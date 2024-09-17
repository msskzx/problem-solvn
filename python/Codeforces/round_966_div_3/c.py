def solve(a, s):
    if len(a) != len(s):
        print("NO")
        return
    nums = {}
    ch = {}

    for i, c in enumerate(s):
        if a[i] not in nums and c not in ch:
            nums[a[i]] = c
            ch[c] = a[i]
        elif a[i] in nums and nums[a[i]] == c and c in ch and ch[c] == a[i]:
            pass
        else:
            print("NO")
            return
        
    print("YES")


def main():
    t = int(input())
    for _ in range(t):
        _ = int(input())
        a = list(map(int, input().split()))
        n = int(input())
        for _ in range(n):
            s = input()
            solve(a, s)
    
if __name__ == "__main__":
    main()