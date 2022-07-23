class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> word = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (word.containsKey(s.charAt(i))) {
                if (t.charAt(i) != word.get(s.charAt(i))) {
                    return false;
                }
            }
            else {
                if (word.containsValue(t.charAt(i))) {
                    return false;
                }
                word.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}