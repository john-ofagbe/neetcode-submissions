class Solution {

    public static List<List<String>> groupAnagrams(String[] strs) {
    
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            Map<Character, Integer> stringMap = new HashMap<>();
            for(char c: s.toCharArray()) {
                stringMap.put(c, stringMap.getOrDefault(c, 0) + 1);
            }
            String key = stringMap.toString();
            
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
            
        }

        return new ArrayList<>(map.values());
    
    }

}
