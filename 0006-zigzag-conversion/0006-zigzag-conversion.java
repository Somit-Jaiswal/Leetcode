class Solution {
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int i = 0;
        int flag = -1;
        for (char ch : s.toCharArray()) {
            rows.get(i).append(ch);
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }

            i += flag;
        }
        
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }

        return res.toString();
    }
}