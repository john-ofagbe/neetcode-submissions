class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grouped = new HashMap<>();

        for (String str: strs) {
            int[] charCount = new int[26];
            for (char c: str.toCharArray()) {
                charCount[c - 'a']++;
            }
            grouped.computeIfAbsent(Arrays.toString(charCount), k -> new ArrayList()).add(str);
        }

        return new ArrayList(grouped.values());
    }
}
