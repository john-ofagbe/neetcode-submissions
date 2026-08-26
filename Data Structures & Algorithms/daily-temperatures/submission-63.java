class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>(); //indicies 

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return result;

    }
}

/*

i = 0, 
i = 1, 38 > 30 true, 
i = 2, 
stack
[2]

result[0] = 1 - 0 = 1
result[1] = 0
result[2] = 0
result[3] = 0
result[4] = 0
result[5] = 0
result[6] = 0
 
*/