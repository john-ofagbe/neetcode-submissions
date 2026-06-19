class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String str: strs) {
            int[] chars = new int[26];
            for (char c: str.toCharArray()) {
                chars[c - 'a']++;
            }
            String key = Arrays.toString(chars);
            groups.computeIfAbsent(key, k -> new ArrayList()).add(str);
        }
        
        return new ArrayList(groups.values());
    }
}
