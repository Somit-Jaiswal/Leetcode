public class Solution {
    public int minOperations(String s) {
        int roleNumberOne = 0;
        int roleNumberTwo = 0;
        int n = s.length();

        if (n % 2 == 1) {
            if (s.charAt(n - 1) == '1') roleNumberTwo++;
            else roleNumberOne++;
        }

        for (int i = 0; i < n - 1; i += 2) {
            if (s.charAt(i) != '1' && s.charAt(i + 1) != '0') roleNumberOne += 2;
            if (s.charAt(i) == '1' && s.charAt(i + 1) != '0') roleNumberOne++;
            if (s.charAt(i) != '1' && s.charAt(i + 1) == '0') roleNumberOne++;

            if (s.charAt(i) != '0' && s.charAt(i + 1) != '1') roleNumberTwo += 2;
            if (s.charAt(i) != '0' && s.charAt(i + 1) == '1') roleNumberTwo++;
            if (s.charAt(i) == '0' && s.charAt(i + 1) != '1') roleNumberTwo++;
        }
        return (roleNumberTwo >= roleNumberOne) ? roleNumberOne : roleNumberTwo;
    }
}