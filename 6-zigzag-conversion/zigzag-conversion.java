
import java.util.*;

class Solution {

    public String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean goingDown = true;

        for (char ch : s.toCharArray()) {

            rows.get(currentRow).append(ch);

            if (currentRow == 0) {
                goingDown = true;
            }

            if (currentRow == numRows - 1) {
                goingDown = false;
            }

            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder answer = new StringBuilder();

        for (StringBuilder row : rows) {
            answer.append(row);
        }

        return answer.toString();
    }
}
        
    
