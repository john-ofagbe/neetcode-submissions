class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
    

        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int n: map.keySet()) {
            minHeap.offer(n); 
            if (minHeap.size() > k) minHeap.poll();
        }

        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
