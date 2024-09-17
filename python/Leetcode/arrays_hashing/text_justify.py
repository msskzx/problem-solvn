# https://leetcode.com/problems/text-justification/

class Solution(object):
    def fullJustify(self, words, max_width):
        """
        :type words: List[str]
        :type maxWidth: int
        :rtype: List[str]
        """
        
        word_count = 0
        res = []
        
        i = 0
        line = []
        while i < len(words):
            line = []
            char_count = 0
            word_count = 0
            while i < len(words) and char_count + len(words[i]) + len(line) <= max_width:
                line.append(words[i])
                char_count += len(words[i])
                word_count += 1
                i += 1

            rem_char = max_width - char_count
            num_spaces = rem_char // max(word_count - 1, 1)
            remainder = rem_char % max(word_count - 1, 1)
            for j in range(max(1, len(line) - 1)):
                line[j] += " " * num_spaces
                if remainder:
                    line[j] += " "
                    remainder -= 1
            
            res.append("".join(line))
        
        last_line = res[-1].split()
        last_line = " ".join(last_line)
        rem_char = max_width - len(last_line)
        res[-1] =  last_line + (" " * rem_char)
        return res