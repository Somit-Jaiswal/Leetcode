class Solution {
  
  int res = 0;
  public int totalNQueens(int n) {
    if (n <= 0) { return 0; } 
    // build chessboard @mat(=matrix)
    char[][] mat = new char[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        mat[i][j] = '.';
      }
    }
    helper(mat, 0);
    return res;
  }
  private void helper(char[][] mat, int row) {
    // reach solution
    if (row == mat.length) {
      res++;
      return;
    }
    for (int i = 0; i < mat.length; i++) {
      // try
      mat[row][i] = 'Q';
      // if possible
      if (isValid(mat, row, i)) {
        helper(mat, row + 1);
      }
      // un-try
      mat[row][i] = '.';
    }
    return;
  }
  private boolean isValid(char[][] mat, int x, int y) {
    // only check rows above current one
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < mat.length; j++) {
        // not need to check current position
        if (i == x && j == y) { 
          continue;
        }
        // if 'Q' in the same col or the diagonal line, return false
        if ((j == y || Math.abs(x - i) == Math.abs(y - j)) && mat[i][j] == 'Q') {
          return false;
        } 
      }
    }
    return true;
  }
}
     
 