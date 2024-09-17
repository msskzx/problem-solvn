def min_sum(a, k):
    dp = [0] * len(a)
    for i in range(1, len(a) - 1):
        for j in range(1, k):
            dp[i][j] = min(a[i] + dp[i-1][j], a[i+1] + dp[i-1][j-1], a[i-1] + dp[i-1][j-1])
    
    return dp[-1][-1]

def main():
    t = int(input())
    res = []
    for _ in range(t):
        _, k = map(int, input().split())
        a = list(map(int, input().split()))
        res.append(min_sum(a, k))
    
    for x in res:
        print(x)

if __name__ == "__main__":
    main()