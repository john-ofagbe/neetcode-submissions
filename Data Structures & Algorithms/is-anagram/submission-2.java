class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();

        for (char c: s.toCharArray()) {
            mapA.put(c, mapA.getOrDefault(c, 0) + 1);
        }

        for (char c: t.toCharArray()) {
            mapB.put(c, mapB.getOrDefault(c, 0) + 1);
        }

        return mapA.equals(mapB);
    }
}
