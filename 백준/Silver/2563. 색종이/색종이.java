import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] arr = new int[100][100];
    int paper = sc.nextInt();
    int sum = 0;

    for (int i = 0; i < paper; i++) {
      int first = sc.nextInt();
      int second = sc.nextInt();

      for (int j = first; j < first + 10; j++) {
        for (int k = second; k < second + 10; k++) {
          if (arr[j][k] == 0) {
            arr[j][k] = 1;
            sum++;
          }
        }
      }
    }

    System.out.println(sum);
  }
}