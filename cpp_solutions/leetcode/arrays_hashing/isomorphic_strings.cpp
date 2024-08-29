// https://leetcode.com/problems/isomorphic-strings/

#include <unordered_map>
#include <string>
using namespace std;

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if (s.length() != t.length()) {
            return false;
        }
        unordered_map<char, char> a;
        unordered_map<char, char> b;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s[i];
            char c2 = t[i];

            if ((a.count(c1) && a[c1] != c2) || (b.count(c2) && b[c2] != c1)) {
                return false;
            }
            a[c1] = c2;
            b[c2] = c1;
        }
        return true;
    }
};