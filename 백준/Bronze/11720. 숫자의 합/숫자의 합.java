import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    String input = String.valueOf(br.readLine());

    int output = 0;
    int cnt = 0;
    for (String s : input.split("")) {
      if (cnt == N) {
        break;
      }
      output += Integer.parseInt(s);
      cnt++;
    }

    System.out.println(output);
  }
}