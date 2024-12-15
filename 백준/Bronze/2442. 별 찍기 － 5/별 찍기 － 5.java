import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 별의 개수 입력 받기 ( 1 ~ 100 )
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
            // 공백 찍기
			for (int j = 1; j <= N - i; j++) {
			    System.out.print(" ");
            }
            // 별 찍기
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
		}
        sc.close();
	}
}