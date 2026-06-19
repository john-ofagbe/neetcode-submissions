class Solution {
    String alphanumeric = "ABCDEFGHIJLKMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    public boolean isPalindrome(String _s) {
        int left = 0; 
        int right = _s.length() - 1; 
        String s = _s.toLowerCase();

        while (left < right) {
            if (!alphanumeric.contains(s.charAt(left)+"")) {
                left++;
                continue;
            }
            if (!alphanumeric.contains(s.charAt(right)+"")) {
                right--;
                continue;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
