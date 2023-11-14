class Solution {
    public int countPalindromicSubsequence(String s) {
        //store first and last occurence of character.
        int[] first = new int[26];
        int[] last = new int[26];
        int res=0;
        for(int i=0; i<s.length(); i++) {
            char letter = s.charAt(i);
            if(first[letter -'a'] == 0) {
                //i+1; start at 1 so that 0 can be used as not found.
                first[letter -'a'] = i+1;
            }
            if(last[letter -'a'] <= i) {
                last[letter -'a'] = i+1;
            }
        }

        for(int i=0; i<26; i++) {
            //First and last occurences of each char.
            int f = first[i];
            int l = last[i];
    
            if(l -f > 1) {
                //Set used to remove duplicates pallindromes counting.
                Set<Character> uniq = new HashSet();
                f++;
                l--;
                while(l >= f) {
                    uniq.add(s.charAt(f-1));
                    f++;
                }
                res += uniq.size();
            }
        }
        return res;
    }
}