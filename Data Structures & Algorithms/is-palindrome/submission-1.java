class Solution {
    private String alphabets = "ABCDEFGHIJLKMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    public boolean isPalindrome(String _s) {
        String s = _s.toLowerCase();
        int left = 0; 
        int right = s.length() - 1;
    
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            System.out.println("leftChar: " + leftChar + " rightChar:" + rightChar);
            if (!isAlphabet(leftChar)) {
                left++;
                continue;
            }
            if (!isAlphabet(rightChar)) {
                right--;
                continue;
            }
            System.out.println("leftChar: " + leftChar + " rightChar: " + rightChar);
            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isAlphabet(char c) {
        return alphabets.contains(c+"");
    }
}
