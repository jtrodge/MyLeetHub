class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        // Traverse through String s and String t
        for (int i = 0; i < t.length() && j < s.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
        }
        // Once j reaches the length of String s, the subsequence is true
        return (j == s.length());
    }
}