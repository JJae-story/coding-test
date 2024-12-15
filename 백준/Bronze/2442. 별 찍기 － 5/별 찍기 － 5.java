import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            // 공백 추가
            for (int j = 1; j <= N - i; j++) {
                output.append(" ");
            }
            // 별 추가
            for (int k = 1; k <= 2 * i - 1; k++) {
                output.append("*");
            }
            // 줄 바꿈
            output.append("\n");
        }
        System.out.print(output);
    }
}