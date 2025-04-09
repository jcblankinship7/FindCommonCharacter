class Solution {
    public List<String> commonChars(String[] words) {
         List<String> results = new ArrayList<>();
         int[] alphabet = new int[26];
        
         Arrays.fill(alphabet, Integer.MAX_VALUE);
         String allLetters = null;
         for(String w : words) {
             int[] fq = new int[26];
             for(char c : w.toCharArray()) {
                 fq[c-'a']++;
             }
                
             for(int i = 0; i < 26; i++) {
                 alphabet[i] = Math.min(alphabet[i], fq[i]);
             }
         }
            
         for(int i = 0; i < 26; i++) {
             while(alphabet[i]> 0) {
                 results.add("" + (char)(i + 'a'));
                 alphabet[i]--;
             }
         }
         return results;
    }
}
