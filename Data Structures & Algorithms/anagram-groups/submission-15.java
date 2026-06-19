class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagrams = new ArrayList<>();
        Map<String, List<String>> output = new HashMap<>();

        for (String str: strs) {
            Map<Character, Integer> charMap = new HashMap<>();
            for (char c: str.toCharArray()) {
                charMap.put(c, charMap.getOrDefault(c, 0) + 1);
            }
            String key = charMap.toString();
            output.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(output.values());
    
        
    }
}
