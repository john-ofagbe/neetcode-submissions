class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int left = 0;
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            s1Map.put(c1, s1Map.getOrDefault(c1, 0) + 1);
            s2Map.put(c2, s2Map.getOrDefault(c2, 0) + 1);
        }


        if (s1Map.equals(s2Map)) {
            return true;
        }
    

        for (int right = s1.length() ; right < s2.length(); right++) {
            char rightChar = s2.charAt(right);
            s2Map.put(rightChar, s2Map.getOrDefault(rightChar, 0) + 1);
            
            char leftChar = s2.charAt(left);
            s2Map.put(leftChar, s2Map.get(leftChar) - 1);
            
            if (s2Map.get(leftChar) == 0) {
                s2Map.remove(leftChar);
            } 
            
            left++;

            if (s1Map.equals(s2Map)) return true;
        }

        return false;

    }
}
