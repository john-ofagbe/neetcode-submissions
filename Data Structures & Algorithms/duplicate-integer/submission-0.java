class Solution {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for (int num: nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);    
        }
        return false;
    }

    public static void main(String[] args) {
        int[] testCase = new int[]{1, 2, 4};
        hasDuplicate(testCase);
    }
}