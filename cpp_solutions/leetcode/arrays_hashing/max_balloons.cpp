// https://leetcode.com/problems/maximum-number-of-balloons/

#include <map>
#include <string>
using namespace std;


class Solution {
public:
    int maxNumberOfBalloons(string text) {
        map<char, int> freq;

        for (char c : text) {
            freq[c]++;
        }

        int mn = INT_MAX;
        map<char, int> req = {
            {'b', 1},
            {'a', 1},
            {'l', 2},
            {'o', 2},
            {'n', 1},
        };

        for (char c : string("balon")) {
            if (freq.find(c) != freq.end()) {
                mn = min(mn, freq[c] / req[c]);
            } else {
                return 0;
            }
        }

        return mn == INT_MAX ? 0 : mn;
    }
};