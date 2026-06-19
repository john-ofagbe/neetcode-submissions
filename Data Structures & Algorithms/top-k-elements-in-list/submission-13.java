class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        int[] result = new int[k];

        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key: map.keySet()) {
            maxHeap.add(key);
        }

        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;


    }
}
