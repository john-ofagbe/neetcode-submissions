class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0; 
        Map<Character, Integer> map = new HashMap<>(); 

        int left = 0; 

        for (int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);
            if (map.containsKey(currChar)) {
                left = Math.max(left, map.get(currChar) + 1);
            }
            map.put(currChar, right);
            longestSubstring = Math.max(longestSubstring, right - left + 1);
        }

        return longestSubstring;
    }
}
