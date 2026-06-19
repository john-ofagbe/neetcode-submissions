class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //1. create a hashmap
        //2. iterate thru nums
        //3. add num into hashmap, on duplicate key, increment value 
        //** hashmap should now have key/value pair -> num/freq
        //4. create a priority queue -> ordered by map value natural order
        //5. iterate through the hashmap keySet
        //6. add item to priority queue
        //7. if queue size is greater than k, remove the first item (smallest) by calling poll() [ok]
        //8. create an integer array of num with size k
        //9, populate the array by iterating through the priority queue from the highest to lowest 

        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(map.get(a), map.get(b)));

        for (int i: map.keySet()) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println("pq size: " + pq.size());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        System.out.println(map);

        return result;
    }
}
