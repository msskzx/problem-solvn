def min_sum(nums):
    nums.sort()
    a = nums[1]
    return abs(nums[0] - a) + abs(nums[1] - a) + abs(nums[2] - a)

def main():
    t = int(input())
    res = []
    for _ in range(t):
        nums = list(map(int, input().split()))
        res.append(min_sum(nums))
    
    for x in res:
        print(x)

if __name__ == "__main__":
    main()