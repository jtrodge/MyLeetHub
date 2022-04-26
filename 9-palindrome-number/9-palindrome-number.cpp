class Solution {
public:
    bool isPalindrome(int x) {
        string reverseX = to_string(x);
        reverse (reverseX.begin(), reverseX.end());
        if (x < 0) { return false; }
        else {
            if (reverseX == to_string(x)) {
                return true;
            }
            else { return false; }
        }
    }
};