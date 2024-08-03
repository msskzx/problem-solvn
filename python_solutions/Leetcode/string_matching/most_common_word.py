"""
https://leetcode.com/problems/most-common-word/
"""

class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        a = re.split(r'[{}\s]+'.format(re.escape(string.punctuation)), paragraph)
        d = defaultdict(int)
        word = ''
        c = 0

        for x in banned:
            x = x.strip().lower()
            d[x] = float('-inf')
        for x in a:
            x = x.strip().lower()
            d[x] += 1
            if d[x] > c:
                c = d[x]
                word = x
        return word