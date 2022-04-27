class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] copyNums = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if ((i % 2) == 0 && j <= n) {
                copyNums[i] = nums[j];
                j++;
            }
        }
        for (int i = 0, j = n; i < nums.length; i++) {
            if ((i % 2) != 0) {
                copyNums[i] = nums[j];
                j++;
            }
        }
        return copyNums;
    }
}