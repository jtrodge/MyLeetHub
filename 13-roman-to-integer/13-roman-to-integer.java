class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNum = new HashMap<Character, Integer>();
        
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);
        
        int answer = 0;
        int prev = 0;
        for (char i : s.toCharArray()) {
            int current = romanNum.get(i);
            if (current > prev) {
                answer -= prev;
                answer += current - prev;
            }
            else {
                answer += current;
            }
            prev = current;
            i++;
        }
        return answer;
    }
}