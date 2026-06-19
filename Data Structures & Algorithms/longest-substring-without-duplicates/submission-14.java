class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int longestLength = 0; 
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }
            map.put(currentChar, right);

            longestLength = Math.max(longestLength, right - left + 1);
        }
        return longestLength;
    }
}
