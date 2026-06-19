class Solution {
    private String alphaNumeric = "ABCDEFGHIJLKMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        String lowerCase = s.toLowerCase();
        while (left < right) {
            char leftChar = lowerCase.charAt(left);
            char rightChar = lowerCase.charAt(right);
            if (!alphaNumeric.contains(leftChar+"")) {
                left++;
                continue;
            } 
            if (!alphaNumeric.contains(rightChar+"")) {
                right--;
                continue;
            } 
            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
