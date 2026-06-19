class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];
        int[] windowCount = new int[26];

        for (char c: s1.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0; 

        for (int right = 0; right < s2.length(); right++) {
            windowCount[s2.charAt(right) - 'a']++;
            if (right - left + 1 > s1.length()) {
                windowCount[s2.charAt(left) - 'a']--;
                left++;
            }
            if (Arrays.equals(count, windowCount)) return true;
        }

        return false;
    }
}
