class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        ans = nums;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            ans[i] += (len * (ans[ans[i]] % len));
        }
        for (int i = 0; i < len; i++) {
            ans[i] /= len;
        }
        return ans;
    }
}