class Solution {
    private String alphaNumericCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijlkmnopqrstuvwxyz0123456789";
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();

        while(left <= right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!alphaNumericCharacters.contains(leftChar+"")) {
                left++;
                continue;
            }
            if (!alphaNumericCharacters.contains(rightChar+"")) {
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
