class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') { //push opening brackets
                stack.push(c);
            }
            else {
                if (stack.empty()) {
                    return false;
                }
                char top = stack.pop();

                if (
                    (c == ')' && top != '(') || 
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')
                ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
