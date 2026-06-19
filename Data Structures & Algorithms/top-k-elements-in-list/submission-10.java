class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        int[] freq = new int[k];

        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry entry: map.entrySet()) {
            queue.add((int) entry.getKey());
        }

        for (int i = 0; i < k; i++) {
            freq[i] = queue.poll();
        }

        return freq;

    }
}
