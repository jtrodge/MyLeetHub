class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> temp;
        int num1;
        int num2;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (i == j) {
                    continue;
                }
                else {
                    if (nums[i] + nums[j] == target) {
                        num1 = i;
                        num2 = j;
                    }
                }
            }
        }
        temp.push_back(num1);
        temp.push_back(num2);
        return temp;
    }
};