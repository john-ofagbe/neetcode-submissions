class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            Map<Character, Integer> charMap = new HashMap<>();
            for (char c: str.toCharArray()) {
                charMap.put(c, charMap.getOrDefault(c, 0) + 1);
            }
            String key = charMap.toString();
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        
        return new ArrayList(map.values());
    }
}
