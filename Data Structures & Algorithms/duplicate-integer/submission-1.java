class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> finalSet = new HashSet<>();

        for(int num : nums) {
            if(finalSet.contains(num)) {
                return true;
            }
            finalSet.add(num);
        }

        return false;
    }
}