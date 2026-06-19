class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); 
        int[] output = new int[k];

        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i: map.keySet()) {
            minHeap.offer(i);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        for (int i = k - 1; i >= 0; i--) {
            output[i] = minHeap.poll();
        }

        return output;
    }
}
