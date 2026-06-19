class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); 

        for (char c: s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false; //closing bracket with no corresponding opening bracket
                char top = stack.pop(); 
                if (
                    (top == '(' && c != ')') ||
                    (top == '{' && c != '}') ||
                    (top == '[' && c != ']')
                ) {
                    return false; //opening bracket doesn't match closing bracket
                }
            }
        }
        return stack.isEmpty(); //opening bracket with no closing bracket
    }
}
