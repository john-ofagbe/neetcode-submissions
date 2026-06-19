class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int n = 0; n < temperatures.length; n++) {
            while (!stack.isEmpty() && temperatures[n] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = n - prevIndex;
            }
            stack.push(n);
        }

        return result;
    }
}
