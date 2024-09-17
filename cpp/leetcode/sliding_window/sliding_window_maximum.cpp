/* 
https://leetcode.com/problems/sliding-window-maximum/
*/

#include <vector>
#include <deque>
using namespace std

class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        vector<int> res;
        deque<int> q;
        for (int r = 0; r < nums.size(); r++) {
            if(!q.empty() && q.front() < r - k + 1) {
                q.pop_front();
            }
            while (!q.empty() && nums[q.back()] < nums[r]) {
                q.pop_back();
            }
            q.push_back(r);
            if (r + 1 >= k) {
                res.push_back(nums[q.front()]);
            }
        }
        return res;
        
    }
};