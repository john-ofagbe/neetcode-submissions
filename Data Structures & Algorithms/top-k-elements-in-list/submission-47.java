class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] output = new int[k];
        Map<Integer, Integer> freqMap = new HashMap<>(); 
        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> freqMap.get(a) - freqMap.get(b));

        for (int n: nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        for (int n: freqMap.keySet()) {
            minHeap.offer(n); 
            if (minHeap.size() > k) minHeap.poll();
        }

        for (int i = k - 1; i >= 0; i--) {
            output[i] = minHeap.poll();
        }

        return output;
    }
}
