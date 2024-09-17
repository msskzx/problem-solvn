def max_stick_occurrence(lengths):
    freq = [0] * 101
    for x in lengths:
        freq[x] += 1
    res = 0
    for x in freq:
        res += (x // 3)
    return res

def main():
    t = int(input())
    res = []
    for _ in range(t):
        _ = int(input())
        lengths = list(map(int, input().split()))
        res.append(max_stick_occurrence(lengths))
    
    for x in res:
        print(x)

if __name__ == "__main__":
    main()