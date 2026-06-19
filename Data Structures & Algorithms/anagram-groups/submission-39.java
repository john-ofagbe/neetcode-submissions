class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grouped = new HashMap<>(); 

        for (String str: strs) {
            int[] count = new int[26];
            for (char c: str.toCharArray()) {
                count[c - 'a']++;
            }
            grouped.computeIfAbsent(Arrays.toString(count), v -> new ArrayList()).add(str);
        }

        return new ArrayList(grouped.values());
    }
}
