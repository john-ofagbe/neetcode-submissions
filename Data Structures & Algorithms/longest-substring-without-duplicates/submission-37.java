class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0;
        Map<Character, Integer> charFreq = new HashMap<>();

        int left = 0; 
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right); 
            if (charFreq.containsKey(currentChar)) { 
                left = Math.max(left, charFreq.get(currentChar) + 1);
            }
            charFreq.put(currentChar, right);
            longestSubstring = Math.max(longestSubstring, right - left + 1);
        }
        return longestSubstring;
    }
}
