
/*
x + y = z



*/
class Solution {
    //brute force solution
    /*public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }*/

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (map.get(remainder) != null) {
                return new int[]{map.get(remainder), i};
            }
            map.put(nums[i], i);
            /*for(int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }*/
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = new int[] {5, 5};
        System.out.println(Arrays.toString(twoSum(nums, 10)));
    }
}
