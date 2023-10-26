class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        // Create a HashMap to store the frequency of each word in words array
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String w : words) wordMap.put(w, wordMap.getOrDefault(w, 0) + 1);

        int wordSize = words[0].length();
        int windowSize = words.length * wordSize;
        // Iterate through the string s from index 0 to s.length() - windowSize
        for (int i = 0; i <= s.length() - windowSize; i++) {
            // Create a new HashMap for each window to track word frequencies
            HashMap<String, Integer> map = new HashMap<>(wordMap);
            int left = i; // Initialize left pointer for the window
            int match = 0; // Keep track of matching words in the window

            // Iterate through the window, word by word
            for (int right = i; right <= i + windowSize - wordSize; right += wordSize) {
                // Extract the current word from the window
                String rightWord = s.substring(right, right + wordSize);
                // Check if the word exists in the map
                if (map.containsKey(rightWord)) {
                    map.put(rightWord, map.get(rightWord) - 1); // Decrement frequency
                    // If frequency becomes 0, increment the match count
                    if (map.get(rightWord) == 0) match++;
                }
                // If all words in the window match, add left to the result list and break
                if (match == map.size()) {
                    list.add(left);  break;
                }
            }
        }
        return list;
    }
}