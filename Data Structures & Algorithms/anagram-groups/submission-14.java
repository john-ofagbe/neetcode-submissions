class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagrams = new ArrayList<>();
        Map<String, List<String>> output = new HashMap<>();

        for (String str: strs) {
            Map<Character, Integer> charMap = new HashMap<>();
            for (char c: str.toCharArray()) {
                charMap.put(c, charMap.getOrDefault(c, 0) + 1);
            }
            String key = charMap.toString();
            if (output.containsKey(key)) {
                output.get(key).add(str);
            } else {
                List<String> arrayList = new ArrayList<>();
                arrayList.add(str);
                output.put(key, arrayList);
            }
        }
        return new ArrayList<>(output.values());
    
        
    }
}
