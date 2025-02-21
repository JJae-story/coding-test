import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer st = new StringTokenizer(br.readLine()," ");

      int num1 = Integer.parseInt(st.nextToken());
      int num2 = Integer.parseInt(st.nextToken());

      int reverse1 = 0;
      int reverse2 = 0;

      while (num1 != 0) {
        int tmp = num1 % 10;
        reverse1 = reverse1 * 10 + tmp;
        num1 /= 10;

        int tmp2 = num2 % 10;
        reverse2 = reverse2 * 10 + tmp2;
        num2 /= 10;
      }

      if (reverse1 > reverse2) {
        System.out.println(reverse1);
      } else {
        System.out.println(reverse2);
      }
  }
}