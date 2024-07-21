"""
https://www.hackerrank.com/challenges/nested-list/
"""

if __name__ == '__main__':
    a = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        a.append([name, score])
    a = sorted(a, key=lambda x: (-x[1], x[0]))
    mn2 = a[0][1]
    for i in range(len(a) - 2, -1, -1):
        if a[i][1] != a[-1][1]:
            mn2 = a[i][1]
            break
    for i in range(len(a)-1):
        if a[i][1] == mn2:
            print(a[i][0])
            
