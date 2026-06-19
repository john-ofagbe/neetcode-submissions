class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int valueA = 0;
        for (String token: tokens) {
            
            switch (token) {
                case "+":
                    stack.push(Integer.valueOf(stack.pop()) + Integer.valueOf(stack.pop()));
                    break;

                case "-":
                    stack.push(-Integer.valueOf(stack.pop()) + Integer.valueOf(stack.pop()));
                    break;

                case "*":
                    stack.push(Integer.valueOf(stack.pop()) * Integer.valueOf(stack.pop()));
                    break;

                case "/":
                    valueA = Integer.valueOf(stack.pop());
                    stack.push(Integer.valueOf(stack.pop())/valueA);
                break;

                default: 
                    stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }
}
