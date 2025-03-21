import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int item: arr) {
            if (stack.isEmpty() || stack.peek() != item) {
                stack.push(item);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}