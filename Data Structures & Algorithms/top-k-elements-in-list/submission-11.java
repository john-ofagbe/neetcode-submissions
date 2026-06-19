class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        int[] output = new int[k];

        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int key: map.keySet()) {
            maxHeap.add(key);
        }

        for (int i = 0; i < k; i++) {
            output[i] = maxHeap.poll();
        }

        return output;
    }
}
