class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0; 
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            if (map.containsKey(rightChar)) {
                left = Math.max(left, map.get(rightChar) + 1);
            }
            map.put(rightChar, right);
            longestSubstring = Math.max(longestSubstring, right - left + 1);
        }

        return longestSubstring;
    }
}
