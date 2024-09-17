"""
https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list
"""

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    mx = mn = -200
    for x in arr:
        if x > mx:
            mn = mx
            mx = x
        elif x > mn and x != mx:
            mn = x
    print(mn)
    