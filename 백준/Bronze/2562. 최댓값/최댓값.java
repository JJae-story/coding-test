import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxNum = 0;
        int idx = 0;

        for (int i = 1; i <= 9; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n > maxNum) {
                maxNum = n;
                idx = i;
            }
        }
        System.out.println(maxNum);
        System.out.println(idx);
    }
}