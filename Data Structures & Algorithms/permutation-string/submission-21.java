class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        int left = 0; 

        for (char c: s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        for (int right = 0; right < s2.length(); right++) {
            s2Count[s2.charAt(right) - 'a']++;
            if (right - left + 1 > s1.length()) {
                s2Count[s2.charAt(left) - 'a']--;
                left++;
            }
            if (Arrays.equals(s1Count, s2Count)) {
                return true;
            }

        }
        return false;
    }
}
