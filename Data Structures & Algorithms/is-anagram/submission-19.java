class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        //int[] charsCount = new int[26];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            //charsCount[s.charAt(i) - 'a']++;
            //charsCount[t.charAt(i) - 'a']--;
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        /*for (int c: charsCount) {
            if (c != 0) return false;
        }*/
        for (int count: map.values()) {
            if (count != 0) return false;
        }
        return true;
    }
}
