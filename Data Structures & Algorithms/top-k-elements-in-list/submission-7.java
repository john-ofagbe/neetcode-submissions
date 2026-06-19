class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int[] mostFrequent = new int[k];
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int num: map.keySet()) {
            queue.add(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            mostFrequent[i] = queue.poll();
        }

        return mostFrequent;
    }
}
