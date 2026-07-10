class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] results = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>(); //stack up the indices here

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop(); 
                results[prevIndex] =  i - prevIndex;
            }
            stack.push(i);
        }
        return results;
    }
}
