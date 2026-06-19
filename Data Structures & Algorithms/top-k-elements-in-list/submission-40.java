class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); 
        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        int[] output = new int[k];

        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int n: map.keySet()) {
            minHeap.offer(n); 
            if (minHeap.size() > k) minHeap.poll(); //trim minHeap to size k
        }

        for (int i = k - 1; i >= 0; i--) {
            output[i] = minHeap.poll();
        }

        return output;

    }
}
