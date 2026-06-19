class Solution {
    //1. if string s length != string t length return false

    //2. use a hashmap to count the number of characters for string s 
    /*
        r = 2
        a = 1
        c = 2
        e = 1

    3. iterate through string t

    4. check if hashmap contains character 
       a. if false, return false
       b. i. subtract the number of character from hashmap
          ii. check if total number of character in hashmap is zero, then remove the item
    
    5. after the iteration is complete if hashmap is empty, return true, else return false
    */
    
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false; 
        }

        Map<Character, Integer> map = new HashMap<>();

        for (Character c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c: t.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println("isAnagram: " + isAnagram("racecar", "carrace"));
    }
}
