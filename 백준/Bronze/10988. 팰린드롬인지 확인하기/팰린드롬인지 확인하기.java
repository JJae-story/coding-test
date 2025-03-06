import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    boolean notPalindrome = false;
    int j = s.length() - 1;

    for (int i = 0; i < s.length() / 2; i++, j--) {
      if (s.charAt(i) != s.charAt(j)) {
        notPalindrome = true;
        break;
      }
    }

    if (notPalindrome) {
      System.out.println(0);
    } else {
      System.out.println(1);
    }
  }
}