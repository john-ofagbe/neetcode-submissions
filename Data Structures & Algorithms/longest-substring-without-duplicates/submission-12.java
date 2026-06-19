class Solution {
    //abc
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int longestSubstring = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            if (map.containsKey(current)) {
                left = Math.max(left, map.get(current) + 1);
            }
            map.put(current, right);

            longestSubstring = Math.max(longestSubstring, right - left + 1);

        }

        return longestSubstring;

    }
}
