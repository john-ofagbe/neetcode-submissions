class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grouped = new HashMap<>();

        for (String str: strs) {
            int[] charsCount = new int[26];
            for (char c: str.toCharArray()) {
                charsCount[c - 'a']++;
            }
            grouped.computeIfAbsent(Arrays.toString(charsCount), k -> new ArrayList()).add(str);
        }
        return new ArrayList(grouped.values());
    }
}
