class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> indicies = new Stack<>(); 
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!indicies.isEmpty() && temperatures[i] > temperatures[indicies.peek()]) {
                int prevIndex = indicies.pop(); 
                result[prevIndex] = i - prevIndex;
            }
            indicies.push(i);
        }
        return result;
    }
}
