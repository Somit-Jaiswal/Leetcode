class Solution {
int MOD = 1_000_000_007;
public int countHomogenous(String s) {
char prev ='X';
int count=1;
int res=0;

    for(char ch:s.toCharArray()){
        if(ch != prev){
            count=1;
            prev = ch;
        }

        res = (res + count)%MOD;
        count++;
    }

    return res;
}
}