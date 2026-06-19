class Solution {
    String alphanumeric = "ABCDEFGHIJLKMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    public boolean isPalindrome(String _s) {
        int left = 0; 
        int right = _s.length() - 1; 
        String s = _s.toLowerCase();
        char test = s.charAt(0);
        System.out.println((int)'A');
        System.out.println((int)'Z');
        System.out.println((int)'a');
        System.out.println((int)'z');
        System.out.println((int)'0');
        System.out.println((int)'9');
        
        while (left < right) {
            if (!isAlphaNumeric(s.charAt(left))) {
                left++;
                continue;
            }
            if (!isAlphaNumeric(s.charAt(right))) {
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

    private boolean isAlphaNumeric(char c) {
        int intVal = (int) c;
        if (
            (intVal >= 65 && intVal <=90) || //A - Z
            (intVal >= 97 && intVal <=122) || //a - z
            (intVal >= 48 && intVal <=57)  //0 - 9
        ) {
            return true;
        }
        return false;
    }
}
