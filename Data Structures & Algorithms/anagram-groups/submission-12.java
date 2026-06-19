class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagrams = new ArrayList<>();
        
        Map<String, List<String>> group = new HashMap<>();
        for (String str: strs) {
            String characterMap = CharacterMap(str);
            if (group.containsKey(characterMap)) {
                group.get(characterMap).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                group.put(characterMap, list);
            }
        }
        for (Map.Entry entry: group.entrySet()) {
            groupAnagrams.add((ArrayList)entry.getValue());
        }
        return groupAnagrams;
    }

    private String CharacterMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map.toString();
    }

}
