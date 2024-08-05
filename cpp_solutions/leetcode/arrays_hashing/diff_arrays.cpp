// https://leetcode.com/problems/find-the-difference-of-two-arrays/

class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        set<int> a(nums1.begin(), nums1.end());
        set<int> b(nums2.begin(), nums2.end());
        vector<int> d1, d2;

        for (int x : a) {
            if (b.find(x) == b.end()) {
                d1.push_back(x);
            }
        }

        for (int x : b) {
            if (a.find(x) == a.end()) {
                d2.push_back(x);
            }
        }
        return {d1, d2};
    }
};