import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int count = N;

    for (int i = 0; i < N; i++) {
      String s = sc.next();

      for (int j = 1; j < s.length(); j++) {
        if (s.indexOf(s.charAt(j - 1)) > s.indexOf(s.charAt(j))) {
          count--;
          break;
        }
      }
    }

    System.out.println(count);
  }
}