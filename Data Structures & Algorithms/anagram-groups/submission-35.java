class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(); 

        for (String str: strs) {
            int[] charCount = new int[26];
            for (char c: str.toCharArray()) {
                charCount[c - 'a']++;
            }
            map.computeIfAbsent(Arrays.toString(charCount), k -> new ArrayList()).add(str);
        }
        return new ArrayList(map.values());
    }
}
