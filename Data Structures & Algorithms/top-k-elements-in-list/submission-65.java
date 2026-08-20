class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> freqMap = new HashMap<>(); 
        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> freqMap.get(a) - freqMap.get(b)); 

        for (int i : nums) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        } 

        for (int i: freqMap.keySet()) {
            minHeap.offer(i);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        for (int i = k -1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;


    }
}
