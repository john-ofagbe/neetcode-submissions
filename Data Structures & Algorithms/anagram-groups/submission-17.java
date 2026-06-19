class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagrams = new ArrayList<>();
        Map<String, List<String>> group = new HashMap<>();
        Map<Character, Integer> charMap;
        for (String str: strs) {
            charMap = new HashMap();
            for (char c: str.toCharArray()) {
                charMap.put(c, charMap.getOrDefault(c, 0) + 1);
            }
            String key = charMap.toString();
            group.computeIfAbsent(key, k -> new ArrayList()).add(str);
        }

        return new ArrayList(group.values());

        //return groupAnagrams;

    }
}
