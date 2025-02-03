import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        for (int i = 1; i <= 5; i++) {
	        int score = sc.nextInt();
	        total += score;
        }

        System.out.println(total);
    }
}