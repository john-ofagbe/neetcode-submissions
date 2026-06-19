class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] items = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int n: map.keySet()) {
            maxHeap.add(n);
        }

        for (int i = 0; i < k; i++) {
            items[i] = maxHeap.poll();
        }

        return items;
    }
}
