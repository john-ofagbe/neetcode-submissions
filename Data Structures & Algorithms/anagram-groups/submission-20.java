class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            Map<Character, Integer> charMap = new HashMap<>();
            for (char c: str.toCharArray()) {
                charMap.put(c, charMap.getOrDefault(c, 0) + 1);
            }
            String key = charMap.toString();
            map.computeIfAbsent(key, k -> new ArrayList()).add(str);
        }
        
        return new ArrayList(map.values());
    }
}
