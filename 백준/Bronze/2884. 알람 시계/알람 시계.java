import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M - 45 < 0) {
            if (H == 0) {
                H = 23;
                M = 60 - (45 - M);
            } else {
                H -= 1;
                M = 60 - (45 - M);
            }
        } else {
            M -= 45;
        }

        System.out.println(H + " " + M);
    }
}