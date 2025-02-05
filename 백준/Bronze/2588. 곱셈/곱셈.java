import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int[] result = new int[4];
        result[3] = num1 * num2;

        for (int i = 0; i < 3; i++) {
            int tmp = num2 % 10;
            result[i] = num1 * tmp;
            num2 /= 10;
        }

        for (int a : result) {
            System.out.println(a);
        }
    }
}