class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        List<Integer> list = new ArrayList<>(nums.length);
        for (int i: nums) {
            list.add(Integer.valueOf(i));
        }
        HashSet<Integer>set = new HashSet<Integer>(list);
        List<Integer>list2 = new ArrayList<Integer>(set);
        Collections.sort(list);
        Collections.sort(list2); 
        if (list.equals(list2)) {
            ans = false;
        }
        else { ans = true; }
        return ans;
    }
}