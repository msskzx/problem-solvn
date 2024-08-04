// https://leetcode.com/problems/unique-email-addresses/

class Solution {
public:
    int numUniqueEmails(vector<string>& emails) {
        int c = 0;
        set<string> s;

        for (int i = 0; i < emails.size(); i++) {
            string email = emails[i];
            int ind = email.find('@');
            string local = email.substr(0, ind);
            string domain = email.substr(ind+1);
            string ans = "";
            for (int j = 0; j < local.size(); j++) {
                if (local[j] == '+') {
                    break;
                }
                if (local[j] != '.') {
                    ans += local[j];
                }
            }
            local = ans;

            s.insert(local + "@" + domain);
        }

        return s.size();
    }
};