import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int result = 0;

    String N = sc.next();
    int B = sc.nextInt();

    for (int i = 0; i < N.length(); i++) {
      if ('0' <= N.charAt(i) && '9' >= N.charAt(i)) {
        result = result * B + (N.charAt(i) - '0');
      } else {
        result = result * B + (N.charAt(i) - 'A' + 10);
      }
    }
    System.out.println(result);
  }
}