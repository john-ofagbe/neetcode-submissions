class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();

        for (char c: s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0; 
        for(int right = 0; right < s2.length(); right++) {
            char rightChar = s2.charAt(right);
            windowMap.put(rightChar, windowMap.getOrDefault(rightChar, 0) + 1);

            if (right - left + 1 > s1.length()) { 
                char leftChar = s2.charAt(left);
                windowMap.put(leftChar, windowMap.getOrDefault(leftChar, 0) - 1);
                if (windowMap.get(leftChar) == 0) {
                    windowMap.remove(leftChar);
                }
                left++;
            }

            if (windowMap.equals(map)) {
                return true;
            }
        }

        return false;
        
    }
}
