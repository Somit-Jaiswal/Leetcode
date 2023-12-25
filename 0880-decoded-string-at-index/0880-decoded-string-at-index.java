class Solution {
    public String decodeAtIndex(String s, int k) {
        long cnt_length = 0;
        int j=0;

        // Counting the Total Length of the String until the LENGTH of the String won't Exceed the length of the KEY(TO_BE_OUTPUTED)
        while(cnt_length < k){
            if(Character.isDigit(s.charAt(j))) { // IF DIGITS THEN MULITY THE LENGTH BY DIGIT
            cnt_length *= (s.charAt(j)-'0');
            }
            else { // IF IT's NOT DIGITS THEN INCREASE THE "length" COUNT
            cnt_length++;
            }
            j++;
        }

        //Traversal throgth the String from the Back.......
        for(int i=j-1; i>=0; i--){
            if(Character.isDigit(s.charAt(i))){ //IF DIGIT THEN DIVIDE THE LENGTH_CNT BY DIGIT
                cnt_length /= (s.charAt(i)-'0');
                k %= cnt_length; //REDUCE THE GIVEN key BY CNT_LENGTH.....
            } 
            else{ 
                // if not the digit then check the conditions and return the output
                if(k==0 || k==cnt_length){
                return Character.toString(s.charAt(i));
                }
                cnt_length--;
            }
        }

        return "";
    }
}