class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>(); //store the indices in a stack
        int[] output = new int[temperatures.length]; //defaults to 0;

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop(); 
                output[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return output;

    }
}
