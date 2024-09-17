def solve(target, word):
    j = 0
    i = 0
    gen = ''
    flag = True
    while i < len(word):
        while j < len(target):
            if word[i] == target[j] or target[j] == '?':
                gen += word[i]
                i += 1
                j += 1
                break
            else:
                gen += target[j]
                j += 1
        if j >= len(target) and i < len(word):
            flag = False
            break
    if flag:
        for i in range(len(gen), len(target)):
            if target[i] == '?':
                gen += 'a'
            else:
                gen += target[i]
            
        print('YES')
        print(gen)
    else:
        print('NO')

def main():
    t = int(input())
    for _ in range(t):
        target = input()
        word = input()
        solve(target, word)
    
if __name__ == "__main__":
    main()