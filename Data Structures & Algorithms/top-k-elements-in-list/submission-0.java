

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        
        // 1. Fill the frequency map (Fixed logic)
        for (int x : nums) {
            // Using getOrDefault makes this much cleaner!
            arr.put(x, arr.getOrDefault(x, 0) + 1);
        }
        
        // 2. Convert HashMap into a 2D int[][] array
        int[][] freqArray = new int[arr.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : arr.entrySet()) {
            freqArray[index][0] = entry.getKey();   // [0] holds the number (Key)
            freqArray[index][1] = entry.getValue(); // [1] holds the count (Value)
            index++;
        }
        
        // 3. Sort the 2D array by frequency (index 1) in descending order
        Arrays.sort(freqArray, (a, b) -> b[1] - a[1]);
        
        // 4. Extract the top K keys into the final primitive int[] array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = freqArray[i][0];
        }
        
        return result;
    }
}
