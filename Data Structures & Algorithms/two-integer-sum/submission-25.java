class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); 
        int[] sums = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                sums[0] = map.get(x);
                sums[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return sums;
    }
}
