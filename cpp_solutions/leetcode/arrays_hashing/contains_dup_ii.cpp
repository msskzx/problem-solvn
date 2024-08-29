// https://leetcode.com/problems/contains-duplicate-ii/

#include <set>
#include <vector>
using namespace std;

class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        set<int> uniq;
        int i = 0;
        for (int j = 0; j < nums.size(); j++) {
            if (j - i > k) {
                uniq.erase(nums[i]);
                i++;
            }
            if (uniq.find(nums[j]) != uniq.end()) {
                return true;
            }
            uniq.insert(nums[j]);
        }

        return false;
    }
};