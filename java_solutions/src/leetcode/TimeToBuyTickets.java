// https://leetcode.com/problems/time-needed-to-buy-tickets/description/

class Solution {
    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
        var res = 0;
        for (i in tickets.indices) {
            if (i <= k) {
                res += minOf(tickets[i], tickets[k]);
            } else {
                res += minOf(tickets[i], tickets[k] - 1);
            }
        }
        return res;
    }
}