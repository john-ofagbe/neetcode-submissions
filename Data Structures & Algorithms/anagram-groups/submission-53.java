class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grouped = new HashMap<>();

        for (String str: strs) {
            int[] chars = new int[26];
            for (char c: str.toCharArray()) {
                chars[c - 'a']++;
            }
            grouped.computeIfAbsent(Arrays.toString(chars), k -> new ArrayList()).add(str);
        }
        return new ArrayList(grouped.values());
    }
}
