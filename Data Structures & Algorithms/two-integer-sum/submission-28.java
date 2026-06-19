class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); 
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int toFind = target - nums[i];
            if (map.containsKey(toFind)) {
                output[0] = map.get(toFind);
                output[1] = i;
            }
            map.put(nums[i], i);
        }

        return output;
    }
}
