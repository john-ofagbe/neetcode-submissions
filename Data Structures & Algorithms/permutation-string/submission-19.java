class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] s1Chars = new int[26];
        int[] windowChars = new int[26];
        for (char c: s1.toCharArray()) {
            s1Chars[c - 'a']++;
        }
        String s1Key = Arrays.toString(s1Chars);

        int left = 0; 

        for (int right = 0; right < s2.length(); right++) {
            windowChars[s2.charAt(right) - 'a']++;
            
            //shrink window if size exceeds s1 length
            if (right - left + 1 > s1.length()) {
                windowChars[s2.charAt(left) - 'a']--;
                left++;
            }
            if (Arrays.equals(s1Chars, windowChars)) {
                return true;
            }
        }

        return false;
    }
}
