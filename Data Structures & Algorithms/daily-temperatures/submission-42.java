class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length]; // 0s by default;
        Stack<Integer> stack = new Stack<>(); //store indices in this stack
        
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
