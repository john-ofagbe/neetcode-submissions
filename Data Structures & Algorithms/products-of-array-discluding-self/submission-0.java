class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            result[i] = getProducts(i, nums);
        }
        return result;
    }

    private int getProducts(int index, int[] nums) {
        int product = 1;
        for(int i = 0; i < nums.length; i++) {
            if(i != index) {
                product*=nums[i];
            }
        }
        return product;
    }
}  
