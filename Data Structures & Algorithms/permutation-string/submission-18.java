class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] s1Chars = new int[26];
        for (char c: s1.toCharArray()) {
            s1Chars[c - 'a']++;
        }
        String s1Key = Arrays.toString(s1Chars);

        int left = 0; 

        for (int right = 0; right < s2.length(); right++) {
            if (right - left + 1 == s1.length()) {
                int[] windowChars = new int[26];
                for(int i = left; i <= right; i++) {
                    windowChars[s2.charAt(i) - 'a']++;
                }
                left++;
                if (s1Key.equals(Arrays.toString(windowChars))) {
                    return true;
                }
                
            }
        }

        return false;
    }
}
