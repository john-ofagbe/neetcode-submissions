class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] charsCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char sChar = Character.toLowerCase(s.charAt(i));
            char tChar = Character.toLowerCase(t.charAt(i));
            charsCount[sChar - 'a']++;
            charsCount[tChar - 'a']--;
        }

        for (int c: charsCount) {
            if (c != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("BABA", "ABBA"));
        System.out.println(isAnagram("bAbA", "ABBAs"));
    }
}
