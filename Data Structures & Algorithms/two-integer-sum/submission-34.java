class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        Map<Integer, Integer> map = new HashMap<>(); 

        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                output[0] = map.get(x);
                output[1] = i;
            }
            map.put(nums[i], i);
        }

        return output;
    }
}
