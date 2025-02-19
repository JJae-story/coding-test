import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());

    StringTokenizer st;

    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine(), " ");

      int R = Integer.parseInt(st.nextToken());
      String S = st.nextToken();

      for (String s : S.split("")) {
        for (int j = 0; j < R; j++) {
          System.out.print(s);
        }
      }
      System.out.println();
    }
  }
}