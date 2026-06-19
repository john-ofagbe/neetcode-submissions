class Solution {

    public static List<List<String>> groupAnagrams(String[] strs) {
    
        List<List<String>> groupAnagrams = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str: strs) {
            boolean isAnagram = false;
            for(Map.Entry entry: map.entrySet()) {
                String key = (String) entry.getKey();
                isAnagram = isAnagram(key, str);
                if(isAnagram) {
                    List<String> list = map.get(key);
                    list.add(str);
                    map.put(key, list);
                    break;
                }
            }

            if(!isAnagram) {
                List<String> newList = map.getOrDefault(str, new ArrayList<String>());
                newList.add(str);
                map.put(str, newList);
            }
            
        }
        
        for(Map.Entry entry: map.entrySet()) {
            groupAnagrams.add((List<String>)entry.getValue());
        }

        return groupAnagrams;
    }

    public static boolean isAnagram(String strA, String strB) {
        if (strA.length() != strB.length()) return false;
        
        Map<Character, Integer> map = new HashMap<>();

        for (Character c: strA.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character c: strB.toCharArray()) {
            if (map.get(c) == null) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"act", "pots", "tops", "cat", "stop", "hat"};
        groupAnagrams(strs);
    }
}
