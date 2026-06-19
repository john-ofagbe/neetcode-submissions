class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> numbers = new Stack<>();
        for (String token: tokens) {
            
            switch (token) {
                case "*":
                    numbers.push(numbers.pop() * numbers.pop());
                    break;

                case "+":
                    numbers.push(numbers.pop() + numbers.pop());
                    break;

                case "-":
                    int bSub = numbers.pop();
                    int aSub = numbers.pop();
                    numbers.push(aSub - bSub);
                    break;

                case "/":
                    int bDiv = numbers.pop();
                    int aDiv = numbers.pop();
                    numbers.push(aDiv / bDiv);
                    break;

                default: 
                    numbers.push(Integer.valueOf(token));
            }
        }
        return numbers.pop();
    }
}