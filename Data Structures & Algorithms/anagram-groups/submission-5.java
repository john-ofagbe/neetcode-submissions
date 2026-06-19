class Solution {

    public static List<List<String>> groupAnagrams(String[] strs) {
    
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);               // sort characters
            String key = new String(chars);   // canonical form

            map.computeIfAbsent(key, k -> new ArrayList<>())
               .add(s);
        }

        return new ArrayList<>(map.values());
    
    }

    public static boolean isAnagram(String strA, String strB) {
        if (strA.length() != strB.length()) return false;
        
        Map<Character, Integer> map = new HashMap<>();

        for (Character c: strA.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character c: strB.toCharArray()) {
            if (map.get(c) == null) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"act", "pots", "tops", "cat", "stop", "hat"};
        groupAnagrams(strs);
    }
}
