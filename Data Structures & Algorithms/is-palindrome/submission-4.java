class Solution {
    private String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();

        while (left < right) {
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);
            if (!alphanumeric.contains(charLeft+"")) {
                left++; 
                continue;
            }
            if (!alphanumeric.contains(charRight+"")) {
                right--;
                continue;
            }
            if (charLeft != charRight) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }   
}
