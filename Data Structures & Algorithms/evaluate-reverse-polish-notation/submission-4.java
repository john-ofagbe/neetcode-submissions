class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token: tokens) {
            int valueA = 0;
            switch (token) {
                case "+":
                    stack.push(Integer.valueOf(stack.pop()) + Integer.valueOf(stack.pop()));
                    break;

                case "-":
                    valueA = Integer.valueOf(stack.pop());
                    stack.push(Integer.valueOf(stack.pop()) - valueA);
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
