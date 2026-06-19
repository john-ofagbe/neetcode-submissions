class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0; 
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
        set.add(nums[i]);
        }

        for(int num: set) {
        int currentStreak = 1;
        int nextNum = num+1;
        while(set.contains(nextNum)) {
            currentStreak++;
            nextNum++;
        }
        longest = Math.max(longest, currentStreak);
        }

        return longest;
    }

    
}
