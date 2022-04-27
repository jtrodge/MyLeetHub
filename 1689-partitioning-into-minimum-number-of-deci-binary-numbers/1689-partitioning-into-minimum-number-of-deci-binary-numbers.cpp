class Solution {
public:
    int minPartitions(string n) {
        char best = '0';
        for (char c : n) {
            if (c > best) {
                best = c;
            }
        }
        return best - '0';
    }
};