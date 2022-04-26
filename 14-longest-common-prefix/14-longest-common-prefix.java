class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null && strs.length ==  0) { return ""; }
        Arrays.sort(strs);
        int count = 0;
        String f = strs[0];
        String l = strs[strs.length-1];
        for (int i = 0; i < f.length(); i++) {
            if (f.charAt(count) == l.charAt(count)) {
                count++;
            }
            else { break; }
        }
        if (count == 0) {
            return "";
        }
        return f.substring(0, count);
    }
}