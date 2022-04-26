class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] count = new int[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            count[i] = sentences[i].split(" ").length - 1;
        }
        int max = count[0];
        for (int i = 0; i < sentences.length; i++) {
            if (max < count[i]) {
                max = count[i];
            }
        }
        return max+1;
    }
}