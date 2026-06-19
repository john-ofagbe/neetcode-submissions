class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagrams = new ArrayList<>();
        Map<String, List<String>> output = new HashMap<>();

        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            output.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(output.values());
    
        
    }
}
