class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        if (operations.size() == 0) { return 0; }
        int count = 0;
        for (int i = 0; i < operations.size(); i++) {
            if (operations[i][1] == '+') { count++; }
            else if (operations[i][1] == '-') {
                count--;
            }
        }
        return count;
    }
};