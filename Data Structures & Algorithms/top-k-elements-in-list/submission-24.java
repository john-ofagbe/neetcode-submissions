class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        int[] result = new int[k];

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num: map.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        System.out.println(topItems(new String[]{"i", "love", "leetcode", "love", "i"}, 2));

        return result;

    }

    public List<String> topItems(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        Queue<String> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (String word: words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word: map.keySet()) {
            minHeap.offer(word);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = k - 1; i >= 0; i--) {
            result.add(minHeap.poll());
        }

        return result;

    }
}
