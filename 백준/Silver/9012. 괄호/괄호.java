import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // 테스트 케이스 수
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();    // 한 줄의 괄호 문자열
            Stack<Character> stack = new Stack<>();
            boolean match = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);

                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        match = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) {
                match = false;
            }
            System.out.println(match ? "YES" : "NO");
        }
        sc.close();
    }
}