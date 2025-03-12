import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double score = 0;
    double totalScore = 0;

    for (int i = 0; i < 20; i++) {
      String input = sc.nextLine();

      String[] s = input.split(" ");

      double a = Double.parseDouble(s[1]);
      String b = s[2];

      if (b.equals("A+")){
        score += a * 4.5;
        totalScore += a;
      } else if (b.equals("A0")) {
        score += a * 4.0;
        totalScore += a;
      } else if (b.equals("B+")) {
        score += a * 3.5;
        totalScore += a;
      } else if (b.equals("B0")) {
        score += a * 3.0;
        totalScore += a;
      } else if (b.equals("C+")) {
        score += a * 2.5;
        totalScore += a;
      } else if (b.equals("C0")) {
        score += a * 2.0;
        totalScore += a;
      } else if (b.equals("D+")) {
        score += a * 1.5;
        totalScore += a;
      } else if (b.equals("D0")) {
        score += a * 1.0;
        totalScore += a;
      } else if (b.equals("F")) {
        score += a * 0.0;
        totalScore += a;
      }
    }

    System.out.printf("%.6f", score / totalScore);
  }
}