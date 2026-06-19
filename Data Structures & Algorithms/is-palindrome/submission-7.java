class Solution {
    private String alphaNumericString = "ABCDEFGHIJLKMNOPQRSTUVWXYZabcdefghijlkmnopqrstuvwxyz0123456789";
    public boolean isPalindrome(String _s) {
        String s = _s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!alphaNumericString.contains(leftChar+"")) {
                left++;
                continue;
            }
            if (!alphaNumericString.contains(rightChar+"")) {
                right--;
                continue;
            }
            if (leftChar != rightChar) {
                return false;
            }
            right--;
            left++;
        }

        return true;
    }
}
