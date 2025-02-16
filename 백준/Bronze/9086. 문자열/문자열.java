import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();

            if (s.length() == 1) {
                bw.write(s + s);
            } else {
                for (int j = 0; j < s.length(); j++) {
                    if (j == 0 || j == s.length() - 1) {
                        bw.write(s.charAt(j));
                    }
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}