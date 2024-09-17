def solve(a):
    res = []
    k = len(set(a))
    uniq = set()
    
    def dfs(cur, i):
        if len(cur) == k:
            res.append(cur.copy())
            return
        if i > len(a) - 1:
            return
        
        if a[i] not in uniq:
            uniq.add(a[i])
            cur.append(a[i])
            dfs(cur, i + 1)
            cur.pop()
            uniq.remove(a[i])
            
        dfs(cur, i + 1)
    
    dfs([], 0)
    
    mn = res[0]
    idx = 0
    for j, x in enumerate(res):
        for i in range(k):
            x[i] = x[i] * -1 if i % 2 == 0 else x[i]
        if mn > x:
            mn = x
            idx = j
        mn = min(mn, x)

    print(k)
    for i in range(k):
        res[idx][i] = res[idx][i] * -1 if i % 2 == 0 else res[idx][i]
        if i < k - 1:
            print(res[idx][i], end=" ")
        else:
            print(res[idx][i])
    
    
def main():
    t = int(input())
    for _ in range(t):
        _ = int(input())
        a = list(map(int, input().split()))
        solve(a)


if __name__ == "__main__":
    main()