import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = {1, 1, 2, 2, 2, 8};
    int[] result = new int[6];

    for (int i = 0; i < result.length; i++) {
      int cnt = sc.nextInt();

      if (arr[i] == cnt) {
        result[i] = 0;
      } else {
        result[i] = arr[i] - cnt;
      }
    }

    for (int a : result) {
      System.out.print(a + " ");
    }
  }
}