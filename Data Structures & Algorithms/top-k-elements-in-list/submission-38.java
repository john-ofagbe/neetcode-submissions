class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>(); 
        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> freqMap.get(a) - freqMap.get(b));
        int[] output = new int[k];

        //populate frequency map
        for (int num: nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int num: freqMap.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) minHeap.poll();
        }

        for (int i = k - 1; i >= 0; i--) {
            output[i] = minHeap.poll();
        }

        return output;

    }
}
