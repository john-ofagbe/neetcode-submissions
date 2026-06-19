class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        int[] result = new int[k];

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int n: map.keySet()) {
            minHeap.add(n);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        
        System.out.println(mostFrequentWords(new String[]{"i", "love", "leetcode", "i", "love"}, 2));
        System.out.println(mostFrequentWords(new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"}, 4));
        System.out.println(mostFrequentWords(new String[]{"apple","banana","apple","orange","banana", "banana"}, 2));

        return result;
    }

    public List<String> mostFrequentWords(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        Queue<String> minHeap = new PriorityQueue<>((a, b) -> 
            {
                if (map.get(a) == map.get(b)) {
                    return a.compareTo(b);
                }
                return map.get(a) - map.get(b);
            }
        );

        for (String word: words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word: map.keySet()) {
            minHeap.add(word); 
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        List<String> result = new ArrayList<>();

        while(!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }

        return result;

    }
}
