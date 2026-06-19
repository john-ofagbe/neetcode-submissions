class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0; 
        int longestSubstring = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (map.get(currentChar) != null) {
                left = Math.max(left, map.get(currentChar) + 1); 
            }
            map.put(currentChar, right);
            longestSubstring = Math.max(longestSubstring, right - left + 1);

        }
        return longestSubstring;
    }
}
