class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        
        for (String token: tokens) {
            switch (token) {
                case "+":
                    int sum = Integer.valueOf(stack.pop()) + Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(sum));
                    break;

                case "-":
                    int minA = Integer.valueOf(stack.pop());
                    int minB = Integer.valueOf(stack.pop());
                    int subtraction = minB - minA;
                    stack.push(String.valueOf(subtraction));
                    break;

                case "*":
                    int timesA = Integer.valueOf(stack.pop());
                    int timesB = Integer.valueOf(stack.pop());
                    int multiplication = timesA * timesB;
                    stack.push(String.valueOf(multiplication));
                    break;

                case "/":
                    int valueA = Integer.valueOf(stack.pop());
                    int valueB = Integer.valueOf(stack.pop());
                    int division = valueB / valueA;
                    stack.push(String.valueOf(division));
                break;

                default: 
                    stack.push(token);
            }
        }

        return Integer.valueOf(stack.pop());
    }
}
