import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        int cnt = 1;

        for (char c : S.toCharArray()) {
            if (cnt == i) {
                System.out.println(c);
            }
            cnt++;
        }
    }
}