public class Solution {
public int countVowelPermutation(int n) {
int MOD = 1000000007;

    // Create a 2D DP array where dp[i][j] represents the count of strings of length 'i' ending with vowel 'j'.
    long[][] dp = new long[n + 1][5];
    
    // Initialize the DP array for strings of length 1.
    for (int j = 0; j < 5; j++) {
        dp[1][j] = 1;
    }
    
    // Fill in the DP array for strings of length 2 to 'n'.
    for (int i = 2; i <= n; i++) {
        dp[i][0] = (dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][4]) % MOD; // 'a' can be followed by 'e', 'i', or 'u'
        dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD; // 'e' can be followed by 'a' or 'i'
        dp[i][2] = (dp[i - 1][1] + dp[i - 1][3]) % MOD; // 'i' can be followed by 'e' or 'o'
        dp[i][3] = dp[i - 1][2]; // 'o' can only be followed by 'i'
        dp[i][4] = (dp[i - 1][2] + dp[i - 1][3]) % MOD; // 'u' can be followed by 'i' or 'o'
    }
    
    // Calculate the total count for strings of length 'n'.
    long totalCount = 0;
    for (int j = 0; j < 5; j++) {
        totalCount = (totalCount + dp[n][j]) % MOD;
    }
    
    return (int) totalCount;
}

public static void main(String[] args) {
    int n = 5;
    Solution solution = new Solution();
    int result = solution.countVowelPermutation(n);
    System.out.println("Output: " + result); // Output: 68
}
}