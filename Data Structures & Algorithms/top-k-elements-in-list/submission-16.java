class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        int[] result = new int[k];

        //populate map
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num: map.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        //populate result
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;

    }
}
