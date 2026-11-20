class leetcode10 {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        // dp[i][j] represents if s[0...i-1] matches p[0...j-1]
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        // Handle patterns like a*, a*b*, or .* matching an empty string
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                if (pc == '.' || pc == sc) {
                    // Direct character match or '.' wildcard
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    // Case 1: '*' matches 0 of the preceding element
                    dp[i][j] = dp[i][j - 2];

                    // Case 2: '*' matches 1 or more of the preceding element
                    char prevP = p.charAt(j - 2);
                    if (prevP == '.' || prevP == sc) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }

        return dp[m][n];
    }
}
