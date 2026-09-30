class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grouped = new HashMap<>();
        for (String str: strs) {
            int[] countChars = new int[26];
            for (char c: str.toCharArray()) {
                countChars[c - 'a']++;
            }
            grouped.computeIfAbsent(Arrays.toString(countChars), v -> new ArrayList()).add(str);
        }
        return new ArrayList(grouped.values());
    }
}
