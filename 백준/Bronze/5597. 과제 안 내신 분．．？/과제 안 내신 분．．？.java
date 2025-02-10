import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] submit = new boolean[30];

        for (int i = 1; i <= 28; i++) {
            int n = Integer.parseInt(br.readLine());

            submit[n - 1] = true;
        }

        for (int i = 0; i < submit.length; i++) {
            if (!submit[i]) {
                bw.write(i + 1 + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}