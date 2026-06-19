class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String str: strs) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c: str.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0 ) + 1);
            }
            groups.computeIfAbsent(map.toString(), k -> new ArrayList()).add(str);
        }

        return new ArrayList(groups.values());
    }
}
