class Solution {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();

        while(left <= right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!isAlphaNumeric(leftChar)) {
                left++;
                continue;
            }
            if (!isAlphaNumeric(rightChar)) {
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

    private boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <='z') || (c >='A' && c <='Z') || (c >= '0' && c <='9');
    }

}
