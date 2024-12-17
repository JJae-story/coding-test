import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        
        StringBuilder output = new StringBuilder();
        
        // 윗부분 (1부터 N까지)
        for (int i = 1; i <= N; i++) {
            // 왼쪽 별
            for (int j = 1; j <= i; j++) {
                output.append("*");
            }
            // 공백
            for (int j = 1; j <= (N - i) * 2; j++) {
                output.append(" ");
            }
            // 오른쪽 별
            for (int j = 1; j <= i; j++) {
                output.append("*");
            }
            output.append("\n");
        }
        // 아랫부분 (N-1부터 1까지)
        for (int i = N - 1; i >= 1; i--) {
            // 왼쪽 별
            for (int j = 1; j <= i; j++) {
                output.append("*");
            }
            // 공백
            for (int j = 1; j <= (N - i) * 2; j++) {
                output.append(" ");
            }
            // 오른쪽 별
            for (int j = 1; j <= i; j++) {
                output.append("*");
            }
            output.append("\n");
        }
        System.out.println(output);
    }
}